
import java.util.Scanner;


public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("INGRESE EL COSTO DE LA CPU");
        double cpu = scanner.nextDouble();
        
        System.out.println("INGRESE EL COSTO DEL TECLADO");
        double teclado = scanner.nextDouble();
        
        System.out.println("INGRESE EL COSTO DE LA PANTALLA");
        double pantalla = scanner.nextDouble();
        
        System.out.println("INGRESE EL COSTO DEL RATON");
        double raton = scanner.nextDouble();
        
        double total = cpu + teclado + pantalla+ raton;
        System.out.println("EL COSTO TOTAL DE LA COMPUTADORA ES $:" + total);
    }
    
}

/***
 * INGRESE EL COSTO DE LA CPU
220
INGRESE EL COSTO DEL TECLADO
40
INGRESE EL COSTO DE LA PANTALLA
120
INGRESE EL COSTO DEL RATON
20
EL COSTO TOTAL DE LA COMPUTADORA ES $:400.0
 */
