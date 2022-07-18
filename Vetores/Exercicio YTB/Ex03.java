
/*Escreva um programa para ler um Vetor C de N posicoes,onde N é menor ou igual a 20 e imprimir seus elementos. O usuaria deve informar o numero de posicoes e os elementos  */
import java.util.Scanner;

public class Ex03 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n; // DECLAREI A VARIAVEL N 

    //LACO DE REPETICAO PARA DIGITAR UM VALOR MENOR QUE 20 MAIOR QUE 1
    //FAZ
      do {
      System.out.println("Digite um Valor para o tamanho dos seu Vetor (entre 1 e 20): ");
      n = in.nextInt();
    //SE
      if (n > 20 || n < 1) {
        System.out.println("Tamanho do vetor invalido.");
      }
    //ENQUANTO
    } while (n > 20 || n < 1);

    // VETOR DECLARADO COM O TAMANHO DIGITADO PELO USUARIO
    int[] VetorC = new int[n];
    // LACO DE REPETICAO PRO USUARIO DIGITAR VALORES NA POSICAO i
    for (int i = 0; i < VetorC.length; i++) {
      System.out.println("Digite um valor na posicao " + i);
      VetorC[i] = in.nextInt();
    }
    // VARIAVEL POS CRIADA PARA MOSTRAR PARA O USUARIO A POSICAO + NUMERO NA POSICAO
    for (int pos = 0; pos < VetorC.length; pos++) {
      System.out.println("O numero na posição " + pos + " é " + VetorC[pos]);
    }
  }
}
