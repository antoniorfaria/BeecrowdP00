import java.io.IOException;
import java.util.Scanner;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        
        int porcoesCurupira = scanner.nextInt();
        int porcoesBoitata = scanner.nextInt();
        int porcoesBoto = scanner.nextInt();
        int porcoesMapinguari = scanner.nextInt();
        int porcoesIara = scanner.nextInt();
        
        int porcaoCurupira = 300;
        int porcaoBoitata = 1500;
        int porcaoBoto = 600;
        int porcaoMapinguari = 1000;
        int porcaoIara = 150;
        int porcaoDonaChica = 225;
        
        int totalMandioca = porcoesCurupira * porcaoCurupira + porcoesBoitata * porcaoBoitata + porcoesBoto * porcaoBoto + porcoesMapinguari * porcaoMapinguari + porcoesIara * porcaoIara + porcaoDonaChica;
        
        System.out.println(totalMandioca);
    }
