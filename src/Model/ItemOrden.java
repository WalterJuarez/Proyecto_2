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

    public int getNoLnea() {
        return noLnea;
    }

    public void setNoLnea(int noLnea) {
        this.noLnea = noLnea;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }
}
