package Model;

public class Producto {
<<<<<<< HEAD
    private static int siglProducto = 2000;
    private int id;
    private String nombreProducto;
    private double precio;

    public Producto(int id) {
        this.id = siglProducto++;
    }

    public Producto(String nombreProducto, double precio) {
        this.nombreProducto = nombreProducto;
        this.precio = precio;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "[Producto]" +
                "id= " + id +
                ", nombreProducto='" + nombreProducto + '\'' +
                ", precio= Q." + precio;
    }
=======
>>>>>>> 0fc492c829b2dd3b1ddf4fcf651253e2e45a5107
}
