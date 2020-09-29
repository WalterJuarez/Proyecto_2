package Model;

public class Empresa extends Clientes{
    private String contacto;
    private int descuento = 10;

    public Empresa(String contacto, String nombre, String nit, String direccion, String tipoUsuario) {
        super(nombre, nit, direccion, tipoUsuario);
        this.contacto = contacto;
    }
}
