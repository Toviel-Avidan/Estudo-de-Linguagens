
package vetor.recursividade;

public class Recursividade {

    public static void main(String[] args) {
        System.out.printf("Fatorial de 4 = %d", calcularFatorial(4));
    }
    
    public static long calcularFatorial(int n){
    if (n == 0)
        return (1);
    else
        return(n * calcularFatorial(n - 1));
    }
}
