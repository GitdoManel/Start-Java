import java.util.Random;
import java.util.Scanner;

public class NumeroSecreto {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    Random Number = new Random();

    System.out.println(" Você tem 3 tentativas. ");
    int NumberSecreto = Number.nextInt(10);
    int Tentativas = 1;

    System.out.println(NumberSecreto);

    System.out.println("Digite o numero Secreto de 0 a 10:  ");
    int numero = in.nextInt();

    while (numero != NumberSecreto && Tentativas < 3) {
      System.out.println("Voce errou. Tente mais uma vez :)) ");
      numero = in.nextInt();
      Tentativas++;
      if (numero > 10 || numero < 0) {
        System.out.println("Este numero não esta entre 0 e 10");
      }
    }

    if (numero == NumberSecreto) {
      System.out.println("Voce acertou o Numero Secreto!! com " + Tentativas + " Tentativas!!");
    } else if (Tentativas == 3) {
      System.out.println("Voce ultrapassou o limite de tentativas. \n VOCE PERDEU!");
    }
  }
}
