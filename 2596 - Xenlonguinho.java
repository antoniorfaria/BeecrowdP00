import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int C = scanner.nextInt(); // número de casos de teste

        for (int i = 0; i < C; i++) {
            int N = scanner.nextInt(); // quantidade de esferas necessárias para invocar Xenlonguinho
            int count = 0;

            for (int j = 1; j <= N; j++) {
                if (numberOfDivisors(j) % 2 == 0) {
                    count++;
                }
            }

            System.out.println(count);
        }

        scanner.close();
    }

    // Função para calcular o número de divisores de um número
    public static int numberOfDivisors(int n) {
        int count = 0;
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                if (n / i == i) {
                    count++;
                } else {
                    count += 2;
                }
            }
        }
        return count;
    }