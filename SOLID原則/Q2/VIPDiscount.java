package SOLID原則.Q2;

class VIPDiscount implements Discount {
    @Override
    public double getDiscount() {
        return 0.2;
    }
}
