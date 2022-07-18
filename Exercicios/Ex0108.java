
/*Desenvolva o algoritmo para calcular o resultado de uma eleição de um municipal.
A entrada de dados será:
● Número total de eleitores;
● Número de votos válidos;
● Número de votos brancos;
● Número de votos nulos.
O algoritmo deve calcular e exibir para o usuário as seguintes informações (em
relação ao total de eleitores):
● Percentual de votos válidos;
● Percentual de votos brancos;
● Percentual de votos nulos;
*/
import java.util.Scanner;
import java.util.IllegalFormatConversionException;

public class Ex0108 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    float TotalEleitores, Vvalidos, Vbrancos, Vnulos;
    System.out.println("Numero de eleitores : ");
    TotalEleitores = in.nextFloat();
    System.out.println("Numero de votos validos : ");
    Vvalidos = in.nextFloat();
    System.out.println("Numero de votos em branco : ");
    Vbrancos = in.nextFloat();
    System.out.println("Numero de votos nulos : ");
    Vnulos = in.nextFloat();
    float porcentoV, porcentoB, porcentoN;

    porcentoV = Vvalidos * 100 / TotalEleitores;
    System.out.println("Porncentual de votos validos: " + porcentoV + "%");
    porcentoB = Vbrancos * 100 / TotalEleitores;
    System.out.println("Porncentual de votos branco: " + porcentoB + "% ");
    porcentoN = Vnulos * 100 / TotalEleitores;
    System.out.println("Porncentual de votos nulos: " + porcentoN + "%");

  }
}