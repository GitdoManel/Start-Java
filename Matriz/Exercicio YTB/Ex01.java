
/*Gere e imprima uma matriz M 4x4 COM VALORES ALEATÓRIOS ENTRE 0-9. APÓS
 * ISSO DETERMINE O MAIOR NUMERO DA MATRIZ E A SUA POSIÇÃO (LINHA-COLUNA)*/
import java.util.Random;

public class Ex01 {
  public static void main(String[] args) {
     // MATRIZ 4X4     
    int[][] matriz_Aleat = new int[4][4];
    
    //PARA TER OS NUMEROS ALEATORIOS
    Random numeroRandom = new Random();

    //PARA DECLARAR OS NUMEROS ALEATORIOS DENTRO DA MATRIZ
    for (int lin = 0; lin < matriz_Aleat.length; lin++) {
      for (int col = 0; col < matriz_Aleat[lin].length; col++) {
        //Declarando numero aleatorio.
        matriz_Aleat[lin][col] = numeroRandom.nextInt(9);
      }
    }
    // OU tambem posso usar o Integer.MIN_VALUE => para calcular o menor valor quando
    // não sabermos se é o 0.
    // ou Integer.MAX_VALUE => para maior valor.
    int maior = 0;
    int linha = 0;
    int coluna = 0;

    // PARA DETERMINAR O MAIOR VALOR E ACHAR A LINHA E A COLUNA 
    for (int lin = 0; lin < matriz_Aleat.length; lin++) {
      for (int col = 0; col < matriz_Aleat[lin].length; col++) {
        if (matriz_Aleat[lin][col] > maior) {
          maior = matriz_Aleat[lin][col];
          linha = lin;
          coluna = col;
        }
      }
    }
    // PARA MOSTRAR A MATRIZ PARA O USUARIO
    for (int lin = 0; lin < matriz_Aleat.length; lin++) {
      for (int col = 0; col < matriz_Aleat[lin].length; col++) {
        System.out.print(matriz_Aleat[lin][col] + " ");
      }
      // PARA PULAR LINHA QUANDO PARAR DE CONTAR E VOLTAR PARA O FOR ATÉ FINALIZAR.
      System.out.println("");

    }
    //PARA MOSTRAR O MAIOR VALOR, EM QUE LINHA ESTA E EM QUAL COLUNA.
    System.out.println("Maior valor = " + maior);
    System.out.println("Na linha = " + linha);
    System.out.println("Na coluna = " + coluna);
  }
}