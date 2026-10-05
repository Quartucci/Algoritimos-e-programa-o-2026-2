import java.util.Scanner;

public class DesvioCondicionalEx1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite um número inteiro: ");
        int numero = entrada.nextInt();
        
        if (numero > 20) {
            double metade = numero / 2.0;
            System.out.println("A metade do número é: " + metade);
        }
        
        entrada.close();
    }
}