import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int X = scanner.nextInt();
        int Z = scanner.nextInt();
        
        while (Z <= X) {
            Z = scanner.nextInt();
        }
        
        int soma = X;
        int contador = 1;
        
        while (soma <= Z) {
            X++;
            soma += X;
            contador++;
        }
        
        System.out.println(contador);
    }
}