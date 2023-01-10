import java.util.Scanner;

public class emboscadaRpg {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int dados = leitor.nextInt();
        int vidaDoJogador = leitor.nextInt();
        int ataqueDoJogador = leitor.nextInt();
        int defesaDoJogador = leitor.nextInt();
        int vidaDoInimigo = leitor.nextInt();
        int ataqueDoInimigo = leitor.nextInt();


        //TODO: Crie as condições necessárias para verificar se o jogador vai sobreviver, e contra-atacar, ou morrer;

        //maior que zero senão morre
        int vida = 0;

        /* Quando o valor do dado for maior que 8 e menor que 10,
        o jogador tira um crítico e essa soma deve ser DOBRADA.
         */
        // int valorDado ((dados > 8 && dados <10) * 2);

        // "Jogador nao sobreviveu" (danojogador -0 e danoinimigo -0)
        // "Jogador sobreviveu e derrotou o inimigo" (danojogador 4 e danoinimigo -9)
        // "Jogador sobreviveu e nao derrotou o inimigo" (danojogador 19 e danoinimigo 2)

        int somaDefesa = defesaDoJogador + dados;
        int somaAtaque = ataqueDoJogador + dados;
        if (dados == 9) {
            somaDefesa = somaDefesa * 2;
            somaAtaque = somaAtaque * 2;
        }


        //danojogador -> vidaDoJogador - (ataqueInimigo - (defesaDoJogador + dados))
        int danoJogador = vidaDoJogador - (ataqueDoInimigo - somaDefesa);
        System.out.println(danoJogador);

        //danoInimigo -> vidaDoInimigo - (ataqueDoJogador + dados)
        int danoInimigo = vidaDoInimigo - (somaAtaque);
        System.out.println(danoInimigo);



        if (danoJogador <= vida) {
            System.out.println("Jogador nao sobreviveu");
        } else if (danoJogador > vida && danoInimigo <= vida) {
            System.out.println("Jogador sobreviveu e derrotou o inimigo");
        } else  {
            System.out.println("Jogador sobreviveu e nao derrotou o inimigo");

        }
    }
}