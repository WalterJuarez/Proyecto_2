package Model;

public class Individual extends Clientes  {

    private String dpi;

    public Individual(String dpi, String nombre, String nit, String direccion, String tipoUsuario) {
        super(nombre, nit, direccion, tipoUsuario);
        this.dpi = dpi;
    }
}
