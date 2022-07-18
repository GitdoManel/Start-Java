import java.util.Scanner;
import java.security.SecureRandom;

public class ExYTB {

  public static void main(String[] args) {

    
    final int linhas = 3;
    final int colunas = 5;

    // O primeiro [] linhas o segundo [] colunas
    int[][] numeros = new int[linhas][colunas];

    for (int lin = 0; lin < linhas; lin++) {
      for (int col = 0; col < colunas; col++) {
        numeros[lin][col] = new SecureRandom().nextInt(5);
      }
    }

    for (int lin = 0; lin < linhas; lin++) {
      for (int col = 0; col < colunas; col++) {
        System.out.printf("%d - ", numeros[lin][col]);
      }
      // tem que adicionar isso para ir em efeito matriz
      System.out.printf("%n");
    }

  }
}
