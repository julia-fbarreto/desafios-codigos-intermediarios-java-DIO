import java.util.Scanner;

public class flechaEscudoEspada {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int jogadaJogador = leitor.nextInt();
        int jogadaInimigo = leitor.nextInt();

        //TODO: Crie as condições necessárias para verificar quem vencerá o embate;

        final int FLECHA = 1;
        final int ESCUDO = 2;
        final int ESPADA = 3;

        int resultado = jogadaJogador - jogadaInimigo;

        if (resultado == 0) {
            System.out.println("Empatou");
        } else if (resultado == -1 || resultado == 2) {
            System.out.println("Perdeu");
        } else {
            System.out.println("Ganhou");
        }
    }
}