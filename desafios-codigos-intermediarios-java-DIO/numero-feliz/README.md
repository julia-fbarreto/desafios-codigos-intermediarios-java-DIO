<h2>Desafio: Número Feliz</h2>

Desafio proposto pela DIO, segue as informações abaixo:

<b>Desafio</b><br>
Um número feliz é um número definido pelo seguinte processo:

• Começando com qualquer número inteiro positivo, substitua o número pela soma dos quadrados de seus dígitos.<br>
• Repita o processo até que o número seja igual a 1 (onde ficará), ou faça um loop infinito em um ciclo que não inclua 1.<br>
• Aqueles números para os quais esse processo termina em 1 são felizes.<br>
• Retorna true se n for um número feliz e false se não for.

Escreva um algoritmo para determinar se o número n é feliz.

<b>Entrada</b><br>
A entrada será feita por um número inteiro, correpondente ao valor de entrada para verificar se  o número é feliz ou não.

<b>Saída</b><br>
Retorne true, caso o número seja feliz, e retorne false, caso o número não seja feliz.

Confira exemplo abaixo:

<b>Exemplo 1</b>
<table>
    <tr>
        <td>Entrada</td>
        <td>Saída</td>
    </tr>
    <tr>
        <td>19</td>
        <td>true</td>
    </tr>
</table>

Explicação:<br>
1² + 9² = 82<br>
8² + 2² = 68<br>
6² + 8² = 100<br>
1² + 0² + 0² = 1

<b>Exemplo 2</b>
<table>
    <tr>
        <td>Entrada</td>
        <td>Saída</td>
    </tr>
    <tr>
        <td>2</td>
        <td>false</td>
    </tr>
</table>

// IMPORTANTE: Para ler os dados de entrada do usuário, utilize a classe Scanner,<br>
// instanciando seu leitor da seguinte forma: "Scanner leitor = new Scanner(System.in);".<br>
// Por outro lado, para imprimir suas saídas, utilize System.out.print ou System.out.println.