import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String[][] orden = new String[30][2];

        Producto productos = new Producto();
        Scanner scanner = new Scanner(System.in);

        int posicion = 0;
        String continuar;
        while(true) {
            productos.mostrarMenu();
            System.out.println("Elija su producto");
            orden[posicion][0] = scanner.nextLine();

            System.out.println("Eliga la cantidad");
            orden[posicion][1] = scanner.nextLine();

            posicion++;
            System.out.println("Quiere continuar? Y/N");
            continuar = scanner.nextLine();

            if (continuar.equals("N")) {
                break;
            }
        }

        Factura factura = new Factura(orden);
        factura.imprimirFactura();
        System.out.println("Porfavor elige el metodo de pago: 1) Pago digital        2) Efectivo       3) Cheque");
        scanner.nextLine();
        scanner.close();
    }
}