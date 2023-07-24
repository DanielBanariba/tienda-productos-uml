import java.time.LocalDate;
import java.util.Random;

public class Factura {
    float total = 0;
    float impuesto = 0;
    float subtotal = 0;

    private String[][] arreglo1;
    public Factura(String[][] arreglo) {
        if (arreglo.length != 30 || arreglo[0].length != 2) {
            throw new IllegalArgumentException("El arreglo debe tener 30 filas y 2 columnas.");
        }
        arreglo1 = arreglo;
    }

    public void imprimirFactura(){
        int i = 0;
        float subtotal = 0;
        float impuestos = 0;
        float total = 0;
        float totalProducto = 0;
        float precio = 0;
        String nombreEmpresa = "CAFE EXPRESSO";
        String nombreSucursal = "SUCURSAL MIRAFLORES";
        String nombreCajero = "DIEGO MARADONA";

        LocalDate fechaActual = LocalDate.now();
        Random random = new Random();
        int numeroRandom = random.nextInt(100);

        Producto producto = new Producto();
        System.out.println("Fecha" + fechaActual);
        System.out.println("Numero de factura" + numeroRandom);



        // Mostrar los datos en consola
        System.out.println(" " + nombreEmpresa);
        System.out.println(" " + nombreSucursal);
        System.out.println(" CAJERO: " + nombreCajero );
        System.out.println("XDXDXDDXDXXDDDXXDXDXDDXDDXXXDDDXDDDDXXXXDDD");
        System.out.println("CODIGO\tNOMBRE\t\t\t\t\t\t\t\t\tDESCRIPCION\t\t\t\t\t\t\t\t\t\tPRECIO\t\t\t\t\tCANTIDAD\t\t\t\t\tTOTALES");
        while (true){
            if(arreglo1[i][0]==null){
                break;
            }

            precio = producto.imprimirProducto(arreglo1[i][0]);
            System.out.print("\t\t\t\t\t");
            System.out.print(arreglo1[i][1]);
            System.out.print("\t\t\t\t\t");
            System.out.println(precio * Integer.parseInt(arreglo1[i][1]));
            subtotal += precio * Integer.parseInt(arreglo1[i][1]);
            i++;
        }
        System.out.println("Sub total\t\t\t\t\t" + subtotal);
        System.out.println("Impuesto 15%\t\t\t\t\t" + subtotal*0.15);
        System.out.println("Total\t\t\t\t\t" + (subtotal + subtotal*0.15));
    }

    public float getTotal() {
        return total;
    }
}
