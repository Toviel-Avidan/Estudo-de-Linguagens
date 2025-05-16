//NOME: Samuel Rozini Hirt

#include <stdio.h>
#include <locale.h>

int main()
{
    setlocale(LC_ALL, "Portuguese");

    int vetor[3] = {10, 20, 30};
    int *ptr = vetor;

    printf("\n\nPrimeiro elemento: %d", *ptr);

    ptr++;
    printf("\n\nSegundo elemento: %d", *ptr);

    ptr++;
    printf("\n\nTerceiro elemento: %d", *ptr);

    ptr -= 2;
    printf("\n\nPrimeiro elemento: %d", *ptr);

    ptr += 2;
    printf("\n\nTerceiro elemento: %d", *ptr);

    return 0;
}
