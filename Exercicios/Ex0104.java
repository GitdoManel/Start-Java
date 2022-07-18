//Desenvolva um algoritmo para calcular a área de um triângulo. Pensem nas
//variáveis que serão necessárias. Ao final, o algoritmo deve informar a área total do triângulo.


import java.util.Scanner;
    public class Ex0104 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // importar o Scanner para poder interagir com o USUARIO
        float base, altura, area;
        System.out.println(" Informe a base e a altura ...");

        base = in.nextFloat();
        altura = in.nextFloat();
        area = base * altura /2 ;

        System.out.println(" A area deste triangulo é de " + area);

    }
}