import java.util.Scanner;

public class questaoSeis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Em que turno você estuda? (M-matutino, V-vespertino, N-noturno): ");
        String turno = scanner.next().toUpperCase();

        String mensagem = "Valor Inválido!";
        
        if (turno.equals("M")) mensagem = "Bom Dia!";
        if (turno.equals("V")) mensagem = "Boa Tarde!";
        if (turno.equals("N")) mensagem = "Boa Noite!";

        System.out.println(mensagem);
        scanner.close();
    }
}
