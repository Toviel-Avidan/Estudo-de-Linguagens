#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>

int main()
{
    int *populacao;

    populacao = malloc(sizeof(int));
    *populacao = 185000000;

    printf("\nPopulacao=%d", *populacao);

    char *nomePais;
    nomePais = malloc(sizeof(char)* 50);

    strcpy(nomePais,"BRASIL");
    printf("\nNome Pais=%s", nomePais);

    free(populacao);
    free(nomePais);

    return 0;
}
