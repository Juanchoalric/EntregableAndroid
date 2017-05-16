package com.example.juancho.entregableandroid;

import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class DetalleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle);

        Intent intentQueMellamo = getIntent();




        //Pedir el fragment Manager
        FragmentManager fragmentManager = getSupportFragmentManager();

        //Comenzar una transaccion
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        //Crear el fragment
        DetalleFragment detalleFragment = new DetalleFragment();

        //Ponerlo en el layout
        fragmentTransaction.replace(R.id.contenedor_fragment_detalle,detalleFragment);

        //Aca es cuando le paso el bundle que le llega a la actividad al fragment.
        detalleFragment.setArguments(intentQueMellamo.getExtras());

        fragmentTransaction.commit();
    }
}
