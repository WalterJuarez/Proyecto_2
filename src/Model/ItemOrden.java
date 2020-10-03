package Model;

public class ItemOrden {
    private int noLnea = 1;
    int cantidad;
    Producto producto;

    public ItemOrden(int cantidad, Producto producto) {
        this.noLnea = noLnea++;
        this.cantidad = cantidad;
        this.producto = producto;
    }
}
