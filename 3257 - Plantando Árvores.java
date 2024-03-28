import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        Integer[] T = new Integer[N];

        for (int i = 0; i < N; i++) {
            T[i] = Integer.parseInt(input[i]);
        }

        Arrays.sort(T, Collections.reverseOrder());

        int maxDay = 0;
        for (int i = 0; i < N; i++) {
            maxDay = Math.max(maxDay, i + T[i] + 2);
        }

        System.out.println(maxDay);
    }
}