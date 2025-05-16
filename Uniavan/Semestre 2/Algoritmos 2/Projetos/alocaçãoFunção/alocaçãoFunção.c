//NOME: Samuel Rozini Hirt

#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>
#include <string.h>

void popularNumeros(float *numeros)
{
    numeros[0] = 100.1;
    numeros[1] = 200.2;
    numeros[2] = 300.3;
    numeros[3] = 400.4;
}

void mostrarNumeros(float *numeros, int qtdeItens)
{
    for (int ind=0; ind<qtdeItens; ind++)
    {
        printf("\nValor=%.2f", numeros[ind]);
    }

}

float * alocarNumeros(int qtdeItens)
{
    return malloc(sizeof(float)*qtdeItens);
}

int main()
{

    int qtdeItens = 4;
    float *numeros = alocarNumeros(qtdeItens);

    popularNumeros(numeros);
    mostrarNumeros(numeros, qtdeItens);
    free(numeros);

    return 0;

}
