/*Fazer um algoritmo que leia vinte números inteiros armazenando-os em um vetor, a
seguir, troque o conteúdo da primeira posição do vetor com o conteúdo da décima
primeira posição, o conteúdo da segunda posição com o da décima segunda, e
assim, sucessivamente até trocar o conteúdo da décima com o da vigésima e
escreva o vetor após estas modificações. */
import java.util.Scanner;

public class Lista0805 {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);

        int[] vetor_1 = new int[10];
        int[] vetor_2 = new int[10];
        int auxiliar = 0;

        for (int i = 0; i < vetor_2.length; i++) {
            System.out.println("Informe um valor para o primeiro vetor");
            vetor_1[i] = in.nextInt();
            System.out.println("Informe um valor para o segundo vetor");
            vetor_2[i] = in.nextInt();
        }
        for (int i = 0; i < vetor_2.length; i++) {
            auxiliar = vetor_1[i];
            vetor_1[i] = vetor_2[i];
            vetor_2[i] = auxiliar;
        }
        for (int i = 0; i < vetor_2.length; i++) {
            System.out.println(vetor_1[i] + " Vetor 1 " + vetor_2[i] + " Vetor 2");
        }
    }
    
} 
