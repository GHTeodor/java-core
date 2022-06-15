package lesson3.task2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Drum implements Instrument {
    private int size;

    @Override
    public void play() {
        System.out.println("Play " + this.getClass().getSimpleName() + " with size " + this.size);
    }
}
