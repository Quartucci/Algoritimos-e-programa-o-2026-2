import java.util.Scanner;

public class DesvioCondicionalEx6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite a sua altura (em metros, ex: 1,75): ");
        double altura = entrada.nextDouble();
        
        System.out.print("Digite o seu sexo (M para masculino ou F para feminino): ");
        // Lê a entrada, converte para maiúsculo e pega apenas a primeira letra
        char sexo = entrada.next().toUpperCase().charAt(0);
        
        double pesoIdeal = 0;
        
        // Verifica o sexo para aplicar a fórmula correta
        if (sexo == 'M') {
            pesoIdeal = (72.7 * altura) - 58;
            System.out.println("O seu peso ideal é: " + pesoIdeal + " kg");
        } 
        else if (sexo == 'F') {
            pesoIdeal = (62.1 * altura) - 44.7;
            System.out.println("O seu peso ideal é: " + pesoIdeal + " kg");
        } 
        else {
            System.out.println("Sexo inválido! Por favor, digite M ou F.");
        }
        
        entrada.close();
    }
}