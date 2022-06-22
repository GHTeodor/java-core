package lesson5.task2;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<Integer>();

        int i = 20;
        do {
            numbers.add(i);
            i--;
        } while (i > 0);

        System.out.println(numbers);

        System.out.println("\033[1;31m sorted: \033[0m"+numbers.stream().sorted().collect(Collectors.toList()));
        System.out.println("\033[1;36m %3: \033[0m" + numbers.stream().filter(value -> value % 3 == 0).collect(Collectors.toList()));
        System.out.println("\033[1;33m %10: \033[0m" + numbers.stream().filter(value -> value % 10 == 0).collect(Collectors.toList()));

        ArrayList<Integer> x3Numbers = new ArrayList<Integer>();
        numbers.stream().map(val -> val * 3).forEach(value -> x3Numbers.add(value));
        System.out.println("\033[1;34m forEach + .map(*3): \033[0m" + x3Numbers);
    }
}
// Створити масив з 20 числами.
// - за допомогою способу sorted відсортувати масив.
// -- за допомогою filter отримати числа кратні 3
// -- за допомогою filter отримати числа кратні 10
// -- перебрати (проітерувати) масив за допомогою foreach()
// -- перебрати масив за допомогою map() і отримати новий масив, в якому всі значення будуть у 3 рази більші