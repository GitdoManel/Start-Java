
/*Gere e imprima uma matriz M 10X10 com valores aleatórios entre 0-9.
 * APÓS ISSO INDIQUE QUAL É O MAIOR E O MENOR VALOR DA LINHA 5 E QUAL É O 
 * MAIOR E O MENOR DA COLUNA 7
 */
import java.util.Random;

public class Ex02 {

  public static void main(String[] args) {
    // MATRIZ 4X4
    int[][] matriz_Aleat = new int[10][10];

    // PARA TER OS NUMEROS ALEATORIOS
    Random numeroRandom = new Random();

    // PARA DECLARAR OS NUMEROS ALEATORIOS DENTRO DA MATRIZ
    for (int lin = 0; lin < matriz_Aleat.length; lin++) {
      for (int col = 0; col < matriz_Aleat[lin].length; col++) {
        // Declarando numero aleatorio.
        matriz_Aleat[lin][col] = numeroRandom.nextInt(9);
      }
    }
    // PARA MOSTRAR MATRIZ PARA O USUARIO
    for (int lin = 0; lin < matriz_Aleat.length; lin++) {
      for (int col = 0; col < matriz_Aleat[lin].length; col++) {
        System.out.print(matriz_Aleat[lin][col] + " ");
      }
      System.out.println("");
    }
    // PARTE DA LOGICA
    int maiorL5 = Integer.MIN_VALUE;
    int menorL5 = Integer.MAX_VALUE;
    
    // PARA DETERMINAR O MAIOR e o MENOR VALOR DA LINHA 5
    for (int lin = 0; lin < matriz_Aleat[5].length; lin++) {
      if (matriz_Aleat[5][lin] > maiorL5) {
        maiorL5 = matriz_Aleat[5][lin];
      }
      if (matriz_Aleat[5][lin] < menorL5) {
        menorL5 = matriz_Aleat[5][lin];
      }
    }

    System.out.println("O maiorL5 valor da linha 5:: " + maiorL5);
    System.out.println("O menorL5 valor da linha 5:: " + menorL5);

    int maiorC7 = Integer.MIN_VALUE;
    int menorC7 = Integer.MAX_VALUE;
    // MAIOR E MENOR VALOR DA COLUNA 7
    for (int col = 0; col < matriz_Aleat.length; col++) {
      if (matriz_Aleat[col][7] > maiorC7) {
        maiorC7 = matriz_Aleat[col][7];
      }
      if (matriz_Aleat[col][7] < menorC7) {
        menorC7 = matriz_Aleat[col][7];
      }
    }
    System.out.println("O maiorC7 valor da coluna 7:: " + maiorC7);
    System.out.println("O menorC7 valor da coluna 7:: " + menorC7);

  }
}
