import java.util.Scanner;

public class DesvioCondicionalEx9 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite o salário bruto: R$ ");
        double salarioBruto = entrada.nextDouble();
        
        System.out.print("Digite o valor da prestação: R$ ");
        double valorPrestacao = entrada.nextDouble();
        
        // Calcula o limite máximo da prestação (30% do salário bruto)
        double limitePrestacao = salarioBruto * 0.30;
        
        // Verifica se o valor da prestação ultrapassa o limite
        if (valorPrestacao <= limitePrestacao) {
            System.out.println("Empréstimo pode ser concedido!");
        } else {
            System.out.println("Empréstimo não pode ser concedido!");
        }
        
        entrada.close();
    }
}