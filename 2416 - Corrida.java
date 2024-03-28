import java.io.IOException;
import java.util.Scanner;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int pressaoDesejada = scanner.nextInt();
        int pressaoLida = scanner.nextInt();
        
        int diferenca = pressaoDesejada - pressaoLida;
        
        System.out.println(diferenca);
        
        scanner.close();
    }
}
