import java.util.Scanner;

public class WhileEx7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int contador = 1;
        int pessoasSemObesidade = 0; // Variável para contar quem está no peso ideal
        
        while (contador <= 10) {
            System.out.println("--- Dados da Pessoa " + contador + " ---");
            
            System.out.println("Digite o peso (em kg):");
            double peso = scanner.nextDouble();
            
            System.out.println("Digite a altura (em metros, ex: 1,75):");
            double altura = scanner.nextDouble();
            
            // Cálculo do IMC: peso dividido pela altura ao quadrado
            double imc = peso / (altura * altura);
            
            // Verifica se o IMC está dentro do intervalo considerado sem obesidade
            if (imc >= 18.5 && imc <= 24.9) {
                pessoasSemObesidade++;
            }
            
            contador++; // Passa para a próxima pessoa
        }
        
        System.out.println("---------------------------------------------------");
        System.out.println("Total de pessoas sem obesidade (IMC entre 18.5 e 24.9): " + pessoasSemObesidade);
        
        scanner.close();
    }
}