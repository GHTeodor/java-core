package lesson2.task4;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        User user = new User();

        user.addSkill(new Skill("angular", 2));
        user.addSkill(new Skill("java", 1));
        user.addSkill(new Skill("react", 3));
        user.addSkill(new Skill("js", 4));

        System.out.println(user);
    }
}
