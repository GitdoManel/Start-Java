import java.util.Scanner;

public class ComandoFor {
  // QUANDO O FOR É NORMAL.
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    for (int i = 0; i <= 10; i += 2) {
      System.out.println("Valor de i : " + i);
    }
    System.out.println("--------------------------------------");
    // QUANDO O O VALOR DE (index) é adicionado pelo usuario.
    System.out.println("Usuario digite um valor index : ");
    int index = in.nextInt();
    for (; index < 10; index++) {
      System.out.println("valor de index é: " + index);
    }
    System.out.println("--------------------------------------");

    // QUANDO O FOR TIVER MAIS DE UMA VARIAVEL SEPARAMOS COM VIRGULA

    for (int cont = 0, j = 10; cont < j; cont++, j--) {
      System.out.println("Cont tem valor " + cont + " e j tem valor " + j);
    }

  }
}
