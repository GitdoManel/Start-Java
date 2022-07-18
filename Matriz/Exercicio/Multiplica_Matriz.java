import java.util.Scanner;

public class Multiplica_Matriz {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int linha = 2;
    int coluna = 2;
    int[][] matrizA = new int[linha][coluna];

    int linha2 = 2;
    int coluna2 = 2;
    int[][] matrizB = new int[linha2][coluna2];

    for (int i = 0; i < linha; i++) {
      for (int j = 0; j < coluna; j++) {
        System.out.print("Digite um valor para a Matriz A: ");
        matrizA[i][j] = in.nextInt();
      }
      System.out.println("");
    }
    for (int i = 0; i < linha2; i++) {
      for (int j = 0; j < coluna2; j++) {
        System.out.print("Digite um valor para a Matriz B: ");
        matrizB[i][j] = in.nextInt();
      }
    }
    for (int i = 0; i < linha; i++) {
      for (int j = 0; j < coluna; j++) {
        System.out.print(matrizA[i][j] + " ");
      }
      System.out.println("");
    }
    System.out.println("");

    for (int i = 0; i < linha2; i++) {
      for (int j = 0; j < coluna2; j++) {
        System.out.print(matrizB[i][j] + " ");
      }
      System.out.println("");
    }

    if (matrizA[0].length == matrizB[0].length) {
      int[][] matrizC = new int[linha][coluna2];

      for (int i = 0; i < linha; i++) {
        for (int j = 0; j < coluna2; j++) {
          for (int k = 0; k < linha2; k++) {
            matrizC[i][j] += matrizA[i][k] * matrizB[k][j];

          }
        }
      }
      System.out.println("");
      for (int i = 0; i < linha; i++) {
        for (int j = 0; j < coluna2; j++) {
          System.out.printf(matrizC[i][j] + " ");
        }
      System.out.println("");
      }

    } else {
      System.out.println("Não é possivel realizar a multiplicação.");
    }

  }
}
