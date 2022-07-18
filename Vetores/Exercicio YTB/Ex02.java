
/*  ESCREVA UM VETOR PARA IMPRIMIR 15 POSICOES e  IMPRIMIR DE FORMA ORDEM INVERSA
*/
import java.util.Scanner;

public class Ex02 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int[] numeros = new int[15];
    int pos; // criado para adicionar um contador para as posicoes

    // laco de repeticao para o usuario digitar valores ao array
    for (int i = 0; i < numeros.length; i++) {
      System.out.println("Digite um valor na posicao " + i);
      numeros[i] = in.nextInt();
    }
    // laco de repeticao para mostrar a posicao + valores na posicao dentro do array
    for (pos = numeros.length - 1; pos >= 0; pos--) {
      System.out.println("O numero na posição " + pos + " é " + numeros[pos]);
    }

  }
}
