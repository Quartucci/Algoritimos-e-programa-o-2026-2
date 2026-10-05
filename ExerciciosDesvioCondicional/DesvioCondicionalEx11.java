import java.util.Scanner;

public class DesvioCondicionalEx11 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("Digite a idade do nadador: ");
        int idade = entrada.nextInt();
        
        // Verifica a categoria de acordo com a tabela
        if (idade >= 5 && idade <= 7) {
            System.out.println("Categoria: infantilA");
        } else if (idade >= 8 && idade <= 10) {
            System.out.println("Categoria: infantilB");
        } else if (idade >= 11 && idade <= 13) {
            System.out.println("Categoria: juvenilA");
        } else if (idade >= 14 && idade <= 17) {
            System.out.println("Categoria: juvenilB");
        } else if (idade >= 18) {
            System.out.println("Categoria: Sênior");
        } else {
            System.out.println("Idade menor que 5 anos: fora das categorias classificadas.");
        }
        
        entrada.close();
    }
}