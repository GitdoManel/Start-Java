
/*
7. Construa um algoritmo que dadas as entradas: distância do trajeto e velocidade
média da viagem, informe o tempo que uma família levará saindo de sua cidade de
férias até o destino previsto. Após o cálculo, o algoritmo deve mostrar o tempo
calculado.
*/
import java.util.Scanner;

public class Ex0107 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String partida, destino;
    float trajeto, velocidadeM;
    System.out.println("Digite a cidade que voce esta de partida: ");
    partida = in.next();
    System.out.println("Digite a cidade seu destino:  ");
    destino = in.next();
    System.out.println("Digite a distancia do trajeto : ");
    trajeto = in.nextFloat();
    System.out.println("Digite a velocidade média da viagem : ");
    velocidadeM = in.nextFloat();

    float tempViagem = trajeto / velocidadeM;
    // printf = para formatar casas decimais
    // %.2f = formatar para duas casas depois do ponto
    // ( , ) para determinar o pedido
    System.out.printf("O tempo de viagem de " + partida + " até " + destino + " é: %.2f ", tempViagem);

  }
}