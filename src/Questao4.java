// Questao 4: Percentual de faturamento por estado
public class Questao4 {
    public static void main(String[] args) {
        double sp = 67836.43, rj = 36678.66, mg = 29229.88, es = 27165.48, outros = 19849.53;
        double total = sp + rj + mg + es + outros;

        System.out.printf("SP: %.2f%%\n", (sp / total) * 100);
        System.out.printf("RJ: %.2f%%\n", (rj / total) * 100);
        System.out.printf("MG: %.2f%%\n", (mg / total) * 100);
        System.out.printf("ES: %.2f%%\n", (es / total) * 100);
        System.out.printf("Outros: %.2f%%\n", (outros / total) * 100);
    }
}
