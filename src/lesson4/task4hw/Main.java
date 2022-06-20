package lesson4.task4hw;

public class Main {
    public static void main(String[] args) {

        ZooClub zooClub = new ZooClub();

        zooClub.addPerson("MainPerson");
        zooClub.addPerson("Person1");
        zooClub.addPerson("Person2");

        zooClub.addAnimalToPerson("Person1", Pet.PANDA);
        zooClub.removeAnimalFromAllParticipants(Pet.ALLIGATOR);
        zooClub.removeAnimalFromPerson("Person2", Pet.ALLIGATOR);

        zooClub.removePerson("MainPerson");

        zooClub.showZooClub();
    }
}

// Створити клас Зооклуб. В цьому класі створити одне поле: private Map <Person, List <Pet>> club;
// В зооклубі створити методи, та застосувати їх
// 1) додати учасника в клуб;
// 2) додати тваринку до учасника клубу.
// 3) видалити тваринку з власника.
// 4) видалити учасника клубу.
// 5) видалити конкретну тваринку з усіх власників.
// 6) вивести на екран зооклуб.
// Подумати яким повинен бути Person, щоб була можливість додавати йому тваринку.
// Подумати яким повинен бути Pet, щоб була можливість видаляти конкретну тваринку