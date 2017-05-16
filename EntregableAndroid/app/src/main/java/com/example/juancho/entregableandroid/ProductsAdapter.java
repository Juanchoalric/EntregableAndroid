package com.example.juancho.entregableandroid;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by juancho on 10/05/17.
 */

public class ProductsAdapter extends BaseAdapter{
    private Context context;
    private List<Producto> productos;

    public ProductsAdapter(Context context, List<Producto> productos) {
        this.context = context;
        this.productos = productos;
    }

    @Override
    public int getCount() {
        return productos.size();
    }

    @Override
    public Producto getItem(int position) {
        return productos.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = LayoutInflater.from(context);
        convertView = inflater.inflate(R.layout.detalle_articulo, parent,false);

        ImageView imageProduct = (ImageView) convertView.findViewById(R.id.image_product);
        ImageView imageDelivery = (ImageView) convertView.findViewById(R.id.delivery_product);
        TextView textViewDescripcionProducto = (TextView) convertView.findViewById(R.id.description_product);
        TextView textViewTitleProduct = (TextView) convertView.findViewById(R.id.title_product);
        TextView textViewPriceProduct = (TextView) convertView.findViewById(R.id.price_product);

        Producto product = getItem(position);

        imageProduct.setImageResource(product.getImageProduct());
        imageDelivery.setImageResource(product.getIconDelivery());
        textViewPriceProduct.setText("$" + product.getPriceProduct());
        textViewDescripcionProducto.setText(product.getDescription());
        textViewTitleProduct.setText(product.getTitleProduct());

        return convertView;
    }
}
