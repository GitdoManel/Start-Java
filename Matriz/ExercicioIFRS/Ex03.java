/*Criar um algoritmo que leia os elementos de uma matriz inteira 10 x 10 e escreva
todos os elementos, exceto os elementos da diagonal principal */

import java.util.Random;
import java.util.Scanner;

public class Ex03 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Random random = new Random();

        int[][] matriz = new int[4][4];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j] = random.nextInt(10);
            }
        }

        // IMPRIMINDO A MATRIZ COM A DIAGONAL PRINCIPAL

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j] + "  ");
            }
            System.out.println();
        }

        System.out.println();

      // IMPRIMINDO A MATRIZ SEM A DIAGONAL PRINCIPAL


        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
              
                if (i!=j) // IMPRIME TUDO SEMPRE QUE LINHA FOR DIFERENTE DE COLUNA
                System.out.print(matriz[i][j] + "  ");
            }
            System.out.println("");
        }

    }
}