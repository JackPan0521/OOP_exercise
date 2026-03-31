package SOLID原則.Q2;

class RegularDiscount implements Discount {
    @Override
    public double getDiscount() {
        return 0.1;
    }
}
