public class WhileEx4 {
    public static void main(String[] args) {
        int numero = 10;
        
        while (numero <= 20) {
            // Dividimos por 2.0 para garantir que o resultado tenha casas decimais
            double metade = numero / 2.0; 
            
            System.out.println("a metade de " + numero + " é " + metade);
            
            numero++;
        }
    }
}