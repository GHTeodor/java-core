package lesson2.task3;

public class Main {
    public static void main(String[] args) {
        Comics comics = new Comics("Captain Marvel", 15, Universe.MARVEL);
        System.out.println(comics);

        Magazine magazine = new Magazine("xda-developers", 50, 10);
        System.out.println(magazine);

    }
}
