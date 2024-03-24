import java.util.Scanner;

public class Atividade05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double populacaoAlemanha, populacaoURSS, taxaCrescimentoAlemanha, taxaCrescimentoURSS;
        int contadorAnos;
        String resposta;

        do {
            System.out.println("Qual a População da Alemanha: ");
            populacaoAlemanha = scanner.nextDouble();
            while (populacaoAlemanha <= 0) {
                System.out.println("A população Alemã deve ser mairo que 0, Faz de novo BURRÃO !");
                populacaoAlemanha = scanner.nextDouble();
            }

            System.out.println("Qual a População da URSS: ");
            populacaoURSS = scanner.nextDouble();
            while (populacaoURSS <= 0) {
                System.out.println("A população Sovietica deve ser mairo que 0, Faz de novo BURRÃO !");
                populacaoURSS = scanner.nextDouble();
            }

            System.out.println("Informe a Taxa de crescimento dos Chucrutes (Alemães) em %: ");
            taxaCrescimentoAlemanha = scanner.nextDouble() / 100;
            while (taxaCrescimentoAlemanha <= 0) {
                System.out.println("A taxa de crescimento Alemã deve ser mairo que 0, Faz de novo BURRÃO !");
                taxaCrescimentoAlemanha = scanner.nextDouble();
            }

            System.out.println("Informe a Taxa de crescimento dos Passa Fome (Sovieticos) em %: ");
            taxaCrescimentoURSS = scanner.nextDouble() / 100;
            while (taxaCrescimentoURSS <= 0) {
                System.out.println("A taxa de crescimento Sovietica deve ser mairo que 0, Faz de novo BURRÃO !");
                taxaCrescimentoURSS = scanner.nextDouble();
            }

            contadorAnos = 0;
            while (populacaoAlemanha < populacaoURSS) {
                populacaoAlemanha += (populacaoAlemanha * taxaCrescimentoAlemanha);
                populacaoURSS += (populacaoURSS * taxaCrescimentoURSS);
                contadorAnos++;
            }
            System.out.println("Vai precisar de " + contadorAnos + " anos para que a Alemanha passe a URSS");

            System.out.println("Quer realizar outra Simulação ? (S/N)");
            resposta = scanner.next();
        } while (resposta.equalsIgnoreCase("S"));

        scanner.close();
    }
}
