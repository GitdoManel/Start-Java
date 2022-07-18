
/* Escreva um programa para ler um vetor E (de inteiros), de tamanho N (N<=20), 
determinar e imprimir o maior e o menor elemento deste vetor*/
import java.util.Scanner;

public class Ex07 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n, maior, menor; // DECLAREI A VARIAVEL N
    // LACO DE REPETICAO PARA DIGITAR UM VALOR MENOR QUE 15 MAIOR QUE 1
    // FAZ
    do {
      System.out.println("Digite a quantidade para seu Vetor (entre 1 e 20): ");
      n = in.nextInt();
      // SE
      if (n > 20 || n < 1) {
        System.out.println("Quantidade invalida.");
      }
      // ENQUANTO
    } while (n > 20 || n < 1);
    // VETOR DECLARADO COM O TAMANHO DIGITADO PELO USUARIO
    int[] VetorE = new int[n];

    for (int i = 0; i < VetorE.length; i++) {
      System.out.println("Digite o valor na posição " + i + " :");
      VetorE[i] = in.nextInt();
    }
      System.out.println("Determinando o maior e o menor valor neste Vetor E é : ");
      maior = menor = VetorE[0];

      for (int i = 1; i < VetorE.length; i++) {
        if (VetorE[i] > maior) {
          maior = VetorE[i];
        }
        if (VetorE[i] < menor) {
          menor = VetorE[i];
        }
        System.out.println("Maior elemento: " + maior + " menor " + i);
      }

    }
  }
