
/*Faça um programa armazenar em uma matriz os compromissos de uma agenda pessoas.
 * CADA DIA DO MES DEVE CONTER 24HRS, ONDE CADA UMAS DESTAS 24HRS PODEMOS ASSOCIAR
 * UMA TAREFA ESPECIFICA. O PROGRAMA DEVE TER UM MENU ONDE O USUARIO INDICA O DIA DO MES QUE DESEJA
 * ALTERAR E A HORA, ENTRANDO EM SEGUIDA COM O COMPROMISSO, OU ENTAO, O USUARIO PODE TAMBEM CONSULTAR
 * A AGENDA, FORNECENDO O DIA E A HORA PARA OBTER O COMPROMISSO ARMAZENADO. 
 */
import java.util.Scanner;

public class Ex04 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    String[][] Compromissos = new String[31][24];

    int opcao;
    boolean sair = false;
    while (!sair) {
      System.out.println("Digite 1 para adicionar compromisso: ");
      System.out.println("Digite 2 para verificar o compromisso: ");
      System.out.println("Digite para sair. ");

      opcao = in.nextInt();

      if (opcao == 1) {

        boolean diaValido = false;
        int dia = 0;
        while (!diaValido) {
          System.out.println("Entre com o dia do mês: ");
          dia = in.nextInt();
          if (dia > 0 && dia <= 31) {
            diaValido = true;
          } else {
            System.out.println("Dia invalido, digite novamente. ");
          }
        }

        boolean horaValido = false;
        int hora = 0;
        while (!horaValido) {
          System.out.println("Entre com hora do dia: ");
          hora = in.nextInt();
          if (hora >= 0 && hora <= 24) {
            horaValido = true;
          } else {
            System.out.println("Hora invalida, digite novamente. ");
          }
        }
        dia--;
        System.out.println("Digite o compromisso");
        Compromissos[dia][hora] = in.next();

      } else if (opcao == 2) {

        boolean diaValido = false;
        int dia = 0;
        while (!diaValido) {
          System.out.println("Entre com o dia do mês: ");
          dia = in.nextInt();
          if (dia > 0 && dia <= 31) {
            diaValido = true;
          } else {
            System.out.println("Dia invalido, digite novamente. ");
          }
        }

        boolean horaValido = false;
        int hora = 0;
        while (!horaValido) {
          System.out.println("Entre com hora do dia: ");
          hora = in.nextInt();
          if (hora >= 0 && hora <= 24) {
            horaValido = true;
          } else {
            System.out.println("Hora invalida, digite novamente. ");
          }
        }
        dia--;
        System.out.println("O compromisso agendado é ");
        System.out.println(Compromissos[dia][hora]);

      } else if (opcao == 0) {
        sair = true;
      } else {
        System.out.println("Opção invalida, digite novamente. ");
      }
    }
  }
}
