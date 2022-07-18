/* Escreva	 um	 programa	 para	 ler	 2	 valores	 (considere	 que	 	 não	 serão	
informados	valores	iguais)	e	escrever	o	maior	deles
*/
import java.util.Scanner;
    public class Ex01{
        public static void main(String[] args) {
            Scanner in = new Scanner (System.in);
            int a,b;
            System.out.println("Informe dois numeros");
            a = in.nextInt();
            b = in.nextInt();

            if ( a > b && a != b ) {
                System.out.println(a + " é o MAIOR numero ");
            }
            else if ( b > a && b != a ){
                System.out.println( b + " é o MAIOR numero");
            } else 
            System.err.println("Não serão informado valores iguais ");

            }
        }
    
