import java.util.Scanner;

public class DesvioCondicionalEx3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite o primeiro número: ");
        int num1 = entrada.nextInt();
        
        System.out.print("Digite o segundo número: ");
        int num2 = entrada.nextInt();
        
        // Verifica se são iguais
        if (num1 == num2) {
            System.out.println("Números iguais");
        } 
        // Se não forem iguais, verifica qual é o maior para fazer a subtração
        else if (num1 > num2) {
            int diferenca = num1 - num2;
            System.out.println("A diferença do maior pelo menor é: " + diferenca);
        } 
        else {
            int diferenca = num2 - num1;
            System.out.println("A diferença do maior pelo menor é: " + diferenca);
        }
        
        entrada.close();
    }
}