//NOME: Samuel Rozini Hirt

#include <stdio.h>
#include <locale.h>

int main()
{
    setlocale(LC_ALL, "Portuguese");

    int numeroInt = 45;
    printf("\nO tamanho da variavel numeroInt é %u bytesz\n", sizeof(numeroInt));

    double numeroDouble = 3.14;
    printf("\nO tamanho da variavel numeroDouble é %u bytesz\n", sizeof(numeroDouble));

    char letraChar = 'letra';
    printf("\nO tamanho da variavel letraChar é %u bytesz\n", sizeof(letraChar));

    return 0;
}
