import java.util.Scanner;

public class DesvioCondicionalEx8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite a senha: ");
        String senha = entrada.nextLine();
        
        // Verifica se a string digitada é exatamente igual a "R10p5"
        if (senha.equals("R10p5")) {
            System.out.println("acesso concedido");
        } else {
            System.out.println("acesso negado");
        }
        
        entrada.close();
    }
}