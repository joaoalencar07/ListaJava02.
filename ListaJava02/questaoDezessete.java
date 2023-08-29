import java.util.Scanner;

public class questaoDezessete {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalPrestacoes = 0;
        double totalValorPago = 0;

        while (true) {
            System.out.print("Informe o valor da prestação (ou 0 para encerrar): ");
            double valorPrestacao = scanner.nextDouble();

            if (valorPrestacao == 0) {
                break;
            }

            System.out.print("Informe o número de dias em atraso: ");
            int diasAtraso = scanner.nextInt();

            double valorAPagar;

            if (diasAtraso <= 0) {
                valorAPagar = valorPrestacao;
            } else {
                double multa = valorPrestacao * 0.03;
                double juros = valorPrestacao * (0.001 * diasAtraso);
                valorAPagar = valorPrestacao + multa + juros;
            }

            System.out.println("Valor a ser pago: R$" + valorAPagar);

            totalPrestacoes++;
            totalValorPago += valorAPagar;
        }

        System.out.println("\nResumo do Dia:");
        System.out.println("Total de prestações pagas: " + totalPrestacoes);
        System.out.println("Valor total pago: R$" + totalValorPago);

        scanner.close();
    }
}
