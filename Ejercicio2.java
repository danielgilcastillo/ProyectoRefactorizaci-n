
package proyectorefactorización;


public class Ejercicio2 {

   
public static void calculate(int a, int b) {
    int suma = a + b;
    System.out.println("Suma of a and b: " + suma);

    int diferencia = a - b;
    System.out.println("Diferencia of a and b: " + diferencia);

    int producto = a * b;
    System.out.println("Producto of a and b: " + producto);

    // Añadir comprobación
    if (b != 0) {
        int cociente = a / b;
        System.out.println("Cociente of a and b: " + cociente);
    } else {
        System.out.println("No se puede dividir por cero");
    }
}}