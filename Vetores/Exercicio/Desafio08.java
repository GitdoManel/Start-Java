
/*Dado dois vetores de tamanho 5 e com valores ordenados, criar um vetor de
tamanho 10 com todos elementos ordenados. O programa deve receber 5 valores do
primeiro vetor, 5 valores do segundo vetor e, finalmente, mostrar o vetor final com 10
posições com os valores ordenados. Ex: v1 = [1, 3, 5, 7, 9] e v2 = [2, 4, 6, 8, 10]. O
programa deverá mostrar o vetor [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
   */
import java.util.Scanner;

public class Desafio08 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int[] Vetor = new int[10];
    int[] Vetor_1 = { 1, 3, 5, 7, 9 };
    int[] Vetor_2 = { 2, 4, 6, 8, 10 };
    int retem = 0;
    int retem2 = 0;
    for (int i = 0; i < Vetor_1.length; i++) {
      retem = Vetor_1[i];
      Vetor[i] = retem;

    }
    for (int j = 0; j < Vetor_2.length; j++) {
      retem2 = Vetor_2[j];
      Vetor[j + 5] = retem2;
    }
    for (int k = 0; k < Vetor.length; k++) {
      System.out.println(Vetor[k]);

      for (int n = 1; n < Vetor.length; n++) {
        retem = Vetor[n];
        Vetor[n] = Vetor[n + 4];
        Vetor[n + 4] = retem;

       // Vetor[n + 4] = Vetor[n + 2];
      }
      for (int l = 0; l < Vetor.length; l++) {
        System.out.println(Vetor[l]);
      }

    }
  }
}
