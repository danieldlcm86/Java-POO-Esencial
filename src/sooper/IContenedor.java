package sooper;

import sooper.enums.TipoContenedor;

import java.util.Set;

public interface IContenedor {
    String getReferencia();
    int getVolumen();
    int getSuperficie();
    int volumenDisponible();
    int getResistencia();
    TipoContenedor getTipo();
    Set<IProducto> getProductos();

    boolean meter(IProducto producto);
    boolean resiste(IProducto producto);
}
