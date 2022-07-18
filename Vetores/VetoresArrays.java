import java.util.Scanner;

// COMO ARMAZENAR A TEMPERATURA MEDIA TODOS OS DIAS POR 1 ANO ::::
public class VetoresArrays {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    // VETOR PADRAO
    double[] temperatura = new double[365];
    temperatura[0] = 10.5;
    temperatura[1] = 12.5;
    temperatura[2] = 32.5;
    temperatura[3] = 42.5;
    temperatura[4] = 22.5;
    temperatura[5] = 30.5;
    temperatura[6] = 35.5;
    // ASSIM SUCESSIVAMENTE
    System.out.println("O valor da temperatura do dia 1 é : " + temperatura[0]);
    System.out.println("O valor da temperatura do dia 2 é : " + temperatura[1]);
    System.out.println("O valor da temperatura do dia 3 é : " + temperatura[2]);

    System.out.println("O tamanho do array: " + temperatura.length);
  }
}
