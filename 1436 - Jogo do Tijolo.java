import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();
        for (int t = 1; t <= T; t++) {
            int N = scanner.nextInt();
            int[] ages = new int[N];
            for (int i = 0; i < N; i++) {
                ages[i] = scanner.nextInt();
            }

            int captainAge = findCaptainAge(N, ages);
            System.out.println("Case " + t + ": " + captainAge);
        }

        scanner.close();
    }

    public static int findCaptainAge(int N, int[] ages) {
        if (N % 2 == 0) {
            return -1; // Número de jogadores não é ímpar
        }

        int midIndex = N / 2;
        return ages[midIndex];
    }
}
