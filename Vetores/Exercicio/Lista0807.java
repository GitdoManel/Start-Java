
/*Faça um programa, utilizando vetores, que armazene o resultado de uma votação.
Considere que você tem 5 candidatos, e para cada voto, você deverá digitar 1, 2, 3,
4 ou 5. que correspondem aos códigos de cada candidato. O programa deve parar
de receber votos quando for digitado -1. Outros valores devem ser ignorados. No
Final, indique qual o candidato vencedor da votação */
import java.util.Scanner;

public class Lista0807 {
  public static void main(String[] args) {
      Scanner in = new Scanner (System.in);
      int A=0,B=0,C=0,D=0,E=0, votoAtual = -1;
      int[] Candidato_1 = new int[A];
      int[] Candidato_2 = new int[B];
      int[] Candidato_3 = new int[C];
      int[] Candidato_4 = new int[D];
      int[] Candidato_5 = new int[E];

      System.out.println("CANDIDATO A = 1 , CANDIDATO B = 2, CANDIDATO C = 3 CANDIDATO D = 4, CANDIDATO E = 5");

       while(votoAtual != 0 ){
        System.out.println("Qual sua opção? :");
            votoAtual = in.nextInt();

            if (votoAtual == 1)  {
              Candidato_1[A-1]++;
            }  else if (votoAtual == 2)  {
              Candidato_2[B]++;
            } else if (votoAtual == 3)  {
              Candidato_3[C]++;
            }else if (votoAtual == 4)  {
              Candidato_4[D]++;
           }else if (votoAtual == 5)  {
            Candidato_5[E]++;
           }else if(votoAtual == -1)  {
          System.out.println("Votação ecerrada !! ! ! ! ! ");
           }
      }

      System.out.println(Candidato_1[A]);
    }
}
