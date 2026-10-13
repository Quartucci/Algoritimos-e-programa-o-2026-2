import java.util.Scanner;

public class WhileEx6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int contador = 1;
        int menor = 0; // Variável para armazenar o menor número
        
        while (contador <= 10) {
            System.out.println("Digite o " + contador + "º número (inteiro e positivo):");
            int numero = scanner.nextInt();
            
            // Se for o primeiro número digitado, ele automaticamente é o menor até agora
            if (contador == 1) {
                menor = numero;
            } else if (numero < menor) {
                // Para os próximos números, verifica se o valor atual é menor que o armazenado
                menor = numero;
            }
            
            contador++;
        }
        
        System.out.println("O menor número digitado foi: " + menor);
        
        scanner.close();
    }
}