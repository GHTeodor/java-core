package lesson5.task3;

import java.time.Year;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Car> cars = new ArrayList<Car>();

        cars.add(new Car("Tesla", 250, new Driver("Liam", 50, 10), Math.random() * 10000, Year.now().getValue()));
        cars.add(new Car("Mercedes-Benz", 210, new Driver("Harper", 25, 5), Math.random() * 1000, Year.now().getValue()));
        cars.add(new Car("Lexux", 190, new Driver("Mia", 40, 1), Math.random() * 1000, Year.now().getValue()));
        cars.add(new Car("Peugeot", 150, new Driver("William", 21, 4), Math.random() * 1000, Year.now().getValue()));
        cars.add(new Car("Mitsubishi", 200, new Driver("Sophia", 22, 0), Math.random() * 1000, Year.now().getValue()));
        cars.add(new Car("Mazda", 100, new Driver("Benjamin", 30, 4), Math.random() * 1000, Year.now().getValue()));
        cars.add(new Car("Ferrari", 220, new Driver("Lucas", 27, 5), Math.random() * 1000, Year.now().getValue()));

        List<Car> carsForUpdate = new ArrayList<Car>();
        for (int i = 0; i < cars.size() / 2 + 1; i++) {
            carsForUpdate.add(cars.get(i));
        }
        System.out.println("\033[0;105mPower+10%: \033[0;36m");
        System.out.println(carsForUpdate);
        carsForUpdate.stream().forEach(car -> car.setPower(car.getPower() * 1.1));
        System.out.println(carsForUpdate);

        System.out.println("\033[0;102m+1 to experience...: \033[0;34m");
        List<Car> addExp = cars.stream().filter(car -> car.getOwner().getAge() > 25 && car.getOwner().getExp() < 5).collect(Collectors.toList());
        System.out.println(addExp);
        addExp.stream().forEach(car -> car.getOwner().setExp(car.getOwner().getExp() + 1));
        System.out.println(addExp);

        AtomicReference<Double> priceOfAllCars = new AtomicReference<>((double) 0);
        cars.stream().forEach(car -> priceOfAllCars.updateAndGet(v -> new Double((double) (v + car.getPrice()))));

        System.out.println("\033[0;103m Price of all cars: \033[0;35m" + priceOfAllCars + "\033[0m");
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