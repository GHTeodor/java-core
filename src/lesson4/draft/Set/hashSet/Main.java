package lesson4.draft.Set.hashSet;

import lesson4.draft.Set.treeSet.User;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<User> users = new HashSet<>();
        users.add(new User(2, "ArrayList4"));
        users.add(new User(3, "ArrayList3"));
        users.add(new User(1, "ArrayList5"));
        users.add(new User(6, "ArrayList0"));
        users.add(new User(5, "ArrayList1"));
        users.add(new User(4, "ArrayList2"));

        System.out.println(users);

    }
}
