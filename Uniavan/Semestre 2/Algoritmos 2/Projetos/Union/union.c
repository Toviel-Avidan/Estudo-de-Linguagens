#include <stdio.h>

typedef union
{
    char c;
    int i;
} Data;

int main()
{
    Data d;

    d.i = 72;
    printf("Como Inteiro: %d\n", d.i);

    printf("Como caractere: %c\n", d.c);

    return 0;
}
