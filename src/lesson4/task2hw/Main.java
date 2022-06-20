package lesson4.task2hw;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        char[] arr_EN = {'_', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

        ArrayList<String> strings = new ArrayList<>();

        for (int i = 0; i < 20; i++) {

            int rand = (int) Math.ceil(Math.random() * (arr_EN.length - 1));
            strings.add(arr_EN[rand] + Integer.toString(i));
        }

        Collections.sort(strings);
        System.out.println(strings);
    }
}

// створити ArrayList зі словами на 15-20 елементів.
// - відсортувати його за алфавітом.