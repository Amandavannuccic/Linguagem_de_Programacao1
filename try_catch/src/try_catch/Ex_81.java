package try_catch;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex_81 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer[] Q = new Integer[20];
        Integer pos = 0;

        for (int x = 0; x < Q.length; x++) {
            System.out.println("Digite o valor para a posição " + (x + 1) + ": ");
            try {
                Q[x] = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Valor inserido não é um número válido. Por favor, tente novamente.");
                scanner.next(); // Limpa o buffer de entrada
                x--; // Volta uma iteração para tentar novamente
            }
        }

        Integer menor = Q[0];

        for (int x = 0; x < Q.length; x++) {
            if (menor > Q[x]) {
                menor = Q[x];
                pos = x;
            }
        }

        System.out.println("Vetor: " + Arrays.toString(Q));
        System.out.println("Menor número no vetor: " + menor + ". Sua posição: " + pos);
    }
}
