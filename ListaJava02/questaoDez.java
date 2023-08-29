import java.util.Scanner;

public class questaoDez {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um número de 1 a 10 para gerar a tabuada: ");
        int numero = scanner.nextInt();

        if (numero < 1 || numero > 10) {
            System.out.println("Por favor, insira um número de 1 a 10.");
        } else {
            System.out.println("Tabuada de " + numero + ":");

            for (int i = 1; i <= 10; i++) {
                int resultado = numero * i;
                System.out.println(numero + " X " + i + " = " + resultado);
            }
        }

        scanner.close();
    }
}
