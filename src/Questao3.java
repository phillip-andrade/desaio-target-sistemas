// Questao 3: Faturamento diário com JSON

import java.nio.file.Files;
import java.nio.file.Paths;
import org.json.JSONArray;

public class Questao3 {
    public static void main(String[] args) throws Exception {
        String conteudo = new String(Files.readAllBytes(Paths.get("data/dados.json")));
        JSONArray jsonArray = new JSONArray(conteudo);

        double menor = Double.MAX_VALUE, maior = Double.MIN_VALUE, soma = 0;
        int diasValidos = 0;

        for (int i = 0; i < jsonArray.length(); i++) {
            double valor = jsonArray.getJSONObject(i).getDouble("valor");
            if (valor > 0) {
                if (valor < menor) menor = valor;
                if (valor > maior) maior = valor;
                soma += valor;
                diasValidos++;
            }
        }

        double media = soma / diasValidos;
        int diasAcima = 0;
        for (int i = 0; i < jsonArray.length(); i++) {
            double valor = jsonArray.getJSONObject(i).getDouble("valor");
            if (valor > media) diasAcima++;
        }

        System.out.println("Menor: R$" + menor);
        System.out.println("Maior: R$" + maior);
        System.out.println("Dias acima da média: " + diasAcima);
    }
}

