/*O algoritmo deve ter como entrada um número real e a saída deve ser o valor
atualizado com os 20%
*/
import java.util.Scanner;
public class Ex0102 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // importar o Scanner para poder interagir com o USUARIO

    //PERGUNTAR PARA O USUARIO UM NUMERO
    System.out.println("Digite um numero real::");

    //SABENDO QUE O NUMERO E REAL, VOU UTILIZAR FLOAT
    float valor = in.nextFloat(); // para o usuario poder digitar o valor 

    //VOU CALCULAR 20%
    float vinteporcento = valor * 0.2f;

    //VOU SOMAR COM O VALOR 
    float total = valor + vinteporcento;

    //VOU MOSTRAR O RESULTADO 
    System.out.println("O valor atualizado com o 20% é:" + total);
    
    }
    
}
