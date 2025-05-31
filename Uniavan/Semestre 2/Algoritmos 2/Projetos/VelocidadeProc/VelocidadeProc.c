//NOME: Samuel Rozini Hirt

#include <stdio.h>
#include <locale.h>
#include <time.h>

int main()
{
    clock_t inicio, fim;

    double tempo_gasto;

    setlocale(LC_ALL, "Portuguese");

    int mat[3][3];

    inicio = clock();

    for(int i = 0; i < 3; i++)
    {
        for(int j = 0; j < 3; j++)
        {
           printf("Digite um numero %d: ", i );
           scanf("%d", &mat[i][j]);
        }
    }

    for(int i = 0; i < 3; i++)
    {
        for(int j = 0; j < 3; j++)
        {
           printf("\nO numero da matriz na linha %d coluna %d sera: %d", i, j, mat[i][j]);
        }
    }

    fim = clock();
    printf("\n\n");

    for(int i = 0; i < 3; i++)
    {
        for(int j = 0; j < 3; j++)
        {
           printf("%d ", mat[i][j]);
        }
        printf("\n");
    }

    tempo_gasto = ((double)(fim - inicio)) / CLOCKS_PER_SEC;
    printf("Tempo acesso sequencial: %f segundos\n", tempo_gasto);

    return 0;
}
