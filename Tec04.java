public class Tec04 {
    public static void main(String[] args) {
        double sp = 67836.43;
        double rj = 36678.66;
        double mg = 29229.88;
        double es = 27165.48;
        double outros = 19849.53;

        double totalFaturamento = sp + rj + mg + es + outros;

        double percSP = (sp / totalFaturamento) * 100;
        double percRJ = (rj / totalFaturamento) * 100;
        double percMG = (mg / totalFaturamento) * 100;
        double percES = (es / totalFaturamento) * 100;
        double percOutros = (outros / totalFaturamento) * 100;

        System.out.printf("Faturamento total: R$%.2f%n", totalFaturamento);
        System.out.printf("SP: %.2f%% do total%n", percSP);
        System.out.printf("RJ: %.2f%% do total%n", percRJ);
        System.out.printf("MG: %.2f%% do total%n", percMG);
        System.out.printf("ES: %.2f%% do total%n", percES);
        System.out.printf("Outros: %.2f%% do total%n", percOutros);
    }
}
