import java.util.Scanner;

public class DesvioCondicionalEx7 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite o valor do salário: R$ ");
        double salario = entrada.nextDouble();
        
        System.out.print("Digite o tempo de trabalho na empresa (em anos): ");
        int anosTrabalho = entrada.nextInt();
        
        double bonus;
        
        // Verifica o tempo de casa para definir a porcentagem do bônus
        if (anosTrabalho >= 5) {
            bonus = salario * 0.20; // 20%
        } else {
            bonus = salario * 0.10; // 10%
        }
        
        System.out.println("O valor do bônus calculado é: R$ " + bonus);
        
        entrada.close();
    }
}
