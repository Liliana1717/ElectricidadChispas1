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

         System.out.println(at.getCodigoCliente());
         System.out.println(at.getNombre());
         System.out.println(at.getApellidos());
         System.out.println(at.getDni());
         System.out.println(at.getEmail());
         System.out.println(at.getDireccionPostal());
         System.out.println(at.getPoblacion());
         System.out.println(at.getProvincia());
        System.out.println(at.getTelefono());


         Sociedades sds = new Sociedades();
         sds. setRazonSocial("Luciernagas");
         sds.setCif("B-99889");
         sds.setCodigoCliente("789Z");
         sds.setEmail(" luciernagas.es@gmail.com");
         sds.setDireccionPostal(" 05006");
         sds.setPoblacion("Alcala de Henares");
         sds.setProvincia(" Madrid");
         sds.setTelefono(" 920998877");

         System.out.println(sds.getRazonSocial());
         System.out.println(sds.getCif());
         System.out.println(sds.getCodigoCliente());
         System.out.println(sds.getEmail());
         System.out.println(sds.getDireccionPostal());
         System.out.println(sds.getPoblacion());
         System.out.println(sds.getProvincia());
         System.out.println(sds.getTelefono());

         Producto producto = new Producto();
         producto.setNombre("interruptores automaticos");
         producto.setCodigoProducto("0655T");
         producto.setMarca("Hager");
         producto.setModelo("serie Mu");
         producto.setPrecio(10.0);
         producto.setTipoIva(0.21);


         System.out.println(producto.getNombre());
         System.out.println(producto.getCodigoProducto());
         System.out.println(producto.getMarca());
         System.out.println(producto.getModelo());
         System.out.println(producto.getPrecio());
         System.out.println(producto.getTipoIva());

         Producto pr2 = new Producto();
         pr2.setNombre("guias de electricidad");
         pr2.setCodigoProducto("9088Y");
         pr2.setMarca("Oldisfer Nylon");
         pr2.setModelo("5MT");
         pr2.setPrecio(10.0);
         pr2.setTipoIva(0.4);

         System.out.println(pr2.getNombre());
         System.out.println(pr2.getCodigoProducto());
         System.out.println(pr2.getMarca());
         System.out.println(pr2.getModelo());
         System.out.println(pr2.getPrecio());
         System.out.println(pr2.getTipoIva());

         Factura factura = new Factura();
         factura.setCodigoFactura("900H");
         factura.setFechaFactura("20/11/2023");
         factura.setNombreCliente("Juan Calabaza Pereira");
         factura.setNifCliente("777989C");
         factura.setPoblacionCliente("avila");
         factura.setProvinciaCliente("Avila");
         factura.setBaseImponible("0.21");
         factura.setTotal("12.1");

         System.out.println(factura.getCodigoFactura());
         System.out.println(factura.getFechaFactura());
         System.out.println(factura.getNombreCliente());
         System.out.println(factura.getNifCliente());
         System.out.println(factura.getPoblacionCliente());
         System.out.println(factura.getProvinciaCliente());
         System.out.println(factura.getBaseImponible());
         System.out.println(factura.getTotal());

         Factura fctr2 = new Factura();
         fctr2.setCodigoFactura("779H");
        fctr2.setFechaFactura("20/11/2023");
        fctr2.setNombreCliente("Luciernagas");
        fctr2.setCif("B-99889");
        fctr2.setPoblacionCliente("Alcala de Henares");
        fctr2.setProvinciaCliente("Madrid");
        fctr2.setBaseImponible("0.4");
        fctr2.setTotal("10.4");

        System.out.println(fctr2.getCodigoFactura());
        System.out.println(fctr2.getFechaFactura());
        System.out.println(fctr2.getNombreCliente());
        System.out.println(fctr2.getCif());
        System.out.println(fctr2.getPoblacionCliente());
        System.out.println(fctr2.getProvinciaCliente());
        System.out.println(fctr2.getBaseImponible());
        System.out.println(fctr2.getTotal());
            }
        }

