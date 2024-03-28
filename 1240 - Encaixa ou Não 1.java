import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        
        for (int i = 0; i < N; i++) {
            long A = scanner.nextLong();
            long B = scanner.nextLong();
            
            if (encaixa(A, B)) {
                System.out.println("encaixa");
            } else {
                System.out.println("nao encaixa");
            }
        }
        
        scanner.close();
    }
    
    public static boolean encaixa(long A, long B) {
        String A_str = Long.toString(A);
        String B_str = Long.toString(B);
        
        if (A_str.length() < B_str.length()) {
            return false;
        }
        
        return A_str.substring(A_str.length() - B_str.length()).equals(B_str);
    }
}