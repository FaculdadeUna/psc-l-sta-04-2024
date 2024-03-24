import java.util.Scanner;

public class RestoAtividades {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        StringBuilder sequenciaHorizontal = new StringBuilder();
        System.out.println("Números de 1 a 20:");
        for (int contador = 1; contador <= 20; contador++) {
            System.out.println(contador);
            sequenciaHorizontal.append(contador).append(" ");
        }
        System.out.println(sequenciaHorizontal + "\n");

        int numeroMaior = Integer.MIN_VALUE, totalSoma = 0;
        System.out.println("Digite 5 números:");
        for (int contador = 0; contador < 5; contador++) {
            int valorAtual = leitor.nextInt();
            if (valorAtual > numeroMaior)
                numeroMaior = valorAtual;
            totalSoma += valorAtual;
        }
        System.out.println("maior número: " + numeroMaior);
        System.out.println("soma: " + totalSoma);
        System.out.println("media: " + (totalSoma / 5.0) + "\n");

        System.out.println("Numeros ímpares entre 1 e 50:");
        for (int impar = 1; impar <= 50; impar += 2) {
            System.out.println(impar);
        }

        System.out.println("Digite dois numeros para o intervalo:");
        int inicioIntervalo = leitor.nextInt(), fimIntervalo = leitor.nextInt();

        if (inicioIntervalo > fimIntervalo) {
            int temporario = inicioIntervalo;
            inicioIntervalo = fimIntervalo;
            fimIntervalo = temporario;
        }

        System.out.println("Numeros no intervalo entre " + inicioIntervalo + " e " + fimIntervalo + ":");
        for (int intervalo = inicioIntervalo + 1; intervalo < fimIntervalo; intervalo++) {
            System.out.println(intervalo);
        }

        leitor.close();
    }
}
