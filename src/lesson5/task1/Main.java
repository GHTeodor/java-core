package lesson5.task1;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<String>();

        int i = 0;
        while (i < 20) {
            arrayList.add(BigInteger.probablePrime(100, new Random()).
                    toString(Character.MAX_RADIX).
                    replaceAll("[0-9]", "").
                    substring(0, (int) Math.ceil(Math.random() * (5 - 2) + 2)));
            i++;
        }

        System.out.println(arrayList);

        ArrayList<String> sortedList = new ArrayList<>();
        ArrayList<String> lessFourSymbols = new ArrayList<>();

        arrayList.stream().sorted().forEachOrdered(value -> {
            sortedList.add(value);
            if (value.length() < 4) lessFourSymbols.add(value);
        });
        System.out.println("\033[1;32m sorted: \033[0m" + sortedList);
        System.out.println("\033[1;35m length < 4: \033[0m" + lessFourSymbols);
    }
}
// створити ArrayList зі словами на 15-20 елементів.
// - відсортувати його за алфавітом.
// *-- відфільтрувати слова довжиною менше 4 символів