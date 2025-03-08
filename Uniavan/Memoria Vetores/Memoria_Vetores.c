#include "stdio.h"
#include "locale.h"

int main ()
{
    int vetor[4];

    vetor[0] = 10;
    vetor[1] = 46;
    vetor[2] = 41;
    vetor[3] = 60;

    vetor[4] = 200;

    printf("Valores do vetor:\n");

    for (int i = 0; i <= 20; i++)
    {
        printf("vetor[%d] = %d\n", i, vetor[i]);
    }
    return 0;
}
