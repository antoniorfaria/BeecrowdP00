import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int t = 1; t <= T; t++) {
            String linha = br.readLine();
            String[] numerosComoString = linha.split("\\D+");
            int soma = 0;
            for (String numeroComoString : numerosComoString) {
                if (!numeroComoString.isEmpty()) {
                    soma += Integer.parseInt(numeroComoString);
                }
            }
            System.out.println(soma);
        }
    }
}