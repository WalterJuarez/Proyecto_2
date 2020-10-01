package Model;

import java.util.Date;

public class Orden {
    private static int siglOrden = 1;
    private int id;
    private Clientes cliente;
    private ItemOrden item1;
    private ItemOrden item2;
    private Date fechaOrden;
    private Double precioEnvio;
    private Double Total;
    private String tipoEnvio;
    private String estado;
    private int diasEnvio;

    public Orden() {
    }

    public Orden(Clientes cliente, ItemOrden item1, ItemOrden item2, Date fechaOrden, Double precioEnvio, Double total, String tipoEnvio, String estado, int diasEnvio) {
        this.id = siglOrden++;
        this.cliente = cliente;
        this.item1 = item1;
        this.item2 = item2;
        this.fechaOrden = fechaOrden;
        this.precioEnvio = precioEnvio;
        Total = total;
        this.tipoEnvio = tipoEnvio;
        this.estado = estado;
        this.diasEnvio = diasEnvio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Clientes getCliente() {
        return cliente;
    }

    public void setCliente(Clientes cliente) {
        this.cliente = cliente;
    }

    public ItemOrden getItem1() {
        return item1;
    }

    public void setItem1(ItemOrden item1) {
        this.item1 = item1;
    }

    public ItemOrden getItem2() {
        return item2;
    }

    public void setItem2(ItemOrden item2) {
        this.item2 = item2;
    }

    public Date getFechaOrden() {
        return fechaOrden;
    }

    public void setFechaOrden(Date fechaOrden) {
        this.fechaOrden = fechaOrden;
    }

    public Double getPrecioEnvio() {
        return precioEnvio;
    }

    public void setPrecioEnvio(Double precioEnvio) {
        this.precioEnvio = precioEnvio;
    }

    public Double getTotal() {
        return Total;
    }

    public void setTotal(Double total) {
        Total = total;
    }

    public String getTipoEnvio() {
        return tipoEnvio;
    }

    public void setTipoEnvio(String tipoEnvio) {
        this.tipoEnvio = tipoEnvio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getDiasEnvio() {
        return diasEnvio;
    }

    public void setDiasEnvio(int diasEnvio) {
        this.diasEnvio = diasEnvio;
    }
}
