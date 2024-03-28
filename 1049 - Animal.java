import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Lê as três palavras
        String palavra1 = scanner.next();
        String palavra2 = scanner.next();
        String palavra3 = scanner.next();
        
        // Verifica qual animal corresponde às palavras fornecidas
        if (palavra1.equals("vertebrado")) {
            if (palavra2.equals("ave")) {
                if (palavra3.equals("carnivoro")) {
                    System.out.println("aguia");
                } else { // palavra3.equals("onivoro")
                    System.out.println("pomba");
                }
            } else { // palavra2.equals("mamifero")
                if (palavra3.equals("onivoro")) {
                    System.out.println("homem");
                } else { // palavra3.equals("herbivoro")
                    System.out.println("vaca");
                }
            }
        } else { // palavra1.equals("invertebrado")
            if (palavra2.equals("inseto")) {
                if (palavra3.equals("hematofago")) {
                    System.out.println("pulga");
                } else { // palavra3.equals("herbivoro")
                    System.out.println("lagarta");
                }
            } else { // palavra2.equals("anelideo")
                if (palavra3.equals("hematofago")) {
                    System.out.println("sanguessuga");
                } else { // palavra3.equals("onivoro")
                    System.out.println("minhoca");
                }
            }
        }
        
        scanner.close();
    }
}
