public class Atividade04 {
    public static void main(String[] args) {
        double populacaoAlemanha, populacaoURSS, taxaCrescimentoAlemanha, taxaCrescimentoURSS;
        int contadorAnos;

        populacaoAlemanha = 80000;
        populacaoURSS = 200000;

        taxaCrescimentoAlemanha = 3.0 / 100;
        taxaCrescimentoURSS = 1.5 / 100;

        contadorAnos = 0;

        while (populacaoAlemanha < populacaoURSS) {
            populacaoAlemanha += (populacaoAlemanha * taxaCrescimentoAlemanha);
            populacaoURSS += (populacaoURSS * taxaCrescimentoURSS);
            contadorAnos++;
        }

        System.out.println(
                "Sera preciso: " + contadorAnos
                        + " Anos para que a Alemanhã monte seu exercito novamente, passando assim a URSS !!");

    }
}
