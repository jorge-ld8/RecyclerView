package com.logica.filtros;

import com.logica.Producto.Producto;

public class FiltroPrecioVisible extends Filtro{
    public FiltroPrecioVisible(int id){
        super(id);
    }

    @Override
    public boolean filtrar(Producto producto) {
        return producto.isPrecioVisible();
    }
}
