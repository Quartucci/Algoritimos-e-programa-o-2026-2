public class WhileEx5 {
    public static void main(String[] args) {
        int numero = 5;
        int contador = 1;
        
        System.out.println("Tabuada do " + numero + ":");
        
        while (contador <= 10) {
            int resultado = numero * contador;
            System.out.println(numero + " x " + contador + " = " + resultado);
            contador++;
        }
    }
}