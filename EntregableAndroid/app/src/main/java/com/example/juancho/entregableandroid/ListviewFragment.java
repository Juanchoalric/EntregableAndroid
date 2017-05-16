package com.example.juancho.entregableandroid;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import static android.R.attr.y;


/**
 * A simple {@link Fragment} subclass.
 */
public class ListviewFragment extends Fragment {

    private ListView listView;
    private List<Producto> products;
    private ProductsAdapter productsAdapter;
    private InformableDeProducto unInformable;

    public ListviewFragment() {
        // Required empty public constructor
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        unInformable = (InformableDeProducto) context;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_listview, container, false);

        chargeProducts();

        listView = (ListView) view.findViewById(R.id.list_item);

        listView.setDivider(null);
        listView.setDividerHeight(0);

        productsAdapter = new ProductsAdapter(getActivity(), products);

        listView.setAdapter(productsAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Producto product = (Producto) parent.getItemAtPosition(position);
                unInformable.productoSelecionado(product);

            }
        });

        return view;
    }

    private List<Producto> chargeProducts(){
        products = new ArrayList<>();

        products.add(new Producto("Camara kodak", "1300", "Es la mejor camara del mundo, super recomendable y barata, comprala ya", R.drawable.camara_kodak, R.drawable.ic_favorite_black_24dp));
        products.add(new Producto("Camara kodak", "1300", "Es la mejor camara del mundo, super recomendable y barata, comprala ya", R.drawable.cuchillo_usado, R.drawable.ic_favorite_black_24dp));
        products.add(new Producto("Camara kodak", "1300", "Es la mejor camara del mundo, super recomendable y barata, comprala ya", R.drawable.camara_kodak, R.drawable.ic_favorite_black_24dp));
        products.add(new Producto("Camara kodak", "1300", "Es la mejor camara del mundo, super recomendable y barata, comprala ya", R.drawable.camara_kodak, R.drawable.ic_favorite_black_24dp));
        products.add(new Producto("Camara kodak", "1300", "Es la mejor camara del mundo, super recomendable y barata, comprala ya", R.drawable.camara_kodak, R.drawable.ic_favorite_black_24dp));
        products.add(new Producto("Camara kodak", "1300", "Es la mejor camara del mundo, super recomendable y barata, comprala ya", R.drawable.camara_kodak, R.drawable.ic_favorite_black_24dp));
        products.add(new Producto("Camara kodak", "1300", "Es la mejor camara del mundo, super recomendable y barata, comprala ya", R.drawable.camara_kodak, R.drawable.ic_favorite_black_24dp));
        products.add(new Producto("Camara kodak", "1300", "Es la mejor camara del mundo, super recomendable y barata, comprala ya", R.drawable.camara_kodak, R.drawable.ic_favorite_black_24dp));
        products.add(new Producto("Camara kodak", "1300", "Es la mejor camara del mundo, super recomendable y barata, comprala ya", R.drawable.camara_kodak, R.drawable.ic_favorite_black_24dp));
        products.add(new Producto("Camara kodak", "1300", "Es la mejor camara del mundo, super recomendable y barata, comprala ya", R.drawable.camara_kodak, R.drawable.ic_favorite_black_24dp));
        products.add(new Producto("Camara kodak", "1300", "Es la mejor camara del mundo, super recomendable y barata, comprala ya", R.drawable.camara_kodak, R.drawable.ic_favorite_black_24dp));
        products.add(new Producto("Camara kodak", "1300", "Es la mejor camara del mundo, super recomendable y barata, comprala ya", R.drawable.camara_kodak, R.drawable.ic_favorite_black_24dp));
        products.add(new Producto("Camara kodak", "1300", "Es la mejor camara del mundo, super recomendable y barata, comprala ya", R.drawable.camara_kodak, R.drawable.ic_favorite_black_24dp));
        products.add(new Producto("Camara kodak", "1300", "Es la mejor camara del mundo, super recomendable y barata, comprala ya", R.drawable.camara_kodak, R.drawable.ic_favorite_black_24dp));
        products.add(new Producto("Camara kodak", "1300", "Es la mejor camara del mundo, super recomendable y barata, comprala ya", R.drawable.camara_kodak, R.drawable.ic_favorite_black_24dp));
        products.add(new Producto("Camara kodak", "1300", "Es la mejor camara del mundo, super recomendable y barata, comprala ya", R.drawable.camara_kodak, R.drawable.ic_favorite_black_24dp));

        return products;
    }

    public interface InformableDeProducto{
        public void productoSelecionado(Producto unProducto);

    }

}
