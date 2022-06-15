package lesson3.task2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Instrument> arrayList = new ArrayList<>();

        Instrument guitar = new Guitar(6);
        Instrument trumpet = new Trumpet(40);
        Instrument drum = new Drum(50);

        arrayList.add(guitar);
        arrayList.add(trumpet);
        arrayList.add(drum);


        for (Instrument i : arrayList) {
            printList(i);
        }
    }

    public static void printList(Instrument instrument) {
        instrument.play();
    }
}

//    Створити інтерфейс Інструмент та реалізуючі його класи Гітара, Барабан та Труба.
//    Інтерфейс Інструмент містить метод play()
//    Гітара містить змінні класу кількістьСтрун, Барабан – розмір, Труба – діаметр.
//    Створити масив типу Інструмент, який містить інструменти різного типу.
//    У циклі викликати метод play() для кожного інструменту,
//    який повинен виводити рядок "Грає такий-то інструмент з такими то характеристиками".