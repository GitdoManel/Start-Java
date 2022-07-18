/*
1. Desenvolva o algoritmo de um programa onde o usuário irá informar um número
inteiro e o programa deve calcular e exibir o número imediatamente antecessor ao
número digitado pelo usuário
*/
import java.util.Scanner;

    public class Ex0101{

        public static void main(String[]args){
            Scanner in = new Scanner(System.in);

            int numero, total;
            System.out.println("Informe um numero:::");
            numero = in.nextInt();
            total = numero -1; 

            System.out.println("Numero antecessor informado pelo usuario é:" + total );
        }

    }