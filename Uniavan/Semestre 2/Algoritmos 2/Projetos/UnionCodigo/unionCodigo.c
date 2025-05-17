//NOME: Samuel Rozini Hirt

#include <stdio.h>

typedef union
{

    int codigo;
    char letra;

} Codigo;

typedef struct
{

    Codigo cod;

} Registro;

int main()
{
    Registro r;
    r.cod.codigo = 123;
    printf("Codigo: %d\n", r.cod.codigo);

    return 0;
}
