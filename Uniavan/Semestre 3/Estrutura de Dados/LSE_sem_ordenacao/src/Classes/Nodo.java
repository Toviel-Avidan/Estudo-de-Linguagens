package Classes;

public class Nodo {
    String info;     // Informação armazenada
    Nodo   elo;      // Ponteiro para o próximo nodo

    public Nodo(String info) {
        this.info = info;
        this.elo  = null;
    }
}
