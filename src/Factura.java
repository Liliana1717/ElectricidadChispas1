import java.util.ArrayList;

public class Factura{
    private String codigoFactura;
    private String nifCliente;
private String Cif;
    private String nombreCliente;
    private String direccionCliente;
    private String poblacionCliente;
    private String provinciaCliente;
    private String fechaFactura;
    private String baseImponible;
    private String total;
ArrayList<Producto>productos;
ArrayList<Servicios>servicios;
    public String getCodigoFactura() {
        return codigoFactura;
    }

    public void setCodigoFactura(String codigoFactura) {
        this.codigoFactura = codigoFactura;
    }


    public String getNifCliente() {
        return nifCliente;
    }

    public void setNifCliente(String nifCliente) {
        this.nifCliente = nifCliente;
    }

    public String getCif() {
        return Cif;
    }

    public void setCif(String cif) {
        Cif = cif;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getDireccionCliente() {
        return direccionCliente;
    }

    public void setDireccionCliente(String direccionCliente) {
        this.direccionCliente = direccionCliente;
    }

    public String getPoblacionCliente() {
        return poblacionCliente;
    }

    public void setPoblacionCliente(String poblacionCliente) {
        this.poblacionCliente = poblacionCliente;
    }

    public String getProvinciaCliente() {
        return provinciaCliente;
    }

    public void setProvinciaCliente(String provinciaCliente) {
        this.provinciaCliente = provinciaCliente;
    }

    public String getFechaFactura() {
        return fechaFactura;
    }

    public void setFechaFactura(String fechaFactura) {
        this.fechaFactura = fechaFactura;
    }

    public String getBaseImponible() {
        return baseImponible;
    }

    public void setBaseImponible(String baseImponible) {
        this.baseImponible = baseImponible;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
    }

    public ArrayList<Servicios> getServicios() {
        return servicios;
    }

    public void setServicios(ArrayList<Servicios> servicios) {
        this.servicios = servicios;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;


    }
}


