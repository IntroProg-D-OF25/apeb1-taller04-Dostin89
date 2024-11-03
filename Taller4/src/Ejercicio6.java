
import java.util.Scanner;


public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("INGRESA EL MONTO DEL PRESTAMO");
        double montoPrestamo = scanner.nextDouble();
        
        System.out.println("INGRSE EL INTERES MENSUAL EN PORCENTAJE");
        double interesMensual = scanner.nextDouble();
        
        interesMensual/=100;
        
        double pagoMensual = montoPrestamo * interesMensual;
        
        System.out.println("EL COSTO MESUAL DEL PRESTAMO ES:$" + pagoMensual);
    }
    
}

/***
 * INGRESA EL MONTO DEL PRESTAMO
1200
INGRSE EL INTERES MENSUAL EN PORCENTAJE
15
EL COSTO MESUAL DEL PRESTAMO ES:$180.0
 */
