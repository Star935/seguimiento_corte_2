package workshop;

public class products {
    public String name;
    public int price;
    public int amount;

    public products() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public products(String name, int price, int amount) {
        this.name = name;
        this.price = price;
        this.amount = amount;
    }
}
