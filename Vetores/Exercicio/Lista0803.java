
/*Faça um programa onde você declara um vetor de 10 posições que receba
respectivamente 10 valores do tipo float (você deverá digitá-los via teclado).
Apresente então, a média desses 10 valores.
*/
import java.util.Scanner;

public class Lista0803 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    float[] vetor = new float[10];
    float Soma = 0;
    float media = 0;

    for (int i = 0; i < vetor.length; i++) {
      System.out.println("Digite um valor na posição " + i);
      vetor[i] = in.nextFloat();
    }
    // SOMAR OS VALORES E DIVIDIR A MEDIA
    for (int pos = 0; pos < vetor.length; pos++) {
      Soma = vetor[pos] + Soma;
    }
    media = Soma / 10;
    System.out.println("A media dos vetores é " + media);
  }

}
