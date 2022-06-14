package lesson2.task4;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
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
}
