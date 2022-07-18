import java.util.Scanner;

/* Escreva	um	programa	para	ler	o	número	de	lados	de	um	polígono	regular	
e	a	medida	do	lado	(em	cm).	Calcular	e	imprimir	o	seguinte:	
− Se	o	número	de	lados	for	igual	a	3	escrever	TRIÂNGULO	e	o	valor	da	
área
− Se	o	número	de	lados	for	igual	a	4	escrever	QUADRADO	e	o	valor	da	
sua	área.	
− Se	o	número	de	lados	for	igual	a	5	escrever	PENTÁGONO. */
public class Ex07 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.println(
        " Deseja calcular um polígono de quantos lados?\n Digite (3) Triângulo \n (4) Quadrado \n (5) Pentágono");
    int lados = in.nextInt();

    System.out.println("Qual a medida em cm dos lados regulares do polígono? ");
    double medida = in.nextDouble();

    if (lados == 3) {
      System.out.println("Triângulo");
      System.out.println("Digite a atura do Triângulo: ");
      double altura = in.nextDouble();
      double area = (medida * altura) / 2;
      System.out.println("A area deste triângulo é " + area);
    } else if (lados == 4) {
      System.out.println("Quadrado");
      double area = medida * medida;
      System.out.println("A area deste Quadrado é " + area);
    } else if (lados == 5) {
      System.out.println("Pentágono");
      System.out.println("Digite a atura do apótema regular do Pentágono: ");
      double altura = in.nextDouble();
      double area = 5 / 2 * (medida * altura);
      System.out.println("A area deste Pentágono é " + area);
    } else {
      System.out.println("Nao foi digitado o o numero de lados corretamente.");
    }

  }
}
