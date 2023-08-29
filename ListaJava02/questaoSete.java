import java.util.Scanner;

public class questaoSete {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o salário do colaborador: R$ ");
        double salarioAtual = scanner.nextDouble();
        
        double percentualAumento;
        if (salarioAtual <= 280.00) {
            percentualAumento = 20;
        } else if (salarioAtual <= 700.00) {
            percentualAumento = 15;
        } else if (salarioAtual <= 1500.00) {
            percentualAumento = 10;
        } else {
            percentualAumento = 5;
        }
        
        double aumento = (percentualAumento / 100) * salarioAtual;
        double novoSalario = salarioAtual + aumento;
        
        System.out.printf("Salário antes do reajuste: R$ %.2f%n", salarioAtual);
        System.out.printf("Percentual de aumento aplicado: %.0f%%%n", percentualAumento);
        System.out.printf("Valor do aumento: R$ %.2f%n", aumento);
        System.out.printf("Novo salário após o aumento: R$ %.2f%n", novoSalario);
    }
}
