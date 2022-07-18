/*Escreva	 um	 programa	 para	 ler	 o	 ano	 de	 nascimento	 de	 uma	 pessoa	 e	
escrever	 uma	 mensagem	 que	 diga	 se	 ela	 poderá	 ou	 não	 votar	 este	 ano	
(não	é	necessário	considerar	o	mês	em	que	ela	nasceu)
*/
import java.util.Scanner;
public class Ex02 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
    int AnodeNascimento;
    System.out.println("Informe seu ano de nascimento");
    AnodeNascimento = in.nextInt();
        if (AnodeNascimento <= 2004)
        System.out.println("Você ja pode votar esse ano ");
        else {
            System.out.println("Você ainda não pode votar :(( ");
        }
    }
}
