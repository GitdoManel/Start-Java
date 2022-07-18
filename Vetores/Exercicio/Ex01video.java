
/*Criar um vetor A com 5 elementos inteiros. Construir um vetor B de mesmo tipo e tamnho e com os "mesmos 
elementos do vetor A, ou seja, B[i] = A[i]
*/
import java.util.Scanner;

public class Ex01video {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int[] vetorA = new int[5];
    int[] vetorB = new int[vetorA.length];

    for (int i = 0; i < vetorA.length; i++) {
      System.out.println("Entre com uma valor ");
      vetorA[i] = in.nextInt();
      vetorB[i] = vetorA[i];
    }
    System.out.print("Vetor A = ");
    for (int i = 0; i < vetorA.length; i++) {
      System.out.print(vetorA[i] + " ");
    }
    System.out.println("Vetor B = ");
    for (int i = 0; i < vetorA.length; i++) {
      System.out.print(vetorB[i] + " ");
    }
    System.out.println();
  }
}
