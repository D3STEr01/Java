public class FaturamentoEstados {
    public static void main(String[] args) {
        double[] faturamentoEstados = {67836.43, 36678.66, 29229.88, 27165.48, 19849.53};
        String[] estados = {"SP", "RJ", "MG", "ES", "Outros"};
        double faturamentoTotal = 0;
        
        // Calcula o faturamento total
        for (double faturamento : faturamentoEstados) {
            faturamentoTotal += faturamento;
        }
        
        // Calcula e imprime o percentual de representação de cada estado
        for (int i = 0; i < faturamentoEstados.length; i++) {
            double percentual = faturamentoEstados[i] * 100 / faturamentoTotal;
            System.out.printf("%s - R$%.2f - %.2f%%\n", estados[i], faturamentoEstados[i], percentual);
        }
    }
}


