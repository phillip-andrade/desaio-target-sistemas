// Questão 1: Soma de 1 até 13
public class Questao1 {
    public static void main(String[] args) {
        int INDICE = 13, SOMA = 0, K = 0;
        while (K < INDICE) {
            K = K + 1;
            SOMA = SOMA + K;
        }
        System.out.println("Soma final: " + SOMA);
    }
}
