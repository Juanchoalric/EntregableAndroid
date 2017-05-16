package com.example.juancho.entregableandroid;

/**
 * Created by juancho on 10/05/17.
 */

public class Producto {
    private String titleProduct;
    private String priceProduct;
    private String description;
    private int imageProduct;
    private int iconDelivery;

    public Producto(String titleProduct, String priceProduct, String description, int imageProduct, int iconDelivery) {
        this.titleProduct = titleProduct;
        this.priceProduct = priceProduct;
        this.description = description;
        this.imageProduct = imageProduct;
        this.iconDelivery = iconDelivery;
    }

    public String getTitleProduct() {
        return titleProduct;
    }

    public String getPriceProduct() {
        return priceProduct;
    }

    public String getDescription() {
        return description;
    }

    public int getImageProduct() {
        return imageProduct;
    }

    public int getIconDelivery() {
        return iconDelivery;
    }

}
