//NOME: Samuel Rozini Hirt

#include <stdio.h>

typedef union
{

    int i;
    float f;

} Elemento;

int main()
{
    Elemento lista[3];

    lista[0].i = 1;
    lista[1].f = 2.5;
    lista[2].i = 3;

    printf("Elemento 0: %d\n", lista[0].i);
    printf("Elemento 1: %f\n", lista[1].f);
    printf("Elemento 2: %d\n", lista[2].i);

    return 0;
}
