
import java.util.Scanner;


public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("INGRESE EL COSTO POR MINUTO");
        double costoPorMinuto = Scanner.nextDouble();
        System.out.println("INGRESE EL NUMERO DE MINUTOS CONSUMIDOS EN EL MES");
        int minutosConsumidos = Scanner.nextInt();
        double total = costoPorMinuto * minutosConsumidos;
        System.out.println("EL VALOR DE LA PLANTILLA DE TELEFONO ES: $" + total);   
    }
}
