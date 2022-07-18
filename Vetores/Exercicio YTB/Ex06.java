
/*Escreve um programa para ler 2 vetores de dimensão n (n<=15) e comparar os elementos do primeiro
 vetor com o segundo e informar a posicao em que os elementos sao iguais */
import java.util.Scanner;

public class Ex06 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n; // DECLAREI A VARIAVEL N
    // LACO DE REPETICAO PARA DIGITAR UM VALOR MENOR QUE 15 MAIOR QUE 1
    // FAZ
    do {
      System.out.println("Digite a quantidade para seu Vetor (entre 1 e 15): ");
      n = in.nextInt();
      // SE
      if (n > 15 || n < 1) {
        System.out.println("Quantidade invalida.");
      }
      // ENQUANTO
    } while (n > 15 || n < 1);
    // VETOR DECLARADO COM O TAMANHO DIGITADO PELO USUARIO
    int[] Vetor1 = new int[n];
    int[] Vetor2 = new int[n];

    for (int i = 0; i < Vetor1.length; i++) {
      System.out.println("Digite o valor " + (i + 1) + " :");
      Vetor1[i] = in.nextInt();
    }
    for (int i = 0; i < Vetor2.length; i++) {
      System.out.println("Digite o valor do 2º vetor  " + (i + 1) + " :");
      Vetor2[i] = in.nextInt();
    }
    // COMPARAR OS ELEMENTOS DO VETOR 1 E VETOR 2
    System.out.println("Comparando os elementos do vetor1 e vetor 2: ");
    for (int i = 0; i < Vetor1.length; i++) {
      if (Vetor1[i] == Vetor2[i]) {
        System.out.println("O vetor " + Vetor1[i] + " são iguais nos valores no vetor de posição " + i);
      }
    }
  }
}
