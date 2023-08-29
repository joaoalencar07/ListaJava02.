import java.util.Scanner;

public class questaoUm {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o número: ");
        double numero = scan.nextDouble();
       
        if (numero > 0){
             System.out.println( numero + " é positivo");
        } else {
            System.out.println( numero + " é negativo");   
        }
        
    }

}
