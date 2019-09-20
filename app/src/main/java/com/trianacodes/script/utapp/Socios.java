package com.trianacodes.script.utapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

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

}
