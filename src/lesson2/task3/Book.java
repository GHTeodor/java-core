package lesson2.task3;

public class Book extends Papyrus {
    private int pages;

    public Book(String title, int pages) {
        super(title);
        this.pages = pages;
    }

    public Book(int pages) {
        this.pages = pages;
    }

    public Book() {
    }

    public Book(String title) {
        super(title);
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "pages=" + pages +
                "} " + super.toString();
    }
}
