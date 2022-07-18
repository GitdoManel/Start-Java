import java.util.Scanner;
    public class Idade2x{
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int idade_dobrada;
            System.out.println("Qual a sua idade");
            idade_dobrada = in.nextInt();
            System.out.println("Sua Idade ao dobro é:" + (idade_dobrada * 2));
            
        }
    }
