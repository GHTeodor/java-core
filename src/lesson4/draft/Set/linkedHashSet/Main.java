package lesson4.draft.Set.linkedHashSet;

import lesson4.draft.Set.treeSet.User;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Main {
    public static void main(String[] args) {
        LinkedHashSet<User> users = new LinkedHashSet<>();
        users.add(new User(2, "ArrayList4"));
        users.add(new User(3, "ArrayList3"));
        users.add(new User(1, "ArrayList5"));
        users.add(new User(6, "ArrayList0"));
        users.add(new User(5, "ArrayList1"));
        users.add(new User(4, "ArrayList2"));

        Iterator<User> iterator = users.iterator();

//        itit
        while (iterator.hasNext()) {
            User next =  iterator.next();
            if (next.getId() == 2) {
                iterator.remove();
            }
            System.out.println(next);
        }
        System.out.println(users);
    }
}
