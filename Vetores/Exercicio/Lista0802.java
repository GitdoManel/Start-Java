
/*Tentando descobrir se um dado era viciado, um dono de cassino honesto o lançou n vezes. Dados os n resultados dos lançamentos, determinar o
número de ocorrências de cada face
*/
import java.util.Random;
import java.util.Scanner;

public class Lista0802 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int lados[] = new int[6];
    Random aleat = new Random();

    System.out.println("Informe o numero de lancamentos, 0 para finalizar");
    int resultado;

    int lancamentos = in.nextInt();

    for (int i = 0; i < lancamentos; i++) {
      resultado = aleat.nextInt(6) + 1;

      // System.out.println("Qual o valor sorteado? " + resultado);

      if (resultado > 0 && resultado <= 6) {
        lados[resultado - 1]++;
      }
    }

    System.out.println("Cada valor saiu: ");
    for (int i = 0; i < 6; i++) {
      System.out.println("O lado " + (i + 1) + " foi sorteado " + lados[i] + " vezes");
    }
  }
}