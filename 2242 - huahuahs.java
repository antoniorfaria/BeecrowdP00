import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String risada = scanner.nextLine();

        if (isEngracada(risada)) {
            System.out.println("S");
        } else {
            System.out.println("N");
        }

        scanner.close();
    }

    public static boolean isEngracada(String risada) {
        String vogais = "aeiou";
        risada = risada.replaceAll("[^aeiou]", "");

        return risada.equals(new StringBuilder(risada).reverse().toString());
    }
}
