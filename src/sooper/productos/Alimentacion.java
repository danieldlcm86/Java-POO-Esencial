package sooper.productos;

import sooper.IProducto;
import sooper.enums.Categoria;

public class Alimentacion extends Producto {
    public Alimentacion(String referencia, int peso, int volumen) {
        super(referencia, peso, volumen);
    }

    @Override
    public Categoria getCategoria() {
        return Categoria.ALIMENTACION;
    }

    @Override
    public boolean esCompatible(IProducto producto) {
        return Categoria.ALIMENTACION.equals(producto.getCategoria());
    }
}
