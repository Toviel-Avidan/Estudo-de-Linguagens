//NOME: Samuel Rozini Hirt

#include <stdio.h>
#include <locale.h>

int main()
{
    setlocale(LC_ALL, "Portuguese");

    //definição do tamanho da matriz
    int nl, nc;
    printf ("\nEntre com o numero de linhas da matriz = ");
    scanf ("%d", &nl);
    printf ("\nEntre com o numero de colunas da matriz = ");
    scanf ("%d", &nc);

    // entrada de dados da matriz
    int matriz[nl][nc], i, j;
    for (i=0; i<nl; i++)
    {
        for (j=0; j<nc; j++)
        {
            printf("\nEntre com o elemento[%d][%d]=",i+1,j+1);
            scanf ("%d", &matriz[i][j]);
        }
    }

    //impressão da matriz na tela
    for (i=0; i<nl; i++)
    {
        printf("\n |"); //barra vertical
        for (j=0; j<nc; j++)
            printf (" %d ",matriz[i][j]);
        printf("|");
    }

    getchar();
    return 0;
}
