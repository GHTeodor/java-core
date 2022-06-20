package lesson4.task3hw;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Comparable<User> {
    private int id = 1;
    private String name = "Bartholomew";
    private String surname = "Simpson";
    private String email = "JoJo@email.com";
    private int age = 35;
    private Gender gender = Gender.MALE;
    private ArrayList<Skill> skills = new ArrayList<>();
    private Car car = new Car();


    public void addSkill(Skill skill) {
        this.skills.add(skill);
    }

    @Override
    public int compareTo(User o) {
        return this.skills.size() - o.skills.size();
    }
}
