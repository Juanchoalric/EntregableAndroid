package com.example.juancho.entregableandroid;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class DetalleFragment extends Fragment {

    public final static String DESCRIPTION_PRODUCT = "Description of the product";
    public final static String PRICE_PRODUCT = "Price of the product";
    public final static String TITLE_PRODUCT = "title of the product";
    public final static String IMAGE_PRODUCT = "image of the product";

    private TextView tituloDetalleProducto;
    private TextView precioDetalleProducto;
    private TextView descripcionDetalleProducto;
    private ImageView imagenDetalleProducto;


    public DetalleFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_detalle, container, false);

        tituloDetalleProducto = (TextView) view.findViewById(R.id.titulo_detalle_producto);
        precioDetalleProducto = (TextView) view.findViewById(R.id.precio_detalle_producto);
        descripcionDetalleProducto = (TextView) view.findViewById(R.id.descripcion_detalle_producto);
        imagenDetalleProducto = (ImageView) view.findViewById(R.id.imagen_detalle_producto);

        Bundle bundle = getArguments();

        String title = bundle.getString(TITLE_PRODUCT);
        String description = bundle.getString(DESCRIPTION_PRODUCT);
        String price= bundle.getString(PRICE_PRODUCT);
        int imagen = bundle.getInt(IMAGE_PRODUCT);

        tituloDetalleProducto.setText(title);
        precioDetalleProducto.setText(price);
        descripcionDetalleProducto.setText(description);
        imagenDetalleProducto.setImageResource(imagen);

        return view;
    }

}
