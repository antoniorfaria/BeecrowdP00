import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int horas = N / 3600;
        N %= 3600;
        int minutos = N / 60;
        N %= 60;
        int segundos = N;
        System.out.printf("%d:%d:%d\n", horas, minutos, segundos);
    }
}