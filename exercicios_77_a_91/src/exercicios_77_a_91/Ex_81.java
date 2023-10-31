package exercicios_77_a_91;

import java.util.Arrays;
import java.util.Scanner;

public class Ex_81 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer[] Q = new Integer[20];
        Integer pos = 0;

        for(int x = 0; x < Q.length; x++){
            System.out.println("Digite o valor para a posicao " + (x+1) + ": ");
            Q[x] = scanner.nextInt();
        }
        Integer menor = Q[0];

        for(int x = 0; x < Q.length; x++){
            if(menor > Q[x]){
                menor = Q[x];
                pos = x;
            }
        }

        System.out.println("Vetor: " + Arrays.toString(Q));
        System.out.println("Menor numero no vetor: " + menor + ". Sua posicao: " + pos);
    }
}
