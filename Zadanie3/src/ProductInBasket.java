import java.util.Objects;

public class ProductInBasket extends Product {
    private int quantityOfProduct;

    public ProductInBasket(String name, float price, int quantityOfProduct) {
        super(name, price);
        this.quantityOfProduct = quantityOfProduct;
    }

    public int getQuantityOfProduct() {
        return quantityOfProduct;
    }

    public void setQuantityOfProduct(int quantityOfProduct) {
        this.quantityOfProduct = quantityOfProduct;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ProductInBasket that = (ProductInBasket) o;
        return quantityOfProduct == that.quantityOfProduct;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), quantityOfProduct);
    }
}
