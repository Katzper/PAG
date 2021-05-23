import java.util.*;

public class Shop {
    private ArrayList<Product> availableProducts;
    private ArrayList<Client> clients;
    private LinkedList<Client> queue;

    public Shop(ArrayList<String[]> availableProductsArgs, ArrayList<String[]> clientsArgs) {
        var ap = new ArrayList<Product>();
        for (var elem : availableProductsArgs) {
            Product prod = new Product(elem);
            ap.add(prod);
        }
        this.setAvailableProducts(ap);

        var ci = new ArrayList<Client>();
        for (var elem : clientsArgs) {
            Client cl = new Client(elem[0]);
            ci.add(cl);
        }
        this.setClients(ci);

        queue = new LinkedList<Client>();
    }
    public void createQueue() {
        queue.addAll(clients);
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Shop shop = (Shop) o;
        return Objects.equals(availableProducts, shop.availableProducts) && Objects.equals(clients, shop.clients) && Objects.equals(queue, shop.queue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(availableProducts, clients, queue);
    }

    public ArrayList<Product> getAvailableProducts() {
        return availableProducts;
    }

    public void setAvailableProducts(ArrayList<Product> availableProducts) {
        this.availableProducts = availableProducts;
    }

    public ArrayList<Client> getClients() {
        return clients;
    }

    public void setClients(ArrayList<Client> clients) {
        this.clients = clients;
    }

    public LinkedList<Client> getQueue() {
        return queue;
    }

    public void setQueue(LinkedList<Client> queue) {
        this.queue = queue;
    }
}
