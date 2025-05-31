//NOME: Samuel Rozini Hirt

#include <stdio.h>
#include <locale.h>

int fatorial(int n)
{
    int fat = 1;

    while(n > 1)
    {
        fat *= n;
        n--;
    }
    return fat;
}

int main()
{
    setlocale(LC_ALL, "Portuguese");

    int num;

    printf("digite um numero: ");
    scanf("%d", &num);

    printf("Fatorial de %d sera %d\n", num, fatorial(num));

    return 0;
}
