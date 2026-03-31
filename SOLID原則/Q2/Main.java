package SOLID原則.Q2;

class Main {
    public static void main(String[] args) {
        DiscountService ds = new DiscountService();

        Discount p = new RegularDiscount();
        System.out.println(p.getDiscount());

        p = new VIPDiscount();
        System.out.println(p.getDiscount());

        System.out.println(ds.getDiscount(new RegularDiscount()));
        System.out.println(ds.getDiscount(new VIPDiscount()));
    }
}