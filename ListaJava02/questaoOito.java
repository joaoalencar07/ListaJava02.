import java.util.Scanner;

public class questaoOito {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o valor da hora trabalhada: ");
        double valorHora = scanner.nextDouble();

        System.out.print("Informe a quantidade de horas trabalhadas no mês: ");
        double horasTrabalhadas = scanner.nextDouble();

        double salarioBruto = valorHora * horasTrabalhadas;
        double sindicato = salarioBruto * 0.03;
        double fgts = salarioBruto * 0.11;

        double ir = 0.0;
        
        if (salarioBruto > 2500) {
            ir = salarioBruto * 0.20;
        } else if (salarioBruto > 1500) {
            ir = salarioBruto * 0.10;
        } else if (salarioBruto > 900) {
            ir = salarioBruto * 0.05;
        }

        double inss = salarioBruto * 0.10;
        double totalDescontos = ir + inss + sindicato;
        double salarioLiquido = salarioBruto - totalDescontos;

        System.out.println("Salário Bruto: (" + valorHora + " * " + horasTrabalhadas + ")  : R$ " + salarioBruto);
        System.out.println("(-) IR (" + (ir * 100 / salarioBruto) + "%)   : R$ " + ir);
        System.out.println("(-) INSS (10%) : R$ " + inss);
        System.out.println("FGTS (11%)  : R$ " + fgts);
        System.out.println("Total de descontos  : R$ " + totalDescontos);
        System.out.println("Salário Líquido   : R$ " + salarioLiquido);
    }
}

       
