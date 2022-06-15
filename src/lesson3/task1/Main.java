package lesson3.task1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Printable> printableBooksMagazinesList = new ArrayList<>();

        Printable book = new Book("Book_1");
        Printable magazine = new Magazine("Magazine_1");

        printableBooksMagazinesList.add(book);
        printableBooksMagazinesList.add(magazine);

        printableList(book, printableBooksMagazinesList);
    }

    public static void printableList(Printable printable, ArrayList<Printable> list) {
        printable.print(list);
    }
}

//  A) Визначити інтерфейс Printable, який містить метод void print().
//  Б) Визначити клас Book, який реалізує інтерфейс Printable.
//  В) Визначити клас Magazine, який реалізує інтерфейс Printable.
//  Г) Створити масив типу Printable, який міститиме книжки та журнали.