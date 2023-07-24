import java.lang.reflect.Array;

public class Producto {

    public String[][] cafeteriaProductos = new String[12][4];

    public Producto(){
        cafeteriaProductos[0][0] = "1";
        cafeteriaProductos[0][1] = "Café Americano";
        cafeteriaProductos[0][2] = "Café negro sin leche";
        cafeteriaProductos[0][3] = "2.50";

        cafeteriaProductos[1][0] = "2";
        cafeteriaProductos[1][1] = "Café con Leche";
        cafeteriaProductos[1][2] = "Café con leche y espuma de leche";
        cafeteriaProductos[1][3] = "3.00";

        cafeteriaProductos[2][0] = "3";
        cafeteriaProductos[2][1] = "Capuchino";
        cafeteriaProductos[2][2] = "Café con leche y cacao en polvo";
        cafeteriaProductos[2][3] = "3.50";

        cafeteriaProductos[3][0] = "4";
        cafeteriaProductos[3][1] = "Té Chai Latte";
        cafeteriaProductos[3][2] = "Té chai con leche espumosa";
        cafeteriaProductos[3][3] = "3.25";
    }



    public void mostrarMenu(){
        System.out.println("Menu");
        System.out.println("XDXDXDXDXDXDXDXDXDXDXDXDXDXD");
        System.out.println("");


        System.out.println("CODIGO\tNOMBRE\t\t\t\tDESCRIPCION\t\t\t\t\tPRECIO");

        for (int i = 0; i < 4; i++) {
            System.out.println(cafeteriaProductos[i][0] + "\t"
                    + cafeteriaProductos[i][1] + "\t\t\t\t"
                    + cafeteriaProductos[i][2] + "\t\t\t\t\t"
                    + cafeteriaProductos[i][3]);
  }
}

    public float imprimirProducto(String codigo) {
        for (int i = 0; i < 4; i++) {
            if (cafeteriaProductos[i][0].equals(codigo)) {
                System.out.print(cafeteriaProductos[i][0] + "\t    "
                        + cafeteriaProductos[i][1] + "\t\t\t\t\t\t"
                        + cafeteriaProductos[i][2] + "\t\t\t\t\t\t\t"
                        + cafeteriaProductos[i][3]);
                return Float.parseFloat(cafeteriaProductos[i][3]);
            }
        }
        return 0;
    }
}