#include <stdio.h>
#include <locale.h>

int main()
{
    setlocale(LC_ALL, "Portuguese");

    int a, b;
    a = 5;

    b = a;
    a = 8;
    printf("\n a = %d, b = %d", a, b);

    a = b = 5;
    a = 8;
    printf("\n a = %d, b = %d", a, b);
    printf("\n a = %d (%d), b = %d (%x)", a, &a, b, &b);

    return 0;
}
