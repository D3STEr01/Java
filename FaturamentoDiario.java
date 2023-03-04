import java.util.Arrays;

public class FaturamentoDiario {

    public static void main(String[] args) {
        
        // Define o vetor com os valores de faturamento diário
        int[] faturamentoDiario = {1500, 2500, 1800, 2000, 2200, 3000, 1700, 1900, 2100, 2400, 2600, 2800, 2300, 2700, 2900, 2000, 1800, 1900, 2500, 2200, 2600, 3000, 2700, 2300, 2100, 1900, 2200, 2000, 1800, 1700, 1600};
        
        // Calcula o menor valor de faturamento diário
        int menorFaturamento = Arrays.stream(faturamentoDiario).min().getAsInt();
        
        // Calcula o maior valor de faturamento diário
        int maiorFaturamento = Arrays.stream(faturamentoDiario).max().getAsInt();
        
        // Calcula a média mensal de faturamento diário
        double mediaMensal = Arrays.stream(faturamentoDiario).average().getAsDouble();
        
        // Calcula o número de dias em que o faturamento foi superior à média mensal
        int diasAcimaDaMedia = 0;
        for (int faturamento : faturamentoDiario) {
            if (faturamento > mediaMensal) {
                diasAcimaDaMedia++;
            }
        }
        
        // Imprime os resultados
        System.out.println("Menor faturamento diário: " + menorFaturamento);
        System.out.println("Maior faturamento diário: " + maiorFaturamento);
        System.out.println("Dias com faturamento acima da média mensal: " + diasAcimaDaMedia);
        
    }

}
