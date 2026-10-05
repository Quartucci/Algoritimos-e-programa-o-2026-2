import java.util.Scanner;

public class DesvioCondicionalEx13 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite o primeiro número: ");
        double num1 = entrada.nextDouble(); // O algoritmo deve ler dois números[cite: 3]
        
        System.out.print("Digite o segundo número: ");
        double num2 = entrada.nextDouble();
        
        System.out.print("Digite o sinal da operação (+, -, *, /): ");
        char operacao = entrada.next().charAt(0); // Utilize o tipo char para ler a operação[cite: 3]
        
        // Criar uma calculadora de operações básicas: soma, subtração, multiplicação e divisão[cite: 3]
        switch (operacao) {
            case '+':
                System.out.println("Resultado: " + (num1 + num2)); // No final deve ser impresso o resultado[cite: 3]
                break;
            case '-':
                System.out.println("Resultado: " + (num1 - num2));
                break;
            case '*':
                System.out.println("Resultado: " + (num1 * num2));
                break;
            case '/':
                // Para a operação de divisão verificar se o divisor é válido (maior que zero)[cite: 3]
                if (num2 > 0) {
                    System.out.println("Resultado: " + (num1 / num2));
                } else {
                    // Caso seja menor ou igual a zero, informar a mensagem "Impossível dividir!!"[cite: 3]
                    System.out.println("Impossível dividir!!");
                }
                break;
            default:
                // Se o sinal digitado não corresponder a uma operação apresentar a mensagem Sinal Inválido e finalizar[cite: 3]
                System.out.println("Sinal Inválido");
                break;
        }
        
        entrada.close();
    }
}