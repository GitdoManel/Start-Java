
/*Tendo	 como	 entrada	 a	 altura	 e	 o	 sexo	 (codificado	 da	 seguinte	 forma:	
1:feminino	 	 2:masculino)	 de	 uma	 pessoa,	 construa	 um	 programa	 que	
calcule	e	imprima	seu	peso	ideal,	utilizando	as	seguintes	
Fórmulas:	
- para	homens:	(72.7	*	Altura)	– 58	
- para	mulheres:	(62.1	*	Altura)	– 44.7
*/
import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o numer  (1)  para masculino ou (2) para feminino. ");
        int sexo = in.nextInt();

        if (sexo == 1) {
            System.out.println("Digite sua altura: ");
            double altura = in.nextDouble();
            double pesoideal = (72.7 * altura) - 58;
            System.out.println("Seu peso ideal seria: " + pesoideal + "KG");
        } else if (sexo == 2) {
            System.out.println("Digite sua altura: ");
            double altura = in.nextDouble();
            double pesoideal = (62.1 * altura) - 44.7;
            System.out.println("Seu peso ideal seria: " + pesoideal + "KG");
        }
    }
}
