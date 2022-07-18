 //Desenvolva o algoritmo para converter uma temperatura em graus Fahrenheit para
//graus Celsius.
 
import java.util.Scanner;

    public class Ex0105 { 
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            float Celsius, Fahrenheit, ConversaoF, ConversaoC, total;
            System.out.println("Informe o Graus Celsius:");
            Celsius = in.nextFloat();
            System.out.println("Informe o Graus Fahrenheit:");
            Fahrenheit = in.nextFloat();
            ConversaoC = Celsius /5;
            ConversaoF = (Fahrenheit - 32) /9;
            total = ConversaoC = ConversaoF;

        System.out.println("O algoritimo convertido é" + total);

        }

    
}
