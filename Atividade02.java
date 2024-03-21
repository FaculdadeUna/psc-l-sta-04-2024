import java.util.Scanner;

public class Atividade02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String usuario, senha;

        while (true) {
            System.out.print("Usuario: ");
            usuario = scanner.nextLine();
            System.out.print("Senha: ");
            senha = scanner.nextLine();

            if (usuario.equals(senha)) {
                System.out.println("Usuario e Senha iguais, Tente Novamente.");
            } else {
                System.out.println("Usuario Cadastrado");
                break;
            }
        }
        scanner.close();
    }
}