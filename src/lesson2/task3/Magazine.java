package lesson2.task3;

public class Magazine extends Book {
    private int price;

    public Magazine() {
    }

    public Magazine(String title, int pages, int price) {
        super(title, pages);
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "price=" + price +
                "} " + super.toString();
    }
}
