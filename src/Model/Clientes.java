package Model;

public class Clientes {
    String nombre;
    String nit;
    String direccion;
    String tipoUsuario;

    public Clientes() {
    }

    public Clientes(String nombre, String nit, String direccion, String tipoUsuario) {
        this.nombre = nombre;
        this.nit = nit;
        this.direccion = direccion;
        this.tipoUsuario = tipoUsuario;
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
    public String toString() {
        return "Clientes{" +
                "nombre='" + nombre + '\'' +
                ", nit='" + nit + '\'' +
                ", direccion='" + direccion + '\'' +
                ", tipoUsuario='" + tipoUsuario + '\'' +
                '}';
    }
}
