package Model;

import java.util.Objects;

public class Clientes {
    private static int sigldCliente = 1;
    private int id ;
    private String nombre;
    private String nit;
    private String direccion;
    private String tipoUsuario;

    public Clientes(int id) {

    }

    public Clientes(String nombre, String nit, String direccion, String tipoUsuario) {
        this.id = sigldCliente++;
        this.nombre = nombre;
        this.nit = nit;
        this.direccion = direccion;
        this.tipoUsuario = tipoUsuario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Clientes clientes = (Clientes) o;
        return id == clientes.id &&
                nombre.equals( clientes.nombre ) &&
                nit.equals( clientes.nit ) &&
                direccion.equals( clientes.direccion ) &&
                tipoUsuario.equals( clientes.tipoUsuario );
    }

    @Override
    public int hashCode() {
        return Objects.hash( id, nombre, nit, direccion, tipoUsuario );
    }

    @Override
    public String toString() {
        return "Clientes{ " +id +
                " nombre='" + nombre + '\'' +
                ", nit='" + nit + '\'' +
                ", direccion='" + direccion + '\'' +
                ", tipoUsuario='" + tipoUsuario + '\'' +
                '}';
    }
}
