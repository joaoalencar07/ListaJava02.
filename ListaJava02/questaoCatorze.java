import java.util.Scanner;

public class questaoCatorze {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número inteiro (n): ");
        int n = scanner.nextInt();
        
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        
        scanner.close();
    }
}
