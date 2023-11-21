import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args){
        Autonomo at = new Autonomo();
          at.setCodigoCliente("339T");
          at.setNombre("Juan");
          at.setApellidos("Calabaza pereira");
          at.setDni("777989C");
          at.setEmail(" juancp@gmail.com");
          at.setDireccionPostal("00552");
          at.setPoblacion("Avila");
         at.setProvincia("Avila");
         at.setTelefono("677 9879 98");


         Sociedades sds = new Sociedades();
         sds. setRazonSocial("Luciernagas");
         sds.setCif("B-99889");
         sds.setCodigoCliente("789Z");
         sds.setEmail(" luciernagas.es@gmail.com");
         sds.setDireccionPostal(" 05006");
         sds.setPoblacion("Alcala de Henares");
         sds.setProvincia(" Madrid");
         sds.setTelefono(" 920998877");

         Producto producto = new Producto();
         producto.setNombre("interruptores automaticos");
         producto.setCodigoProducto("0655T");
         producto.setMarca("Hager");
         producto.setModelo("serie Mu");
         producto.setPrecio("1600€");
         producto.setTipoIva(0.21);

         Factura factura = new Factura();
         factura.setCodigoFactura("900");
         factura.setFechaFactura("20/11/2023");
         factura.setNombreCliente("Juan Calabaza Pereira");
         factura.setNifCliente("777989C");
         factura.setPoblacionCliente("avila");
         factura.setProvinciaCliente("Avila");
         factura.setBaseImponible("4,76");
         factura.setTotal("104,76");

            }
        }

