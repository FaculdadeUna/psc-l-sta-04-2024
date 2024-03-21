import java.util.Scanner;
import java.util.function.Predicate;

public class Atividade03 {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String nome = validaNome("Digite um Nome (Mais de 3 Caracteres): ", s -> s.length() > 3);
        int idade = validaIdade("Digite a Idade (Entre 0 e 150): ", i -> i >= 0 && i <= 150);
        double salario = validaSalario("Digite o Salario (Maior que 0): ", s -> s > 0);
        String sexo = validaSexo("Digite o Sexo ('f' ou 'm'): ", s -> s.equals("f") || s.equals("m"));
        String status = validaStatusCivil("Digite o estado civil ('s', 'c', 'v', 'd'): ",
                s -> "scvd".contains(s) && s.length() == 1);

        System.out.println("\nCadastrastrado com sucesso");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salario: " + salario);
        System.out.println("Sexo: " + sexo);
        System.out.println("Estado Civil: " + status);
    }

    /*
     * ESSA PARTE DE BAIXO ME DEU DOR DE CABEÇA KSKSKSK POR HOJE PAREI !! 22:32 -
     * 20/03/2024 (FIZ E PAREI !!)
     */

    private static String validaNome(String mensagem, Predicate<String> validacao) {
        String dado;
        do {
            System.out.print(mensagem);
            dado = scanner.nextLine();
        } while (!validacao.test(dado));
        return dado;
    }

    private static double validaSalario(String mensagem, Predicate<Double> validacao) {
        double dado = -1;
        do {
            try {
                System.out.print(mensagem);
                dado = Double.parseDouble(scanner.nextLine());
                if (!validacao.test(dado)) {
                    dado = -1;
                }
            } catch (NumberFormatException e) {
                System.out.println("Digite um valor válido.");
            }
        } while (dado == -1);
        return dado;
    }

    private static String validaSexo(String mensagem, Predicate<String> validacao) {
        String dado;
        do {
            System.out.print(mensagem);
            dado = scanner.nextLine().trim().toLowerCase();
        } while (!validacao.test(dado));
        return dado;
    }

    private static String validaStatusCivil(String mensagem, Predicate<String> validacao) {
        String dado;
        do {
            System.out.print(mensagem);
            dado = scanner.nextLine().trim().toLowerCase();
        } while (!validacao.test(dado));
        return dado;
    }

    private static int validaIdade(String mensagem, Predicate<Integer> validacao) {
        int dado = -1;
        do {
            try {
                System.out.print(mensagem);
                dado = Integer.parseInt(scanner.nextLine());
                if (!validacao.test(dado)) {
                    dado = -1;
                }
            } catch (NumberFormatException e) {
                System.out.println("Digite um número válido.");
            }
        } while (dado == -1);
        return dado;
    }
}