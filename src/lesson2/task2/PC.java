package lesson2.task2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PC {
    private String operatingSystem;
    private int ram;
    private boolean withSSD;
}
