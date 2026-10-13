import java.util.Scanner;

public class WhileEx9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double valorTotalCompra = 0.0;
        char continuar;
        
        do {
            // Exibição do Menu
            System.out.println("\n--- Cardápio ---");
            System.out.println("100 - Cachorro quente - R$ 1,20");
            System.out.println("101 - Bauru Simples   - R$ 1,30");
            System.out.println("102 - Bauru com ovo   - R$ 1,50");
            System.out.println("103 - Hambúrguer      - R$ 1,20");
            System.out.println("104 - Cheeseburguer   - R$ 1,70"); // Valor assumido
            System.out.println("----------------");
            
            System.out.println("Digite o código do produto desejado:");
            int codigo = scanner.nextInt();
            
            System.out.println("Digite a quantidade:");
            int quantidade = scanner.nextInt();
            
            double precoProduto = 0.0;
            boolean codigoValido = true;
            
            // Verifica qual foi o produto escolhido e define o preço
            switch (codigo) {
                case 100:
                    precoProduto = 1.20;
                    break;
                case 101:
                    precoProduto = 1.30;
                    break;
                case 102:
                    precoProduto = 1.50;
                    break;
                case 103:
                    precoProduto = 1.20;
                    break;
                case 104:
                    precoProduto = 1.70;
                    break;
                default:
                    System.out.println("Código inválido! Tente novamente.");
                    codigoValido = false;
            }
            
            // Se o código for válido, calcula o total do item e soma ao total da compra
            if (codigoValido) {
                double totalItem = precoProduto * quantidade;
                valorTotalCompra += totalItem;
                System.out.printf("Valor a pagar por este item: R$ %.2f\n", totalItem);
            }
            
            // Pergunta se o usuário quer continuar
            System.out.println("\nDeseja continuar comprando? (S para Sim / N para Não):");
            continuar = scanner.next().toUpperCase().charAt(0);
            
        } while (continuar == 'S');
        
        // Exibe o total final da compra
        System.out.println("\n==================================");
        System.out.printf("VALOR TOTAL DA COMPRA: R$ %.2f\n", valorTotalCompra);
        System.out.println("==================================");
        
        scanner.close();
    }
}