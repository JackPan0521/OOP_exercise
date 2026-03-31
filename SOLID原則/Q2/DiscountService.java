package SOLID原則.Q2;

class DiscountService {
    public double getDiscount(Discount discountPolicy) {
        return discountPolicy.getDiscount();
    }
}
