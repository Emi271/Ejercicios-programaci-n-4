package com.sisinventario.sisinventario.Inventario;

import com.sisinventario.sisinventario.Producto.Producto;
import java.util.List;
import java.util.ArrayList;

public class Inventario {
    private List<Producto> productos = new ArrayList<>();

    public void agregarProducto(Producto p) {
        productos.add(p);
    }
    
    public int consultarTotalHistorico() {
        return Producto.getTotalProductosRegistrados();
    }
}
