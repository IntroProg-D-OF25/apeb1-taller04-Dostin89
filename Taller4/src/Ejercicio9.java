
import java.util.Scanner;
public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir el lado del cuadrado
        System.out.print("INGRSE EL LADO DEL CUADRADO: ");
        double ladoCuadrado = scanner.nextDouble();

        // Calcular el área del cuadrado
        double areaCuadrado = Math.pow(ladoCuadrado, 2);
        System.out.println("AREA DEL CUADRADO: " + areaCuadrado);

        // Calcular el área de un triángulo y multiplicarlo por 3
        double areaTriangulo = (ladoCuadrado * ladoCuadrado) / 2;
        double areaTriangulosTotal = 3 * areaTriangulo;
        System.out.println("AREA DE LOS 3 TRIANGULOS ES: " + areaTriangulosTotal);

        // Calcular el área del rectángulo
        double areaRectangulo = ladoCuadrado * ladoCuadrado;
        System.out.println("AREA DEL RECTANGULO: " + areaRectangulo);

        // Área total del polígono
        double areaTotal = areaCuadrado + areaTriangulosTotal + areaRectangulo;
        System.out.println("EL AREA DEL POLIGONO ES: " + areaTotal);
    }
}

/***
 * INGRSE EL LADO DEL CUADRADO: 
4
AREA DEL CUADRADO: 16.0
AREA DE LOS 3 TRIANGULOS ES: 24.0
AREA DEL RECTANGULO: 16.0
EL AREA DEL POLIGONO ES: 56.0
 */