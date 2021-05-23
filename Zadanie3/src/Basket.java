import java.util.ArrayDeque;
import java.util.Objects;

public class Basket {
    private ArrayDeque<ProductInBasket> products;

    public Basket(ArrayDeque<ProductInBasket> products) {
        this.products = products;
    }

    public ArrayDeque<ProductInBasket> getProducts() {
        return products;
    }

    public void setProducts(ArrayDeque<ProductInBasket> products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "This basket contains:" + products;
    }

    public void insert(ProductInBasket p) {
        products.push(p);
    }

    public void takeOut() {
        products.pop();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Basket basket = (Basket) o;
        return Objects.equals(products, basket.products);
    }

    @Override
    public int hashCode() {
        return Objects.hash(products);
    }
}
