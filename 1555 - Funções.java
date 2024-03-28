import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        for (int i = 0; i < N; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            String winner = findWinner(x, y);
            System.out.println(winner);
        }

        scanner.close();
    }

    public static String findWinner(int x, int y) {
        int r = rFunction(x, y);
        int b = bFunction(x, y);
        int c = cFunction(x, y);

        if (r > b && r > c) {
            return "Rafael ganhou";
        } else if (b > r && b > c) {
            return "Beto ganhou";
        } else {
            return "Carlos ganhou";
        }
    }

    public static int rFunction(int x, int y) {
        return (int) (Math.pow(3 * x, 2) + Math.pow(y, 2));
    }

    public static int bFunction(int x, int y) {
        return (int) (2 * Math.pow(x, 2) + Math.pow(5 * y, 2));
    }

    public static int cFunction(int x, int y) {
        return (int) (-100 * x + Math.pow(y, 3));
    }
}
