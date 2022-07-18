
/*Escrever um programa que declare um vetor de 20 inteiros, leia um valor para cada
posição e no final mostre quantos elementos possuem valor maior, menor e igual ao
elemento do vetor que o usuário escolher */
import java.util.Scanner;

public class Lista0808 {

  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);

    int[] vetor = new int[20];

    for (int i = 0; i < vetor.length; i++) {
      System.out.println("Insira um valor");
      vetor[i] = in.nextInt();
    }

    for (int i = 0; i < vetor.length; i++) {
      if (vetor[i] > 20) {
        System.out.println(vetor[i] + " e maior que 20");
      } else if (vetor[i] < 20) {
        System.out.println(vetor[i] + " e menor que 20");
      } else {
        System.out.println(vetor[i] + " e igual a 20");
      }
    }
  }
}
