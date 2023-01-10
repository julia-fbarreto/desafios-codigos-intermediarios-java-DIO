import java.util.Arrays;
import java.util.Scanner;

public class diferencaEntreDigitos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero = scan.nextInt();
        int count = 0;

        String numeroEmString = String.valueOf(numero);
        String[] split = numeroEmString.split("");

        int[] ints = Arrays.stream(split).mapToInt(Integer::new).toArray();

        // TODO: Retorne a diferença entre o produto e a soma dos dígitos.

        //Exemplo:
        //Produto de dígitos = 2 * 3 * 4 = 24
        //Soma dos dígitos = 2 + 3 + 4 = 9
        //Resultado = 24 - 9 = 15

        int totalMultiplicacao = 1;
        int totalAdicao = 0;

        for (int i = 0; i < split.length; i++) {
            int numeroEmInt = Integer.parseInt(split[i]);

            totalMultiplicacao = totalMultiplicacao * numeroEmInt;
            totalAdicao += numeroEmInt;
        }

        int resultado = totalMultiplicacao - totalAdicao;
        System.out.println(resultado);
    }
}