
/*Escreva um programa para ler 2 vetores de dimensao n (n<=15) e calcular a soma entre eles 
gerando um terceiro vetor de mesma dimensao */
import java.util.Scanner;

public class Ex05 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n; // DECLAREI A VARIAVEL N
    // LACO DE REPETICAO PARA DIGITAR UM VALOR MENOR QUE 15 MAIOR QUE 1
    // FAZ
    do {
      System.out.println("Digite a quantidade de alunos para seu Vetor (entre 1 e 15): ");
      n = in.nextInt();
      // SE
      if (n > 15 || n < 1) {
        System.out.println("Quantidade de alunos invalida.");
      }
      // ENQUANTO
    } while (n > 15 || n < 1);
    // VETOR DECLARADO COM O TAMANHO DIGITADO PELO USUARIO
    int[] Nota1 = new int[n];
    int[] Nota2 = new int[n];
    int[] Soma = new int[n];
    // LACO DE REPETICAO PRO USUARIO DIGITAR VALORES NA POSICAO i
    for (int i = 0; i < Nota1.length; i++) {
      System.out.println("Digite a nota do aluno " + (i + 1) + " :");
      Nota1[i] = in.nextInt();
    }
    for (int i = 0; i < Nota2.length; i++) {
      System.out.println("Digite a nota do no segundo semenstre do aluno " + (i + 1) + " :");
      Nota2[i] = in.nextInt();
    }
    // VARIAVEL POS CRIADA PARA MOSTRAR PARA O USUARIO A POSICAO + NUMERO NA POSICAO
    for (int pos = 0; pos < Soma.length; pos++) {
      Soma[pos] = Nota1[pos] + Nota2[pos];
      System.out.println("A soma da notas dos alunos é : ");
      System.out.println("Aluno " + (pos + 1) + " nota : " + Soma[pos]);
    }

  }
}
