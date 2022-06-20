package lesson4.draft.List.arrayList;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<User> users = new ArrayList<>();
        users.add(new User(2, "ArrayList4"));
        users.add(new User(3, "ArrayList3"));
        users.add(new User(1, "ArrayList5"));
        users.add(new User(6, "ArrayList0"));
        users.add(new User(5, "ArrayList1"));
        users.add(new User(4, "ArrayList2"));

        users.remove(new User(2, "ArrayList4"));

//        users.sort(((o1, o2) -> o1.getId() - o2.getId()));
        users.sort(((o1, o2) -> o1.getName().compareTo(o2.getName())));
//        users.sort(Comparator.comparingInt(User::getId));
//        users.removeIf(user -> user.getId() > 0);
//        users.forEach(user -> System.out.println(user));
        System.out.println(users.contains(new User(4, "ArrayList2")));
        users.replaceAll(user -> {
            if (user.getName().equals("ArrayList2")) {
                return new User(12, "ArrayList12");
            }
            return user;
        });

        users.set(0, new User());
        users.add(0, new User());

//        User[] users1 = new User[10];
//        Object[] objects = users.toArray(users1);

        users.forEach(System.out::println);
    }
}
