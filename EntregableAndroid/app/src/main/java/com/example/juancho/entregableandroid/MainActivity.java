package com.example.juancho.entregableandroid;

import android.content.Intent;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements ListviewFragment.InformableDeProducto{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cargarFragmentLista();

    }

    public void cargarFragmentLista(){

        //Pedir el fragment Manager
        FragmentManager fragmentManager = getSupportFragmentManager();

        //Comenzar una transaccion
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        //Crear el fragment
        ListviewFragment listviewFragment = new ListviewFragment();




        //Ponerlo en el layout
        fragmentTransaction.replace(R.id.contenedor_fragment_main_activity,listviewFragment);

        //Commit
        fragmentTransaction.commit();
    }

    @Override
    public void productoSelecionado(Producto unProducto) {

        //Un intent
        Intent unIntent = new Intent(this, DetalleActivity.class);

        Bundle unBundle = new Bundle();
        unBundle.putString(DetalleFragment.DESCRIPTION_PRODUCT,unProducto.getDescription());
        unBundle.putString(DetalleFragment.PRICE_PRODUCT,unProducto.getPriceProduct());
        unBundle.putString(DetalleFragment.TITLE_PRODUCT,unProducto.getTitleProduct());
        unBundle.putInt(DetalleFragment.IMAGE_PRODUCT,unProducto.getImageProduct());


        unIntent.putExtras(unBundle);

        startActivity(unIntent);
    }
}
