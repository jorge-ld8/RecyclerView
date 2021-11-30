package com.logica.filtros;

import com.logica.Producto.Producto;

public class FiltroImagenVisible extends Filtro{

    public FiltroImagenVisible(int id){
        super(id);
    }

    @Override
    public boolean filtrar(Producto producto) {
        return producto.getUbicImg().contains(".jpg");
    }
}
