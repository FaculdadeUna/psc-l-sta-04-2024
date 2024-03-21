import java.util.Scanner;

public class Atividade01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Coloque uma nota com o valor entre 0 e 10: ");

        while (true) {
            double nota = scanner.nextDouble();

            if (nota >= 0 && nota <= 10) {
                System.out.println("Nota Valida " + nota);
                break;
            } else {
                System.out.print("Nota Invalida, insira uma nota entre 0 e 10 valida: ");
            }
        }
        scanner.close();
    }
}