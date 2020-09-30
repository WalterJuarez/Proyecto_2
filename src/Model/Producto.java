package Model;

public class Producto {

    private static int siglProducto = 2000;
    private int id;
    private String nombreProducto;
    private double precio;
    private int existencia;

    public Producto(int id) {

    }

    public Producto(String nombreProducto, double precio, int existencia) {
        this.id = siglProducto++;
        this.nombreProducto = nombreProducto;
        this.precio = precio;
        this.existencia = existencia;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getExistencia() {
        return existencia;
    }

    public void setExistencia(int existencia) {
        this.existencia = existencia;
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

}
