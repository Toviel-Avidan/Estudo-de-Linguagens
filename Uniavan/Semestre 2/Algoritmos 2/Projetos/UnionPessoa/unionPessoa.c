//NOME: Samuel Rozini Hirt

#include <stdio.h>

typedef union
{
    char nome[50];
    int idade;
} Pessoa;

int main()
{
    Pessoa p;

    p.idade = 12;
    printf("Idade: %d\n", p.idade);

    sprintf(p.nome, "Arthur Brassanini");
    printf("Nome: %s\n", p.nome);

    return 0;
}
