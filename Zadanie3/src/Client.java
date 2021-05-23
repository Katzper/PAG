import java.util.Objects;

public class Client {
    private String surname;
    private Basket basket;

    public Client(String surname) {
        this.surname = surname;
        this.basket = null;
    }

    public void serving {
        float pay = 0;
        System.out.print("Buying: ");
        for (var prod : basket.getProducts()){
            System.out.print(prod.toString() + ", ");
            pay += prod.getPrice();
        }
        System.out.print("Total: ");
        System.out.print(pay);
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Basket getBasket() {
        return basket;
    }

    public void setBasket(Basket basket) {
        this.basket = basket;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return surname.equals(client.surname) && Objects.equals(basket, client.basket);
    }

    @Override
    public int hashCode() {
        return Objects.hash(surname, basket);
    }
}
