package lesson3.task2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Guitar implements Instrument {
    private int numberOfStrings;

    @Override
    public void play() {
        System.out.println("Play Guitar with " + this.numberOfStrings + " strings");
    }
}
