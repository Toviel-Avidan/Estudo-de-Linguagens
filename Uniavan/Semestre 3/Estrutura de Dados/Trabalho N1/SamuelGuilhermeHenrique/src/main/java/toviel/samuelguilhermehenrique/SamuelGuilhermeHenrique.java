//NOMES: Samuel Rozini Hirt --- Guilherme Pinheiro Paganelli --- Henrique Purper Rodrigues

package toviel.samuelguilhermehenrique;

import java.util.Queue;
import java.util.List;
import java.util.LinkedList;
import java.util.Random;

public class SamuelGuilhermeHenrique {

    record Registro(int minuto, int tipo, int quantidade) {}

    public static void main(String[] args) {
        final int TEMPO_SIMULACAO = 20;

        Random random = new Random();
        List<Registro> eventos = new LinkedList<>();

        /* Gerar eventos aleatórios
        for (int minuto = 1; minuto <= TEMPO_SIMULACAO; minuto++) 
        {
            int tipo = random.nextInt(3);
            int quantidade = (tipo == 0) ? 0 : random.nextInt(10) + 1;
            eventos.add(new Registro(minuto, tipo, quantidade));
        }
*/
        eventos.add( new Registro(1, 2, 4));
        eventos.add( new Registro(2, 2, 5));
        eventos.add( new Registro(3, 0, 0));
        eventos.add( new Registro(4, 1, 3));
        eventos.add( new Registro(5, 2, 6));
        eventos.add( new Registro(6, 2, 2));
        eventos.add( new Registro(7, 2, 4));
        eventos.add( new Registro(8, 1, 5));
        eventos.add( new Registro(9, 0, 0));
        eventos.add( new Registro(10, 0, 0));
        eventos.add( new Registro(11, 1, 3));
        eventos.add( new Registro(12, 2, 1));
        eventos.add( new Registro(13, 0, 0));
        eventos.add( new Registro(14, 0, 0));
        eventos.add( new Registro(15, 0, 0));
        eventos.add( new Registro(16, 0, 0));
        eventos.add( new Registro(17, 1, 1));
        eventos.add( new Registro(18, 0, 0));
        eventos.add( new Registro(19, 2, 2));
        eventos.add( new Registro(20, 2, 3));

        // Filas
        Queue<Integer> filaPessoaFisica = new LinkedList<>();
        Queue<Integer> filaPessoaJuridica = new LinkedList<>();

        // Estado dos caixas
        int caixa1TempoRestante = 0;
        int caixa2TempoRestante = 0;

        int tempoLivreCaixa1 = 0;
        int tempoLivreCaixa2 = 0;

        int maxFilaCaixa1 = 0;
        int maxFilaCaixa2 = 0;

        // Simulação minuto a minuto
        for (int i = 0; i < TEMPO_SIMULACAO; i++) 
        {
            Registro evento = eventos.get(i);

            // Chegada de cliente
            if (evento.tipo == 1) 
            {
                filaPessoaFisica.add(evento.quantidade);
            } 
            else if (evento.tipo == 2) 
            {
                filaPessoaJuridica.add(evento.quantidade);
            }

            // Atualizar máximo das filas
            if (filaPessoaFisica.size() > maxFilaCaixa1)
                maxFilaCaixa1 = filaPessoaFisica.size();

            if (filaPessoaJuridica.size() > maxFilaCaixa2)
                maxFilaCaixa2 = filaPessoaJuridica.size();

            // Atualizar tempo dos caixas
            if (caixa1TempoRestante > 0) 
            {
                caixa1TempoRestante--;
            }

            if (caixa1TempoRestante == 0) 
            {
                if (!filaPessoaFisica.isEmpty()) 
                {
                    caixa1TempoRestante = filaPessoaFisica.poll();
                }
                else
                {
                    tempoLivreCaixa1++;
                }
            }

            if (caixa2TempoRestante > 0) 
            {
                caixa2TempoRestante--;
            }

            if (caixa2TempoRestante == 0) 
            {
                if (!filaPessoaJuridica.isEmpty()) 
                {
                    caixa2TempoRestante = filaPessoaJuridica.poll();
                }
                else 
                {
                    tempoLivreCaixa2++;
                }
            }
            
            
            // Mostrar situação no minuto atual
            String statusCaixa1 = (caixa1TempoRestante == 0) ? "Livre" : "Atendendo";
            String statusCaixa2 = (caixa2TempoRestante == 0) ? "Livre" : "Atendendo";

            System.out.printf("[Minuto]= %d \t[Caixa 1]= %s \t[Fila Caixa 1]= %d \t[Caixa 2]= %s \t[Fila Caixa 2]= %d%n",
                    evento.minuto,
                    statusCaixa1,
                    filaPessoaFisica.size(),
                    statusCaixa2,
                    filaPessoaJuridica.size());
        }

        // Exibir resumo final
        System.out.println("\n[]===[Resumo Final]===[]\n");
        System.out.println("[Tempo livre Caixa 1]: " + tempoLivreCaixa1);
        System.out.println("[Tempo livre Caixa 2]: " + tempoLivreCaixa2);
        System.out.println("[Tamanho maximo fila Caixa 1]: " + maxFilaCaixa1);
        System.out.println("[Tamanho maximo fila Caixa 2]: " + maxFilaCaixa2);
    }
}