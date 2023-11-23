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
         producto.setPrecio(10.0);
         producto.setTipoIva(0.21);

         Producto pr2 = new Producto();
         pr2.setNombre("guias de electricidad");
         pr2.setCodigoProducto("9088Y");
         pr2.setMarca("Oldisfer Nylon");
         pr2.setModelo("5MT");
         pr2.setPrecio(10.0);
         pr2.setTipoIva(0.4);


         Factura factura = new Factura();
         factura.setCodigoFactura("900H");
         factura.setFechaFactura("20/11/2023");
         factura.setNombreCliente("Juan Calabaza Pereira");
         factura.setNifCliente("777989C");
         factura.setPoblacionCliente("avila");
         factura.setProvinciaCliente("Avila");
         factura.setBaseImponible("0.21");
         factura.setTotal("12.1");

         Factura fctr2 = new Factura();
         fctr2.setCodigoFactura("779H");
        fctr2.setFechaFactura("20/11/2023");
        fctr2.setNombreCliente("Luciernagas");
        fctr2.setCif("B-99889");
        fctr2.setPoblacionCliente("Alcala de Henares");
        fctr2.setProvinciaCliente("Madrid");
        fctr2.setBaseImponible("0.4");
        fctr2.setTotal("10.4");
            }
        }

