package com.logica.Producto;

import android.os.Parcel;

public class Producto {
    private String nombre;
    private int cantidad;
    private double precio;
    private String descripcion;
    private String ubicImg;
    private boolean precioVisible;
    private String userID;

    public Producto(){
        nombre="n/a";
        cantidad=1;
        precio=1;
        descripcion="n/a";
        ubicImg="n/a";
        precioVisible=false;
        userID="n/a";
    }

    public Producto(String nombre, int cantidad, double precio, String descripcion
    , String ubicImg, boolean visible, String userID) {
        this.nombre=nombre;
        this.cantidad=cantidad;
        this.precio=precio;
        this.descripcion=descripcion;
        this.ubicImg=ubicImg;
        precioVisible=visible;
        this.userID=userID;

    }

    protected Producto(Parcel in) {
        nombre = in.readString();
        cantidad = in.readInt();
        precio = in.readDouble();
        descripcion = in.readString();
        ubicImg = in.readString();
        precioVisible = in.readByte() != 0;
        userID = in.readString();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getUbicImg() {
        return ubicImg;
    }

    public void setUbicImg(String ubicImg) {
        this.ubicImg = ubicImg;
    }

    public boolean isPrecioVisible() {
        return precioVisible;
    }

    public void setPrecioVisible(boolean precioVisible) {
        this.precioVisible = precioVisible;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", cantidad=" + cantidad +
                ", precio=" + precio +
                ", descripcion='" + descripcion + '\'' +
                ", ubicImg='" + ubicImg + '\'' +
                ", precioVisible=" + precioVisible +
                ", userID='" + userID + '\'' +
                '}';
    }
}
