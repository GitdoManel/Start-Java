import java.util.Scanner;

public class Exame {

  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);

    int[] vetor_1 = new int[10];
    int[] vetor_2 = new int[10];
    int[] vetor_3 = new int[10];
    int[] vetor_4 = new int[10];

    for (int i = 0; i < vetor_1.length; i++) {
      System.out.println("Insira um valor para o vetor 1 na posicao " + i);
      vetor_1[i] = in.nextInt();
    }
    for (int i = 0; i < vetor_2.length; i++) {
      System.out.println("Insira um valor para o vetor 2 na posicao " + i);
      vetor_2[i] = in.nextInt();
    }
    for (int i = 0; i < vetor_3.length; i++) {
      System.out.println("Insira um valor para o vetor 3 na posicao " + i);
      vetor_3[i] = in.nextInt();
    }

    for (int j = 0; j < vetor_4.length; j++) {
      if (vetor_1[j] < vetor_2[j] && vetor_1[j] < vetor_3[j]) {
        vetor_4[j] = vetor_1[j];
      } else if (vetor_2[j] < vetor_1[j] && vetor_2[j] < vetor_3[j]) {
        vetor_4[j] = vetor_2[j];

      } else {
        vetor_4[j] = vetor_3[j];
      }

      for (int i = 0; i < vetor_4.length; i++) {
        System.out.println(vetor_4[i] + "  ");
      }

      System.out.println();
    }
  }
}