package lesson4.draft.List.linkedList;

import lesson4.draft.List.arrayList.User;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<User> users = new LinkedList<>();
        users.add(new User(2, "ArrayList4"));
        users.add(new User(3, "ArrayList3"));
        users.add(new User(1, "ArrayList5"));
        users.add(new User(6, "ArrayList0"));
        users.add(new User(5, "ArrayList1"));
        users.add(new User(4, "ArrayList2"));

        System.out.println(users.element());
    }
}
