public class Product {
    private String name;
    private Double price;
    private String flavour;

    public String getFlavour() {
        return flavour;
    }

    private void setFlavour(String flavour) {
        this.flavour = flavour;
    }

    public Product(String name, Double price, String flavour) {
        this.setName(name);
        this.setPrice(price);
        this.setFlavour(flavour);
    }

    public Product(String name, Double price) {
        this.setName(name);
        this.setPrice(price);
        this.setFlavour(flavour = "Не указан");
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String toString() {
        return String.format("%s -/- %.2f руб. -/- %s", name, price, flavour);
    }

}
