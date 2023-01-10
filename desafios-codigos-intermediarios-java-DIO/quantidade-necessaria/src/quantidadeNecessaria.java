import java.util.Scanner;

public class quantidadeNecessaria {
    public static void main(String[] args) {
        final int SLICE = 4;
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();

        // TODO: Retorne o número de pizzas necessárias para atender o pedido.

    //Entrada: A primeira linha de entrada conterá um único inteiro T,indicando o número de casos de teste.
    //Cada caso de teste consiste em dois inteiros.
    // N para o número de amigos e X para a quantidade de fatia que cada amigo deseja.

        //número de amigos
        double N = scanner.nextInt();
        //quantidade de fatias que cada amigo deseja
        double X = scanner.nextInt();

        double quantidadeTotalDeFatias = N * X;
        //System.out.println(quantidadeTotalDeFatias);

        double quantidadeDePizza = quantidadeTotalDeFatias / SLICE;
        //System.out.println(Math.round(quantidadeDePizza));
        //System.out.println(Math.round(((double)quantidadeDePizza / 2)+0.5d));
        System.out.println(Math.ceil(quantidadeDePizza));

        System.out.println(quantidadeDePizza);

        System.out.println(Math.round(quantidadeDePizza));
    }
}