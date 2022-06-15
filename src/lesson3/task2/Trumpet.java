package lesson3.task2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Trumpet implements Instrument {
    private int diameter;

    @Override
    public void play() {
        System.out.println("Play " + this.getClass().getSimpleName() + " with diameter " + this.diameter);

    }
}
