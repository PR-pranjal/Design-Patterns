public class Main {
    public static void main(String[] args) {
        ApplyDiscount d=new ApplyDiscount(new FlatDiscount());
        d.getDiscount();
        d.setStrategy((new CashbackDiscount()));
        d.getDiscount();

    }
}