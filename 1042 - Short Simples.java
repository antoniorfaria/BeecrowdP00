import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        
        int menor = Math.min(Math.min(a, b), c);
        int maior = Math.max(Math.max(a, b), c);
        int meio = a + b + c - menor - maior;
        
        System.out.println(menor);
        System.out.println(meio);
        System.out.println(maior);
        
        System.out.println();
        
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        
        scanner.close();
    }
}
