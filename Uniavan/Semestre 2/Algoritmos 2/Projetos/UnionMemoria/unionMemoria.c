//NOME: Samuel Rozini Hirt

#include <stdio.h>

typedef union
{
    char c;
    int i;
    float f;

} MemoriaCompacta;

int main()
{
    printf("Tamanho de MemoriaCompacta: %lu bytes\n", sizeof(MemoriaCompacta));
    return 0;
}
