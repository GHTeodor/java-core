package lesson4.task4hw;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ZooClub {
    private Map<Person, List<Pet>> club = new HashMap<>();

    public void addPerson(String name) {
        this.club.put(new Person(name), new ArrayList<>(Collections.singleton(Pet.values()[(int) Math.round(Math.random() * (Pet.values().length - 1))])));
    }

    public void addAnimalToPerson(String participantName, Pet pet) {
        this.club.forEach((key, value1) -> {
            if (key.getName().equals(participantName))
                value1.add(pet);
        });
    }

    public void removeAnimalFromPerson(String participantName, Pet pet) {
        this.club.forEach((key, value1) -> {
            if (key.getName().equals(participantName))
                value1.remove(pet);
        });
    }

    public void removeAnimalFromAllParticipants(Pet pet) {

        for (Map.Entry<Person, List<Pet>> map : this.club.entrySet()) {
            map.getValue().remove(pet);
        }
    }

    public void removePerson(String name) {
        this.club.remove(new Person(name));
    }

    public void showZooClub() {
        System.out.println(this.getClub());
    }
}
