/*Escreva	 um	 programa	 para	 ler	 3	 valores	 inteiros	 (considere	 que	 	 não	
serão	lidos	valores	iguais)	e	escrevê-los	em	ordem	crescente
*/
import java.util.Scanner;
    public class Ex05{
    public static void main(String[] args) {
        System.out.println("Digite 3 valores ");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        if ( a != b && a !=c && b !=c ){
            System.out.println("valor " + a + "valor " + b + "valor " +c + " inserido.");
        }else( a == b || a == c || b == c) {
            System.out.println("Valores iguais inseridos. ");
        }

    }
}
    