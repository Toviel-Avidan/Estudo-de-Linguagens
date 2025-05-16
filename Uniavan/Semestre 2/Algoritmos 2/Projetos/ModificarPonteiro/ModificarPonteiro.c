//NOME: Samuel Rozini Hirt

#include <stdio.h>
#include <locale.h>

int main()
{
    setlocale(LC_ALL, "Portuguese");

    int numero = 0;
    int *ptr = &numero;

    printf("\n\nDigite um valor: ");
    scanf("%d", &numero);

    printf("\n\nEndereco da variavel numero %d", &numero);
    printf("\n\nValor da variavel numero %d", numero);

    printf("\n\n\n");

    printf("\n\nEndereco da variavel ponteiro %d", ptr);
    printf("\n\nValor da variavel ponteiro %d", *ptr);

    printf("\n\n\n");
    printf("Depois da alteracao");

    *ptr = 50;
    printf("\n\n\n");

    printf("\n\nEndereco da variavel numero %d", &numero);
    printf("\n\nValor da variavel numero %d", numero);

    printf("\n\n\n");

    printf("\n\nEndereco da variavel ponteiro %d", ptr);
    printf("\n\nValor da variavel ponteiro %d", *ptr);


    return 0;
}
