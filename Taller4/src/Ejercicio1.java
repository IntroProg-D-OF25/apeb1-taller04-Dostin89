
import java.util.Scanner;


public class Ejercicio1 {
    public static void main(String[] args) {
         //BLOQUE DECLARACION DE VARIABLE
        double baseTriag, altoTriag, areaTriag;
        Scanner teclado = new Scanner (System.in);
        //BLOQUE DE PROCESAMIENTO DE ENTRADA
        System.out.println("DAME LA BASE DEL, T.:");
        baseTriag = teclado.nextDouble();
        System.out.println("DAME LA ALTURA DEL, T.:");
        altoTriag = teclado.nextDouble();
        //BLOQUE DE PROCESAMIENTO DE DATOS DE ENTRADA
        areaTriag = (baseTriag * altoTriag) / 2;
        //BLOQUE DE SALIDA DE RESULTADOS
        System.out.println("DAME LA ALTURA DEL T. =" + areaTriag);
    }
}

/***
 * DAME LA BASE DEL, T.:
6
DAME LA ALTURA DEL, T.:
5
DAME LA ALTURA DEL T. =15.0
 */