import java.util.Scanner;

public class DesvioCondicionalEx10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite o primeiro número: ");
        int num1 = entrada.nextInt();
        
        System.out.print("Digite o segundo número: ");
        int num2 = entrada.nextInt();
        
        System.out.print("Digite o terceiro número: ");
        int num3 = entrada.nextInt();
        
        // Verifica primeiro se TODOS os três números são iguais
        if (num1 == num2 && num2 == num3) {
            System.out.println("os números são iguais");
        } 
        // Caso contrário, descobre qual é o maior
        else {
            int maior;
            
            if (num1 >= num2 && num1 >= num3) {
                maior = num1;
            } else if (num2 >= num1 && num2 >= num3) {
                maior = num2;
            } else {
                maior = num3;
            }
            
            System.out.println("O maior número é: " + maior);
        }
        
        entrada.close();
    }
}