package Quiz2.Question1;

public class CanadaTax implements TaxStrategy {
    @Override
    public double calculate(double amount) {
        return amount * 0.15;
    }
}
