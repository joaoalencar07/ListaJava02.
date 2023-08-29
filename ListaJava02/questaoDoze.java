import java.util.Scanner;

public class questaoDoze {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Atleta: ");
        String nomeAtleta = scanner.nextLine();

        double[] saltos = new double[5];
        double somaDosSaltos = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Informe a distância do " + (i + 1) + "º salto: ");
            saltos[i] = scanner.nextDouble();
            somaDosSaltos += saltos[i];
        }

        double melhorSalto = saltos[0];
        double piorSalto = saltos[0];

        for (int i = 1; i < 5; i++) {
            if (saltos[i] > melhorSalto) {
                melhorSalto = saltos[i];
            }
            if (saltos[i] < piorSalto) {
                piorSalto = saltos[i];
            }
        }

        double mediaDosDemaisSaltos = (somaDosSaltos - melhorSalto - piorSalto) / 3.0;

        System.out.println("\nMelhor salto:  " + melhorSalto + " m");
        System.out.println("Pior salto: " + piorSalto + " m");
        System.out.println("Média dos demais saltos: " + mediaDosDemaisSaltos + " m");

        System.out.println("\nResultado:");
        System.out.println(nomeAtleta + ": " + mediaDosDemaisSaltos + " m");

        scanner.close();
    }
}
