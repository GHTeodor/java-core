package lesson3.bonus;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Actor {
    private int id;
    private String name;
    private String surname;
}
