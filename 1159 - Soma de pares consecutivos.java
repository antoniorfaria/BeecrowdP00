import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            int X = scanner.nextInt();
            if (X == 0) {
                break;
            }
            
            if (X % 2 != 0) {
                X++;
            }
            
            int soma = 0;
            for (int i = 0; i < 5; i++) {
                soma += X;
                X += 2;
            }
            
            System.out.println(soma);
        }
    }
}