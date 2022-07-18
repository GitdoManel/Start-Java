import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

/* As	maçãs	 custam	 R$	 0,30	 cada	 se	 forem	 compradas	menos	 do	 que	 uma	
dúzia,	 e	 R$	 0,25	 se	 forem	 compradas	 pelo	 menos	 doze.	 Escreva	 um	
programa	 que	 leia	 o	 número	 de	 maçãs	 compradas,	 calcule	 e	 escreva	 o	
valor	total	da	compra
*/
public class Ex04 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    // -12 == 0,30 e 12 ou mais == 0,25
    System.out.println("Quantas maçãs voce deseja comprar? ");
    int Qtdmacas = in.nextInt();

    double menor12;
    double maior12;
    if (Qtdmacas < 12) {
      menor12 = Qtdmacas * 0.30;
      System.out.println("O valor com essa quantia ficou de R$ " + menor12 + "reais");
    } else {
      maior12 = Qtdmacas * 0.25;
      System.out.println("O valor com essa quantia ficou de R$ " + maior12 + "reais");
    }

  }
}
