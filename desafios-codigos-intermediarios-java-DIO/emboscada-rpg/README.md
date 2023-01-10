<h2>Desafio: Emboscada no RPG</h2>

Desafio proposto pela DIO, segue as informações abaixo:

<b>Desafio</b><br>
Você e seus amigos estão jogando uma partida de RPG (Role-Playing Game) utilizando um dado de 10 lados. Em um determinado momento, em uma masmorra escura, o seu personagem foi emboscado por um terrível goblin. Como em todo bom RPG, temos alguns parâmetros que definem os status dos personagens:

<b>Vida:</b> Pontos que devem ser maiores que 0, se não o personagem morre.<br>
<b>Ataque:</b> Pontos que definem quanto de dano ele inflingirá nos outros personagens.<br>
<b>Defesa:</b> Pontos que definem quanto dano será mitigado quando ele levar um ataque.

O dado é um modificador desses parâmetros. Quando você joga o dado o valor dele deve ser somado ao seu <b>ataque</b> ou a sua <b>defesa</b>. Quando o valor do dado for maior que 8 e menor que 10, o jogador tira um crítico e essa soma deve ser <b>DOBRADA</b>.

O dano causado ao jogador é calculado dessa forma:
<b><br>vidaDoJogador - (ataqueInimigo - (defesaDoJogador + dados))</b>

O dano causado ao inimigo é calculado dessa forma:
<b><br>vidaDoInimigo - (ataqueDoJogador + dados)</b>

Caso o jogador sobreviva a emboscada, ele contra-ataca.

Para deixar a jogatina mais rápida, fazendo o computador realizar as contas matemáticas, você decidiu criar esse programa para verificar se seu personagem vai sobreviver e contra-atacar ou morrer.

<b>Entrada</b><br>
A entrada serão seis parâmetros nessa ordem:
Dados;<br>
Vida do Jogador;<br>
Ataque do Jogador;<br>
Defesa do Jogador;<br>
Vida do Inimigo;<br>
Ataque do Inimigo;

<b>Saída</b><br>
A saída deve ser verificado se o jogador sobreviveu ao ataque ou não. Caso ele tenha sobrevivido, verificar se o contra-ataque dele foi eficaz e matou o inimigo ou não. Em seguida, para cada caso, imprima na tela as respectivas ocorrências.

<b>Exemplo</b>
<table>
    <tr>
        <td>Entrada</td>
        <td>Saída</td>
    </tr>
    <tr>
        <td>
            2<br>
            6<br>
            6<br>
            4<br>
            5<br>
            14
        </td>
        <td>"Jogador nao sobreviveu"</td>
    </tr>
    <tr>
        <td>
            8<br>
            6<br>
            6<br>
            4<br>
            5<br>
            14
        </td>
        <td>"Jogador sobreviveu e derrotou o inimigo"</td>
    <tr>
        <td>
            6<br>
            12<br>
            6<br>
            8<br>
            14<br>
            7
        </td>
        <td>"Jogador sobreviveu e nao derrotou o inimigo"</td>
    </tr>
</table>

// IMPORTANTE: Para ler os dados de entrada do usuário, utilize a classe Scanner,<br>
// instanciando seu leitor da seguinte forma: "Scanner leitor = new Scanner(System.in);".<br>
// Por outro lado, para imprimir suas saídas, utilize System.out.print ou System.out.println.