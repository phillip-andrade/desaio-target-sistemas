// Questao 2: Verificar número na sequência de Fibonacci
public class Questao2 {
    public static void main(String[] args) {
        int numero = 21;
        int a = 0, b = 1;
        boolean pertence = false;

        if (numero == 0) pertence = true;

        while (b <= numero) {
            if (b == numero) {
                pertence = true;
                break;
            }
            int temp = b;
            b = a + b;
            a = temp;
        }

        if (pertence) {
            System.out.println(numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(numero + " NÃO pertence à sequência de Fibonacci.");
        }
    }
}
