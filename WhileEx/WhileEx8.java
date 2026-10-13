import java.util.Scanner;

public class WhileEx8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int aluno = 1;
        
        // Laço principal para os 5 alunos
        while (aluno <= 5) {
            System.out.println("--- Notas do Aluno " + aluno + " ---");
            
            double nota1;
            double nota2;
            
            // Validação da primeira nota usando do...while
            do {
                System.out.println("Digite a 1ª nota (entre 0 e 10):");
                nota1 = scanner.nextDouble();
                
                if (nota1 < 0 || nota1 > 10) {
                    System.out.println("Nota inválida! A nota deve estar entre 0 e 10. Tente novamente.");
                }
            } while (nota1 < 0 || nota1 > 10);
            
            // Validação da segunda nota usando do...while
            do {
                System.out.println("Digite a 2ª nota (entre 0 e 10):");
                nota2 = scanner.nextDouble();
                
                if (nota2 < 0 || nota2 > 10) {
                    System.out.println("Nota inválida! A nota deve estar entre 0 e 10. Tente novamente.");
                }
            } while (nota2 < 0 || nota2 > 10);
            
            // Cálculo da média aritmética
            double media = (nota1 + nota2) / 2;
            System.out.println("Média do aluno " + aluno + ": " + media);
            System.out.println(); // Pula uma linha para separar os alunos
            
            aluno++; // Passa para o próximo aluno
        }
        
        scanner.close();
    }
}