
/*Modifique o programa anterior de maneira a guardas os compromissos de todo o ano,
 * organizados por MÊS, DIA E HORA (só 8 horas por dia )
 */
import java.util.Scanner;

public class Ex05 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    String[][][] Compromissos = new String[12][31][8];

    int opcao;
    boolean sair = false;
    while (!sair) {
      System.out.println("Digite 1 para adicionar compromisso: ");
      System.out.println("Digite 2 para verificar o compromisso: ");
      System.out.println("Digite 0 para sair. ");

      opcao = in.nextInt();

      if (opcao == 1) {

        boolean mesValido = false;
        int mes = 0;
        while (!mesValido) {
          System.out.println("Entre com o mês: ");
          mes = in.nextInt();
          if (mes > 0 && mes <= 12) {
            mesValido = true;
          } else {
            System.out.println("Mês invalido, digite novamente. ");
          }
        }

        boolean diaValido = false;
        int dia = 0;
        while (!diaValido) {
          System.out.println("Entre com o dia do mês: " + mes);
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
          System.out.println("Entre com hora do dia: " + dia);
          hora = in.nextInt();
          if (hora >= 0 && hora <= 8) {
            horaValido = true;
          } else {
            System.out.println("Hora invalida, digite novamente. ");
          }
        }
        dia--;
        System.out.println("Digite o compromisso");
        Compromissos[mes][dia][hora] = in.next();

      } else if (opcao == 2) {
        boolean mesValido = false;
        int mes = 0;
        while (!mesValido) {
          System.out.println("Entre com o mês: ");
          mes = in.nextInt();
          if (mes > 0 && mes <= 8) {
            mesValido = true;
          } else {
            System.out.println("Mês invalido, digite novamente. ");
          }
        }

        boolean diaValido = false;
        int dia = 0;
        while (!diaValido) {
          System.out.println("Entre com o dia do mês: " + mes);
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
          System.out.println("Entre com hora do dia: " + dia);
          hora = in.nextInt();
          if (hora >= 0 && hora <= 8) {
            horaValido = true;
          } else {
            System.out.println("Hora invalida, digite novamente. ");
          }
        }
        dia--;
        System.out.println("O compromisso agendado é ");
        System.out.println(Compromissos[mes][dia][hora]);

      } else if (opcao == 0) {
        sair = true;
      } else {
        System.out.println("Opção invalida, digite novamente. ");
      }
    }
  }
}
