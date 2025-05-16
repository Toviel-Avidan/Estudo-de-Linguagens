//NOME: Samuel Rozini Hirt

#include <stdio.h>
#include <locale.h>

int main()
{
    setlocale(LC_ALL, "Portuguese");

    int *ptr = NULL;

    printf("\nEndereco: %d", ptr);
    printf("\n");
    printf("\nValor: %d", *ptr);

    return 0;
}
