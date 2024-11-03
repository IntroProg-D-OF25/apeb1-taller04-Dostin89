
import java.util.Scanner;


public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("INGRESE EL COSTO POR KILOVATIO/HORA:");
        double costoPorKilovatio = scanner.nextDouble();
        
        System.out.println("INGRESE EL NUMERO DE KILOVATIOS CONSUMIDOS POR MES;");
        double KilovatiosConsumidos = scanner.nextDouble();
        
        System.out.println("INGRSE LA EDAD DEL USUARIO");
        int edad = scanner.nextInt();
        
        double total = costoPorKilovatio * KilovatiosConsumidos;
        
        //APLICAR DESCUENTO DEL 10% SI EL USUARIO TIENS MAS DE 65 AÑOS
        if(edad>65){
            total*=0.9;//EQUIVALENTE A UN DESCUENTO DEL 10%
        }
        
        System.out.println("El VALOR DE CANCELAR DE LA LUZ ES $:" + total);
    }
}

