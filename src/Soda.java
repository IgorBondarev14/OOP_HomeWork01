public class Soda extends Product {
    public Soda(String name, Double price, String flavour) {
        super(name, price, flavour);
    }

    public String toString() {
        return String.format("%s -/- %.2f руб.-/- %s", getName(), getPrice(), getFlavour());
    }
}
