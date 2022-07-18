/*Desenvolva o algoritmo de um programa onde o usuário irá informar um número 
inteiro e o programa deve calcular e exibir o quadrado do número informado pelo usuario
*/

import java.util.Scanner;

public class Ex0103 {
    public static void main(String[]args) {
        Scanner in = new Scanner(System.in);
        int numero1;
        System.out.println("Informe um numero :");
        numero1 = in.nextInt(); // para o usuario poder digitar o valor desejado
        int total = numero1 * numero1;

        System.out.println("O quadrado do valor é:" + total);

    }
}
