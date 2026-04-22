public class UKTax implements TaxStrategy {
    @Override
    public double calculate(double amount) {
        return amount * 0.2;
    }
}
