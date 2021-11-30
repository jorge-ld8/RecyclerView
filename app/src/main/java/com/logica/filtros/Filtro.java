package com.logica.filtros;

import com.logica.Producto.Producto;

public abstract class Filtro {
    private int id;

    public Filtro(int id){
        this.id = id;
    }

    public int getId(){
        return id;
    }

    public abstract boolean filtrar (Producto producto);
}
