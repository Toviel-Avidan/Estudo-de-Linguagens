#include <stdio.h>
#include <locale.h>
#include <string.h>

int main()
{
    setlocale(LC_ALL, "Portuguese");
    char texto[30];

    printf("\n\n]===============[Codificação]===============[\n\n\n\n"
           "]=====[Digite o texto que deseja codificar]=[Digite ';' para encerrar]\n\n");

    // Leitura do texto
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

    printf("\n\n]==[Texto original]: %s\n", texto);

    // Codificação do texto

    char texto_codificado[50];
    int j = 0;

     for (int i = 0; i < strlen(texto); i++)
    {
        if (texto[i] == ';')
        {
            break;
        }

        int codigo_ascii = (int)texto[i];
        int codificado = (5 * codigo_ascii + 100) % 256;
        texto_codificado[j] = (char)codificado;
        j++;
    }

    texto_codificado[j] = '\0';

    printf("\n\n]==[Texto codificado]: %s\n", texto_codificado);

}
