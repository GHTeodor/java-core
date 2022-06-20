package lesson4.task3hw;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Car {
    private String model = "Tesla";
    private int year = 2021;
    private int power = 250;
}
