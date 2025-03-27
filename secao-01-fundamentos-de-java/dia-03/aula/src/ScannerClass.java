import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Qual é o seu nome: ");
        String nome = scanner.next();
        System.out.println("Boas vindas, " + nome + "!");
        scanner.close();
    }
}
