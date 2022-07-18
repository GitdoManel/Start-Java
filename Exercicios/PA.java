import java.util.Scanner;

    public class PA {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
            int n;
            System.out.println("Digite um valor N para seu calculo:::");
            n= in.nextInt();
            int soma = ((1 + n) * n ) /2;
            System.out.println("A soma dos N termos é: "  + soma);
            
    }
}
