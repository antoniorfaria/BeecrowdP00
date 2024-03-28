import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        System.out.println(N);
        int[] notas = {100, 50, 20, 10, 5, 2, 1};
        for (int nota : notas) {
            int quantidade = N / nota;
            System.out.println(quantidade + " nota(s) de R$ " + nota + ",00");
            N %= nota;
        }
    }
}