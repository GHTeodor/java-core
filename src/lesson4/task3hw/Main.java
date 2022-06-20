package lesson4.task3hw;

import java.util.HashSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        HashSet<User> usersHash = new HashSet<>();
        TreeSet<User> usersTree = new TreeSet<>();

        String[] arrSkills = {"Jira", "C#", "C++", "TS", "JS", "Vue", "ReactNative", "MySQL", "Mongo", "PHP"};
        for (int i = 0; i < 10; i++) {
            User user = new User();
            user.setId(i + 1);
            user.setGender(Gender.values()[(int) Math.round(Math.random())]);

            for (int j = 0; j < i; j++) {
                user.addSkill(new Skill(arrSkills[i], i));
            }


            if (i % 3 == 0) {
                user.addSkill(new Skill("Angular", 2));
                user.addSkill(new Skill("Java", 5));
            } else {
                user.addSkill(new Skill("React", 3));
                user.addSkill(new Skill("Node", 4));
            }
            //*************************************************

            usersHash.add(user);
            usersTree.add(user);

        }
        usersHash.removeIf(user -> user.getGender() == Gender.MALE);
        usersHash.forEach(System.out::println);

        System.out.println("\n↑Hash ****************************** Tree↓\n");

        usersTree.forEach(System.out::println);
        //*************************************************
    }
}

// Створити клас котрий відповідає наступній моделі {
//  id: 1,
//  name: 'vasya',
//  surname: 'pupkin',
//  email: 'asd@asd.com',
//  age: 31,
//  gender: 'MALE',
//  skills: [{title: 'java', exp: 10}, {title: 'js', exp: 10}, {title: 'c++', exp: 10}],
//  car: {model: 'toyota', year: 2021, power: 250}
// }
//  Використати композицію/агрегацію та енуми в потрібному місці.
//  Створити HashSet з 10 об'єктів, проітерувати її, видалити всіх чоловіків
//  Створити TreeSet з 10 об'єктів, посортовану за кількістю скілів від меншого до більшого