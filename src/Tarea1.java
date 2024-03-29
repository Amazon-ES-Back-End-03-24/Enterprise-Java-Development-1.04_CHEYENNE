public class Tarea1 {

    public static void main(String[] args) {
        int[] numeros = {91, 102, 87, 32, 1};

        int resultadoDiferencia = calcularDiferencia(numeros);
        System.out.println("La diferencia entre el  más grande y el más pequeño es: " + resultadoDiferencia);

        int[] resultadosMenores = encontrarMenores(numeros);
        System.out.println("El numero  más pequeño es: " + resultadosMenores[0]);
        System.out.println("El segundo numero más pequeño es: " + resultadosMenores[1]);

        double resultadoExpresion = calcularExpresion(resultadosMenores[0], resultadosMenores[1]);
        System.out.println("El resultado de la expresión es: " + resultadoExpresion);
    }
    // Tarea 1
    public static int calcularDiferencia(int[] array) {
        int min = array[0];
        int max = array[0];

        for (int num : array) {
            if (num < min) {
                min = num;
            }
            if (num > max) {
                max = num;
            }
        }
        return max - min;
    }

    // Tarea 2
    public static int[] encontrarMenores(int[] array) {
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;

        for (int num : array) {
            if (num < min1) {
                min2 = min1;
                min1 = num;
            } else if (num < min2 && num != min1) {
                min2 = num;
            }
        }
        return new int[]{min1, min2};
    }

    // Tarea 3
    public static double calcularExpresion(int x, int y) {
        double resultado = Math.pow(x, 2) + Math.pow((4 * y / 5 - x), 2);
        return resultado;
    }
}
