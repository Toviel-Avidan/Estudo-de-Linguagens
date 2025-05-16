//NOME: Samuel Rozini Hirt

#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>

int main()
{

    int *numero;
    numero = malloc(sizeof(int));

    *numero = 100;
    printf("\nValor=%d", *numero);

    free(numero);

    int *numeros;
    numeros = malloc(sizeof(int)*4);

    numeros[0] = 100;
    numeros[1] = 200;
    numeros[2] = 300;
    numeros[3] = 400;

    printf("\nEndereco 1=%d", &numeros[0]);
    printf("\nEndereco 1=%d", &numeros[1]);
    printf("\nEndereco 1=%d", &numeros[2]);
    printf("\nEndereco 1=%d", &numeros[3]);

    printf("\nValor=%d", numeros[0]);
    printf("\nValor=%d", numeros[1]);
    printf("\nValor=%d", numeros[2]);
    printf("\nValor=%d", numeros[3]);

    free(numeros);

    return 0;

}
