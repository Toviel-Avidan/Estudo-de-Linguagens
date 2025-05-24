//Nome: Samuel Rozini Hirt

#include <stdio.h>
#include <stdlib.h>

int main(void)
{
    FILE *pont_arq;
    char palavra[100];

    pont_arq = fopen("arquivo.txt", "a");

    if(pont_arq == NULL)
    {
        printf("ERRO! O arquivo não foi aberto!\n");
    }
    else
    {
        printf("O arquivo foi aberto com sucesso!");
    }

    printf("\nDigite uma palavra para testar a geração do arquivo: ");
    fgets(palavra, sizeof(palavra), stdin);

    printf(palavra);

    fprintf(pont_arq, "%s", palavra);

    fclose(pont_arq);

    printf("O arquivo foi criado com sucesso!");

    system("pause");

    return(0);
}
