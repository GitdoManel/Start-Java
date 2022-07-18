
/*Desenvolva o algoritmo de um programa para calcular a média de duas notas das
avaliações de um aluno.
*/
import java.util.Scanner;

public class Ex0106 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    float nota1, nota2;
    System.out.println("Digite sua primeira nota: ");
    nota1 = in.nextFloat();
    System.out.println("Digite sua segunda nota: ");
    nota2 = in.nextFloat();

    float total = nota1 + nota2 / 2;
    System.out.println("A media das duas nota é: " + total);
  }

}
