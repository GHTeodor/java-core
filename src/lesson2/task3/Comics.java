package lesson2.task3;

public class Comics extends Book {
    private Universe universe;

    public Comics() {
    }

    public Comics(String title, int pages, Universe universe) {
        super(title, pages);
        this.universe = universe;
    }

    @Override
    public String toString() {
        return "Comics{" +
                "universe=" + universe +
                "} " + super.toString();
    }
}
