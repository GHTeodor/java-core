package lesson5.task3.v2;

import lesson5.task3.Car;
import lesson5.task3.Driver;

import java.time.Year;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();

        cars.add(new Car("Tesla", 250, new Driver("Liam", 50, 10), Math.random() * 10000, Year.now().getValue()));
        cars.add(new Car("Mercedes-Benz", 210, new Driver("Harper", 25, 5), Math.random() * 1000, Year.now().getValue()));
        cars.add(new Car("Lexux", 190, new Driver("Mia", 40, 1), Math.random() * 1000, Year.now().getValue()));
        cars.add(new Car("Peugeot", 150, new Driver("William", 21, 4), Math.random() * 1000, Year.now().getValue()));
        cars.add(new Car("Mitsubishi", 200, new Driver("Sophia", 22, 0), Math.random() * 1000, Year.now().getValue()));
        cars.add(new Car("Mazda", 100, new Driver("Benjamin", 30, 4), Math.random() * 1000, Year.now().getValue()));
        cars.add(new Car("Ferrari", 220, new Driver("Lucas", 27, 5), Math.random() * 1000, Year.now().getValue()));

        System.out.println(cars);
        cars.stream()
                .skip(cars.size() / 2)
                .peek(car -> car.setPower((int) Math.round(car.getPower() * 1.1)))
                .collect(Collectors.toList());

        List<Driver> addExp = cars.stream()
                .map(car -> car.getOwner())
                .peek(driver -> {
                    if (driver.getAge() > 25 && driver.getExp() < 5)
                        driver.setExp(driver.getExp() + 1);
                })
                .collect(Collectors.toList());

        Double priceOfAllCars = cars.stream()
                .map(car -> car.getPrice())
                .reduce((double) 0, ((accumulator, price) -> accumulator + price));

        System.out.println(cars);

//        System.out.println(addPower);
        System.out.println(addExp);
        System.out.println(priceOfAllCars);
    }
}
// Створити клас автомобіля з полями:
// Марка автомобіля, потужність двигуна, власник, ціна, рік випуску.
// Власник автомобіля теж має бути об'єкт, у якого є поля
// Імя, вік, стаж водіння.
// Створити не менше 7 та не більше 20 машинок.
// Зробити половині автопарку ремонт мотору, що збільшить потужність автомобілів на 10% (переприсвоєння змінної потужності).
// Після того в масиві цих автівок зробити перевірку досвіду ВСІХ наших водіїв.
// Якщо досвід водія менший за 5 років, але його вік більший за 25, то необідно відправити його на курси підвищення кваліфікації, що збільшить йому досвід на 1 рік.
// Також спробуйте порахувати суму, яку потрібно потратити для покупки всіх цих авто
// Все через stream API