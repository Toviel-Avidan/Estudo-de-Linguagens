#include <stdio.h>
#include <locale.h>
#include <stdlib.h>
#include <time.h>

#define MAX_TAM 100

int random(int n)
{
    return rand() % n;
}

int existe(int indiceAtual, int vetor[], int novoNumero)
{
    for (int i = 0; i < indiceAtual; i++)
    {
        if(vetor[i] == novoNumero)
            return 1;
    }

    return 0;
}

int main()
{
    srand(time(NULL));
    setlocale(LC_ALL, "Portuguese");

    int cheques[MAX_TAM];
    int temp = 0;
    int maior = 0;
    int posMaior = 0;

    int i = 0;
    int numero = 0;

    do
    {
        numero = random(100)+1;

        if (existe(i,cheques,numero) == 0)
        {
            cheques[i] = numero;
            i++;
        }
    }
    while (i < MAX_TAM);

    printf("Vetor inicial:\n");

    for(i = 0; i < MAX_TAM; i++)
    {
        printf(" %d ", cheques[i]);
    }

    printf("\n\n");

    for(i = 0; i < MAX_TAM; i++)
    {
        for(int j = 0; j <= (MAX_TAM - i - 1); j++)
        {
            if(cheques[j] > maior)
            {
                maior = cheques[j];
                posMaior = j;
            }
        }

        temp = cheques[MAX_TAM - i - 1];
        cheques[MAX_TAM - i - 1] = maior;
        maior = 0;
        cheques[posMaior] = temp;
    }

    printf("\n\n");
    printf("Vetor ordenado:\n");

    for(i = 0; i < MAX_TAM; i++)
    {
        printf(" %d ", cheques[i]);
    }

}
