#include <stdio.h>
#include <locale.h>

#define TAM 20

int main()
{
    setlocale(LC_ALL, "Portuguese");

    int numeros[TAM], i;

    for (i = 0; i< TAM; i++)
    {
        printf("Posição %d do vetor: ", i);
        scanf("%d", &numeros[i]);
    }

    printf("\n\n");
    printf("os valores pares são: \n\n");

    for (i = 0; i< TAM; i++)
    {
        printf("Posição %d do vetor: ", i);
        if(numeros[i] %2 == 0)
        {
            printf("%d\n", numeros[i]);
        }
    }

    return 0;
}
