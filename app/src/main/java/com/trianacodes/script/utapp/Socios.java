package com.trianacodes.script.utapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class Socios extends AppCompatActivity {

    private String CargosArray [] = {"Presidente", "Vicepresidente", "Tesorero", "Secretario", "Vocal"};
    private Spinner SeleccionCargos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_socios);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setIcon(R.mipmap.ic_launcher);

        SeleccionCargos = findViewById(R.id.sp_cargoSocio);

        ArrayAdapter<String> adaptador_Cargos = new ArrayAdapter<String>(this,
                R.layout.spinner_item_utapp_cargos ,CargosArray);
        SeleccionCargos.setAdapter(adaptador_Cargos);

    }

    public boolean onCreateOptionsMenu(Menu menu){

        getMenuInflater().inflate(R.menu.menu_general, menu);
        return true;

    }

    public boolean onOptionsItemSelected(MenuItem item){

        int opciones = item.getItemId();

        switch (opciones){
            case R.id.Opcion1:
                Toast.makeText(this,"Configura todo lo que quieras",Toast.LENGTH_LONG).show();
        }

        return super.onOptionsItemSelected(item);

    }


}
