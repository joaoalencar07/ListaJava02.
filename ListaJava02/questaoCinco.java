import java.util.Scanner;

public class questaoCinco {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1;
        int num2;
        int num3;

        System.out.print("Digite o primeiro numero: ");
        num1 = scanner.nextInt();

        System.out.print("Digite o segundo numero: ");
        num2 = scanner.nextInt();

        System.out.print("Digite o terceiro numero: ");
        num3 = scanner.nextInt();
 
        int maior = num1;
        int menor = num1;

        if (num2 > num1 && num2 > num3){
            maior = num2;
            
        }
        if (num3 > num2 && num3 > num1){
            maior = num3;
            menor = num2;
        }
        if(num3 < num2 && num3 < num1){
            menor = num3;
        }
        

        System.out.println("O maior número é: " + maior);
        System.out.print("O menor número é: " + menor);
    
    }
} 

