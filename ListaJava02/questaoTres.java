import java.util.Scanner;

public class questaoTres {

    public static void main(String[] args) {
        Scanner scaneer = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double nota1 = scaneer.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = scaneer.nextDouble();

        double media = (nota1 + nota2) / 2;

         System.out.println("A media das notas é:" + media);

         if (media >= 7 && media <= 9){
             System.out.print("VOCE ESTA APROVADO");
         }else if(media == 10){
             System.out.print("APROVADO COM DISTINÇÃO");
         }else{
             System.out.print("VOCE ESTA REPROVADO");
         }


    }
} 





