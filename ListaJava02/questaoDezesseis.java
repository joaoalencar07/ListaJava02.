public class questaoDezesseis {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 7;
        int num3 = 10;
        
        somaDeTres(num1, num2, num3);
    }
    
    public static void somaDeTres(int a, int b, int c) {
        int soma = a + b + c;
        System.out.println("A soma de " + a + ", " + b + " e " + c + " é igual a " + soma);
    }
}
