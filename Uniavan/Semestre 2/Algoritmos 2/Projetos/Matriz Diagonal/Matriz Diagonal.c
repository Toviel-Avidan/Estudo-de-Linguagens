#include <stdio.h>
#include <locale.h>
#include <string.h>

int main()
{
    setlocale(LC_ALL, "Portuguese");

    int lin, col, tab;
    int mat[4][4];

    for (lin=0; lin<=3; lin++)
    {
        for (col=0; col<=3; col++)
        {
            printf("Digite ELEMENTO da linha %d, coluna %d da matriz: ",lin+1,col+1);
// aqui no scanf preenchemos a matriz
            scanf("%d", &mat[lin][col]);
        }
    }
// imprimindo a matriz
    printf("Matriz\n");
    for (lin=0; lin<=3; lin++)
    {
        for (col=0; col<=3; col++)
            printf("%d\t",mat[lin][col]);
        printf("\n\n");
    }
// Imprimindo a diagonal principal
    printf("\n\nDiagonal principal\n\n");
    for (lin=0; lin<=3; lin++)
    {
        printf("%d\n",mat[lin][lin]);
        for (tab=1; tab<=lin+1; tab++)
            printf("\t");
    }
    printf("\n\n");
    system("pause");

    getchar();
    return 0;
}
