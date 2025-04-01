package vetor.arraymatriz;

public class ArrayMatriz {

    public static void main(String[] args) {

        // INTEIROS
        // Forma 1: declarando tamanho e depois atribuindo valores
        int[] numeros = new int[3];

        numeros[0] = 10;
        numeros[1] = 20;
        numeros[2] = 30;

        /*
Vantagens:
- Permite criar uma matriz quando você conhece o tamanho, mas ainda não sabe os valores.
- Ideal para preencher a matriz com dados do usuário ou de cálculos durante a execução do programa.

Desvantagens:
- Mais trabalhosa, pois é necessário preencher cada posição manualmente.
- Inicialmente, os elementos têm valores padrão:
	0 para int e double
	'\u0000' (vazio) para char
	null para String
         */
        // Forma 2: declarando e inicializando direto
        int[] valores = {1, 2, 3, 4, 5};

        /*
Vantagens:
- Muito prática e compacta.
- Ideal quando você já sabe os valores da matriz no momento da criação.
- Deixa o código mais legível e organizado.

Desvantagens:
- Só pode ser usada na linha de declaração.
- Se tentar atribuir os valores diretamente em outro momento, o compilador apresentará erro
         */
        // Forma 3: usando new com inicialização
        int[] maisNumeros = new int[]{100, 200, 300};

        /*
Vantagens:
- Permite inicializar a matriz com valores fora da declaração, o que é útil em situações em que a criação e a atribuição são feitas separadamente.
- Mantém a clareza dos dados e ainda é flexível.

Desvantagens:
- Mais verbosa (maior quantidade de código) que a forma direta.
- Menos usada no dia a dia, mas essencial em casos específicos.
         */
        // DOUBLE
        // Forma 1: declarando e depois preenchendo
        double[] notas = new double[2];
        notas[0] = 8.5;
        notas[1] = 9.0;

        // Forma 2: inicialização direta
        double[] precos = {10.99, 20.75, 5.50};

        // Forma 3: com new e valores
        double[] medidas = new double[]{1.75, 1.80, 1.65};

        // CHAR
        // Forma 1: declaração com tamanho fixo
        char[] vogais = new char[5];
        vogais[0] = 'a';
        vogais[1] = 'e';
        vogais[2] = 'i';
        vogais[3] = 'o';
        vogais[4] = 'u';

        // Forma 2: inicialização direta
        char[] letras = {'A', 'B', 'C'};

        // Forma 3: com new
        char[] simbolos = new char[]{'#', '@', '&'};

        // STRING
        // Forma 1: criando e preenchendo depois
        String[] nomes = new String[3];
        nomes[0] = "Ana";
        nomes[1] = "João";
        nomes[2] = "Carlos";

        // Forma 2: inicializando diretamente
        String[] frutas = {"Maçã", "Banana", "Pera"};

        // Forma 3: com new e valores
        String[] cores = new String[]{"Azul", "Verde", "Amarelo"};

        // M A T R I Z
        //INT
        // Forma 1: declarando com tamanho fixo e preenchendo depois
        int[][] matriz1 = new int[2][3];
        matriz1[0][0] = 1;
        matriz1[0][1] = 2;
        matriz1[0][2] = 3;
        matriz1[1][0] = 4;
        matriz1[1][1] = 5;
        matriz1[1][2] = 6;

        // Forma 2: inicialização direta na declaração
        int[][] matriz2 = {
            {10, 20, 30},
            {40, 50, 60}
        };

        // Forma 3: usando new com valores
        int[][] matriz3 = new int[][]{
            {100, 200},
            {300, 400}
        };

        // DOUBLE
        // Forma 1: declarando e preenchendo depois
        double[][] temp = new double[2][2];
        temp[0][0] = 7.5;
        temp[0][1] = 8.0;
        temp[1][0] = 9.2;
        temp[1][1] = 6.8;

        // Forma 2: inicializando diretamente
        double[][] cotacoes = {
            {12.99, 15.49},
            {8.75, 10.30}
        };

        // Forma 3: usando new com dados
        double[][] medicoes = new double[][]{
            {1.70, 1.65},
            {1.80, 1.75}
        };

        // CHAR
        // Forma 1: declarando com tamanho fixo
        char[][] tabuleiro = new char[3][3];
        tabuleiro[0][0] = 'X';
        tabuleiro[1][1] = 'O';
        tabuleiro[2][2] = 'X';

        // Forma 2: inicialização direta
        char[][] letrasAlfabeto = {
            {'A', 'B'},
            {'C', 'D'}
        };

        // Forma 3: com new
        char[][] simbolosEspeciais = new char[][]{
            {'@', '#'},
            {'&', '*'}
        };

        // STRING
        // Forma 1: criando com tamanho fixo e preenchendo
        String[][] nomesAlunos = new String[2][2];
        nomesAlunos[0][0] = "Ana";
        nomesAlunos[0][1] = "Bruno";
        nomesAlunos[1][0] = "Carlos";
        nomesAlunos[1][1] = "Daniela";

        // Forma 2: inicialização direta
        String[][] cidades = {
            {"São Paulo", "Rio"},
            {"Curitiba", "Porto Alegre"}
        };

        // Forma 3: com new e dados
        String[][] cor = new String[][]{
            {"Azul", "Verde"},
            {"Amarelo", "Roxo"}
        };
    }
}
