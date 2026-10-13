import java.util.Scanner;

public class WhileEx3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite um número limite:");
        int limite = scanner.nextInt();
        
        int valor = 1; // A sequência começa em 1
        
        while (valor <= limite) {
            System.out.println(valor);
            valor *= 2; // Multiplica o valor atual por 2 para o próximo passo
        }
        
        scanner.close();
    }
}