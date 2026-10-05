import java.util.Scanner;

public class DesvioCondicionalEx12 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite o salário: R$ ");
        double salario = entrada.nextDouble();
        
        // Verifica as faixas salariais de acordo com a tabela do Exercício 12[cite: 2]
        if (salario <= 600.00) {
            System.out.println("Isento de desconto do INSS.");
        } else if (salario <= 1200.00) {
            double desconto = salario * 0.20; // 20%[cite: 2]
            System.out.println("Desconto do INSS (20%): R$ " + desconto);
        } else if (salario <= 2000.00) {
            double desconto = salario * 0.25; // 25%[cite: 2]
            System.out.println("Desconto do INSS (25%): R$ " + desconto);
        } else {
            double desconto = salario * 0.30; // 30% para maiores que R$ 2000,00[cite: 2]
            System.out.println("Desconto do INSS (30%): R$ " + desconto);
        }
        
        entrada.close();
    }
}