import java.util.Scanner;

public class Ex0109 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int Homens, Mulheres, Criancas;

    System.out.println("Qual a quantidade de homens,mulheres, crianças para o evento: ");
    Homens = in.nextInt();
    Mulheres = in.nextInt();
    Criancas = in.nextInt();
    int totalHomens = Homens * 400;
    int totalMulheres = Mulheres * 320;
    int totalCriancas = Criancas * 200;
    //PARA SABER SE A QTD PORCENTO DE UM NUMERO PEGA O NNUMERO , MULTIPLICA PELA PORCENTAM DESEJADA E DIVIDE POR 100.
    System.out.println("O total de gramas de carne para os homens é " + totalHomens + ", a de mulheres "
        + totalMulheres + " e a de crianças é " + totalCriancas);
    int totalGramas = totalHomens + totalMulheres + totalCriancas;
    int totalporcet = totalGramas * 20 / 100;
    int totalCarne = totalGramas + totalporcet;

    System.out.println("A QUANTIDADE DE CARNE NO TOTAL É DE " + totalCarne + " GRAMAS");

  }
}
