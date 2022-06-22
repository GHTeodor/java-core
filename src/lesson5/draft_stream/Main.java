package lesson5.draft_stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        List<User> users = new ArrayList<>();

        users.add(new User(1, "User1", true));
        users.add(new User(1, "User1", true));
        users.add(new User(2, "User3", true));
        users.add(new User(3, "User4", false));
        users.add(new User(1, "User5", false));
        users.add(new User(4, "User6", false));

//        Stream<User> userStream = users.stream();
        List<User> collect = users.stream()
                .distinct()
                .filter(User::isStatus)
                .collect(Collectors.toList());

        System.out.println(collect);

       List<SimpleUser> collectSimple =  users.stream()
                .map(user -> new SimpleUser(user.getId(), user.getName()))
                .collect(Collectors.toList());

        System.out.println(collectSimple);

        boolean allB = users.stream().allMatch(user -> user.getId() > 0);
        boolean anyB = users.stream().anyMatch(user -> user.getId() > 2);
        System.out.println(allB + "|" + anyB);

        if (users.stream().anyMatch(User::isStatus)) {
            System.out.println("ANY");
        }

        Optional<User> first = users.stream().findFirst();

        User x = first.orElse(new User());
        System.out.println(x);

        Stream<String> stringStream = users.stream().flatMap(user -> user.getSkills().stream());
        stringStream.forEach(System.out::println);

//        Optional<User> max = users.stream().max((o1, o2) -> o1.getId() - o2.getId());
        User max = users.stream().max((o1, o2) -> o1.getId() - o2.getId()).orElse(new User());
        System.out.println(max);

        List<User> collect1 = users.stream()
                .sorted((o1, o2) -> o1.getId() - o2.getId())
                .filter(user -> user.getId() > 2)
                .collect(Collectors.toList());
        System.out.println(collect1);

        List<String> hello = Arrays.asList("H", "e", "l", "l", "o");
        String reduce = hello.stream()
                .reduce("", (accumulator, element) -> accumulator + element);
        System.out.println(reduce);

        User reduce1 = users.stream().reduce(new User(), (identity, user) -> {
            identity.getSkills().addAll(user.getSkills());
            return identity;
        });
        System.out.println(reduce1);

//        Stream<String> skip = hello.stream().skip(2);
//        System.out.println(skip);
    }
}
