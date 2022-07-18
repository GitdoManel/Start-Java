import java.util.Scanner;

public class SwitchCase {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Digite um dia da semana de ( 1 - 7 )");
    int DiadaSemana = in.nextInt();
/* 
    if (DiadaSemana == 1) {
      System.out.println("Domingo");
    } else if (DiadaSemana == 2) {
      System.out.println("Segunda");
    } else if (DiadaSemana == 3) {
      System.out.println("Terça");
    } else if (DiadaSemana == 4) {
      System.out.println("Quarta");
    } else if (DiadaSemana == 5) {
      System.out.println("Quinta");
    } else if (DiadaSemana == 6) {
      System.out.println("Sexta");
    } else if (DiadaSemana == 7) {
      System.out.println("Sabado");
    } else {
      System.out.println("Nao é um dia da Semana");
    }
    */
    // USANDO SWITCH CASE
    switch (DiadaSemana) {
      case 1:
        System.out.println("Domingo");
        break;
      case 2:
        System.out.println("Segunda");
        break;
      case 3:
        System.out.println("Terça");
        break;
      case 4:
        System.out.println("Quarta");
        break;
      case 5:
        System.out.println("Quinta");
        break;
      case 6:
        System.out.println("Sexta");
        break;
      case 7:
        System.out.println("Sábado");
      default:
        System.out.println("Nao é um dia da Semana");
    }
  }
}
