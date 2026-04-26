package Quiz2.Question1;

public class TaxCalculator {
    private TaxStrategy strategy;

    public void setTaxStrategy(TaxStrategy strategy) {
        this.strategy = strategy;
    }

    public double calculateTax(double amount) {
        if (strategy == null) return 0;
        return strategy.calculate(amount);
    }
}
