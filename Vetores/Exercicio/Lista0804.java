import java.util.Scanner;

public class Lista0804 {

  public static void main(String[] args) {

    Scanner in = new Scanner(System.in);

    int[] valores = new int[10];

    for (int i = 0; i < valores.length; i++) {
      System.out.println("Insira um valor");
      valores[i] = in.nextInt();
    }
//LOGICA PARA IMPRIMIR SE É IMPAR OU PAR 
    for (int i = 0; i < valores.length; i++) {
      if (valores[i] % 2 == 0) {
        System.out.println(valores[i] + " e par");
      } else {
        System.out.println(valores[i] + " e impar");

      }

    }

  }

}
