
/*Capture do TECLADO VALORES PARA PREENCHIMENTO DE UMA MATRIZ M3X3.
 * APÓS A CAPTURA IMPRIMA A MATRIZ CRIADA E ENCONTRE A QUANTIDADE
 * DE NÚMEROS PARES, A QUANTIDADE DE NUMEROS IMPARES
 */
import java.util.Scanner;

public class Ex03 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int[][] Matriz = new int[3][3];

    // PARA O USUARIO DIGITAR OS VALORES
    for (int i = 0; i < Matriz.length; i++) {
      for (int j = 0; j < Matriz[i].length; j++) {
        System.out.println("Digite um valores para a linha [" + i + "] da coluna [" + j + "] : ");
        Matriz[i][j] = in.nextInt();
      }
    }

    // para imprimir a MATRIZ
    for (int i = 0; i < Matriz.length; i++) {
      for (int j = 0; j < Matriz[i].length; j++) {
        System.out.print(Matriz[i][j] + " ");
      }
      System.out.println("");
    }

    // PARTE DA LOGICA PARES E IMPARES 
    int Num_Pares = 0;
    int Num_Impares = 0;

    for (int i = 0; i < Matriz.length; i++) {
      for (int j = 0; j < Matriz.length; j++) {
        if (Matriz[i][j] % 2 == 0) {
          Num_Pares++;
        } else {
          Num_Impares++;
        }
      }
    }
    System.out.println("Pares = " + Num_Pares);
    System.out.println("Impares = " + Num_Impares);
  }
}
