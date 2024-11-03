import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("INGRES EL COSTO MENSUAL DE NETFLIX:");
        double netflix = scanner.nextDouble();
        
        System.out.println("INGRESE EL COSTO MENSUAL DE YOUTUBE PREMIUM:");
        double youtubePremium = scanner.nextDouble();
        
        System.out.println("INGRESE EL VALOR MENSUAL DE DROPBOX:");
        double dropbox = scanner.nextDouble();
        
        System.out.println("INGRESE EL VALOR MENSUAL DE SPOTIFY:");
        double spotify = scanner.nextDouble();
        
        System.out.println("INGRESA LA EDAD DEL USUARIO:");
        int edad = scanner.nextInt();
        
        double total = netflix + youtubePremium + dropbox + spotify;
                
        // APLICAMOS EL DESCUENTO DEL 20% SI LA PERSONA ES MENOR DE 30 AÑOS
        if (edad < 30) { 
            total *= 0.8; // EQUIVALENTE A UN DESCUENTO DEL 20%
        }
        
        System.out.println("EL VALOR TOTAL A PAGAR DE LOS SERVICIOS DIGITALES ES: $" + total);
       
    }
}

/***
 * INGRES EL COSTO MENSUAL DE NETFLIX:
20
INGRESE EL COSTO MENSUAL DE YOUTUBE PREMIUM:
10
INGRESE EL VALOR MENSUAL DE DROPBOX:
9
INGRESE EL VALOR MENSUAL DE SPOTIFY:
8
INGRESA LA EDAD DEL USUARIO:
27
EL VALOR TOTAL A PAGAR DE LOS SERVICIOS DIGITALES ES: $37.6
 */