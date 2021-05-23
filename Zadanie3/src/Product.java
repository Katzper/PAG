import java.util.Objects;

public class Product {
    private String name;
    private float price;

    public Product(String name, float price) {
        this.name = name;
        this.price = price;
    }
    public String getName() {
        return name;
    }

    public Product(String[] args) {
        this.name = args[0];
        this.price = Float.parseFloat(args[1]);
    }

    public Product(Product p) {
        this.name = p.name;
        this.price = p.price;
    }

    public float getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;
        Product product = (Product) o;
        return Float.compare(product.price, price) == 0 && name.equals(product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }
}
