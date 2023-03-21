import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite um numero");
        int x = scan.nextInt();

        System.out.println("Tabela de multiplicação de " + x + ":");
        for (int i = 0; i <= 10; i++) {
            System.out.println(x + " X " + i + " = " + x * i);
        }
    }
}
