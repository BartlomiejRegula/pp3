public class EuroBank {
    public static void main(String[] args) {
        double euroBuy = 4.5940;
        double euroSell = 4.6250;
        double spread = euroSell - euroBuy;
        System.out.printf("'%.4f'%n", spread);
    }
}
