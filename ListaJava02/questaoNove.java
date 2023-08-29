import java.util.Scanner;

public class questaoNove {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número de 1 a 7: ");
        int numero = scanner.nextInt();

        String[] diasDaSemana = {"Domingo", "Segunda-feira", "Terça-feira", "Quarta-feira", "Quinta-feira", "Sexta-feira", "Sábado"};

        if (numero >= 1 && numero <= 7) {
            String dia = diasDaSemana[numero - 1];
            System.out.println("O dia correspondente é: " + dia);
        } else {
            System.out.println("Valor inválido. Por favor, insira um número de 1 a 7.");
        }
        
        scanner.close();
    }
}

