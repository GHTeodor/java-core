package lesson4.task1hw;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User("Philip J. Fry", (int) Math.round(Math.random() * 100)));
        users.add(new User("Turanga Leela", (int) Math.round(Math.random() * 100)));
        users.add(new User("Bender Bending Rodriguez", (int) Math.round(Math.random() * 100)));
        users.add(new User("Amy Wong", (int) Math.round(Math.random() * 100)));
        users.add(new User("Hermes Conrad", (int) Math.round(Math.random() * 100)));
        users.add(new User("Professor Hubert J. Farnsworth", (int) Math.round(Math.random() * 100)));
        users.add(new User("Doctor John Zoidberg", (int) Math.round(Math.random() * 100)));

//        sort by age asc
        users.sort(Comparator.comparingInt(User::getAge));
        System.out.println(users);

//        sort by age desc
        users.sort(Comparator.comparingInt(User::getAge).reversed());
        System.out.println(users);

//        sort by name length asc
        users.sort(((u1, u2) -> u1.getFullName().length() - (u2.getFullName().length())));
        System.out.println(users);

//        sort by name length desc
        users.sort(((u1, u2) -> u2.getFullName().length() - (u1.getFullName().length())));
        System.out.println(users);
    }
}


// Створити List User
// - відсортувати за віком (зростання, а потім окремо спадання за допомоги методу sort)
// - відсортувати його за кількістю знаків в імені (зростання, а потім окремо спадання)