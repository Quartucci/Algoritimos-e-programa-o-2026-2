import java.util.Scanner;

public class DesvioCondicionalEx2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite a idade: ");
        int idade = entrada.nextInt();
        
        // Verifica se a idade é maior ou igual a 18
        if (idade >= 18) {
            System.out.println("Maior de idade");
        } else {
            System.out.println("Menor de idade");
        }
        
        entrada.close();
    }
}
