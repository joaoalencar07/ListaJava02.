import java.util.Scanner;

public class questaoQuatro {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num1;
        int num2;
        int num3;

        System.out.print("Digite o primeiro numero: ");
        num1 = scan.nextInt();

        System.out.print("Digite o segundo numero: ");
        num2 = scan.nextInt();

        System.out.print("Digite o terceiro numero: ");
        num3 = scan.nextInt();
 
        int maior = num1;

        if (num2 > num1){
            maior = num2;
        }
        if (num3 > num2 && num3 > num1){
            maior = num3;
        }

        System.out.print("O maior número é: " + maior);

    }
} 
