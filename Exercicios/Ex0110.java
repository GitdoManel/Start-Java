
/*Desenvolva um algoritmo que será utilizado para realizar o cálculo do público e
da renda total do estagio de futebol.
doouble

  2)Este evento esportivo possui um valor fixo
cobrado por ingresso, no entanto, os sócios do clube em cujas dependências ocorre
o evento possuem um desconto de 30% no valor do ingresso e as crianças menores
de 10 anos não pagam ingresso.
int ingresso = ingresso * 30 / 100

3)Baseado nos dados acima apresentados o usuário
deverá digitar 4 informações de
entrada para o sistema, são elas:

- Valor de cada ingresso
- Número de pessoas que são sócias do clube, 30% de desconto
- Número de pessoas, não pagantes (menores de 10 anos)
- Número de pessoas pagantes (sem desconto algum)


4)O algoritmo deverá calcular e exibir o público total do evento, a renda total do evento
e o valor que deixou de ser arrecadada devido aos descontos e isenções
*/
import java.util.Scanner;

public class Ex0110 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    double Vingresso, SocioTorcedor, Npagantes, Pagantes, TotalPublico;
    System.out.println("Qual o valor do ingresso? ");
    Vingresso = in.nextDouble();
    System.out.println("Quanto socios torcedores? ");
    SocioTorcedor = in.nextDouble();
    System.out.println("Quantas crianças menor de 10 anos ? ");
    Npagantes = in.nextDouble();
    System.out.println("Quantidade de publico adulto, não sócio?");
    Pagantes = in.nextDouble();

    TotalPublico = SocioTorcedor + Npagantes + Pagantes;
    System.out.println("O total de público é: " + TotalPublico);
    double Vsocio = Vingresso * 30 / 100;
    double rendaSocio = Vsocio * SocioTorcedor;
    double RendaTotal = rendaSocio + (Pagantes * Vingresso);
    System.out.println("Renda Total = R$" + RendaTotal);
    double Valordesconto = (Npagantes * Vingresso) + (SocioTorcedor * Vingresso - rendaSocio);
    System.out.println("O valor que deixou de ser arrecadada devido aos descontos e isenções é: R$ " + Valordesconto);

  }
}
