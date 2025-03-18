#include <stdio.h>
#include <locale.h>
#include <string.h>

int main()
{
    setlocale(LC_ALL, "Portuguese");
    char texto[30];

    printf("\n\n]===============[Codificação]===============[\n\n\n\n"
           "]=====[Digite o texto que deseja codificar]=[Digite ';' para encerrar]\n\n");

    while(1)
    {
        printf("\n]==[: ");
        fgets(texto, sizeof(texto), stdin);
        texto[strcspn(texto, "\n")] = '\0';

        int len = strlen(texto);
        if (len > 0 && texto[len - 1] == ';')
        {
            break;
        }

        printf("\n]==[O texto deve terminar com ';']==[\n");
    }

    printf("]==[ %s ", texto);
}
