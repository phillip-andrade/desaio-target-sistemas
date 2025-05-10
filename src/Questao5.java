
// Questao 5: Inverter string sem função pronta
public class Questao5 {
    public static void main(String[] args) {
        String original = "Exemplo";
        String invertida = "";
        for (int i = original.length() - 1; i >= 0; i--) {
            invertida += original.charAt(i);
        }
        System.out.println("Invertida: " + invertida);
    }
}