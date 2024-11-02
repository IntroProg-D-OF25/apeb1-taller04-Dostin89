
import java.util.Scanner;


public class Ejercicio2 {
    public static void main(String[] args) {
        //BLOQUE DE DECLARACION DE VARIABLE
        double gastoHijo1, gastoHijo2, gastoHijo3, totalGastos;
        Scanner teclado = new Scanner(System.in);
        //BLOQUE DE LECTURA DE DATOS DE ENTRADA
        System.out.println("DAME LOS GASTOS DEL H1:");
        gastoHijo1 = teclado.nextDouble();
        System.out.println("DAME LOS GASTOS DEL H2:");
        gastoHijo2 = teclado.nextDouble();
        System.out.println("DAME LOS GASTOS DEL H3:");
        gastoHijo3 = teclado.nextDouble();
        //BLOQUE DE PROCESAMIENTO
        totalGastos = gastoHijo1 + gastoHijo2 + gastoHijo3;
        //BLOQUE DE SALIDA DE RESULTADOS
        System.out.println("GASTOS TOTALES:" + totalGastos);  
    }
    
}

/***
 * DAME LOS GASTOS DEL H1:
34
DAME LOS GASTOS DEL H2:
26
DAME LOS GASTOS DEL H3:
43
GASTOS TOTALES:103.0
 */