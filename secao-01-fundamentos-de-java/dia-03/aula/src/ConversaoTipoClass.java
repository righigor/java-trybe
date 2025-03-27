import java.util.Scanner;

public class ConversaoTipoClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entre com o primeiro número: ");
        String num1 = scanner.next();
        System.out.println("Entre com o segundo número: ");
        String num2 = scanner.next();

        int n1 = Integer.parseInt(num1);
        int n2 = Integer.parseInt(num2);

        int soma = n1 + n2;
        System.out.println("A soma é: " + soma);
    }
}
