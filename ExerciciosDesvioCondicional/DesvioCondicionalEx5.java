import java.util.Scanner;

public class DesvioCondicionalEx5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite um número inteiro: ");
        int numero = entrada.nextInt();
        
        // Verifica se o número é maior ou igual a 50 E menor ou igual a 100
        if (numero >= 50 && numero <= 100) {
            System.out.println("Pertence ao intervalo");
        } else {
            System.out.println("Não pertence ao intervalo");
        }
        
        entrada.close();
    }
}