


package proyectorefactorización;


public class Ejercicio3{
    // Definición de las constantes
    private static final int CONSTANTE_DIEZ = 10;
    private static final int CONSTANTE_RANDOM = 100;
    private static final int CONSTANTE_RESTO = 2;
    private static final int CONSTANTE_TRES = 3;
    private static final int CONSTANTE_DOS = 2;

    public static void main(String[] args) {
        int[] nums = new int[CONSTANTE_DIEZ];
        for (int i = 0; i < CONSTANTE_DIEZ; i++) {
            nums[i] = (int) (Math.random() * CONSTANTE_RANDOM) + 1;
        }

        int sum = 0;
        for (int i = 0; i < CONSTANTE_DIEZ; i++) {
            if (nums[i] % CONSTANTE_RESTO == 0) {
                sum += nums[i] * CONSTANTE_TRES;
            } else {
                sum += nums[i] * CONSTANTE_DOS;
            }
        }

        // Mostrar la suma resultante
        System.out.println("La suma es: " + sum);
    }
}
