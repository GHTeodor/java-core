package lesson2.task4;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Car {
    private String model = "Chevrolet";
    private int year = 2021;
    private int power = 250;
}
