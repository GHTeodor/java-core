package lesson3.task1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Magazine implements Printable {
    private String magazine;

    @Override
    public void print(ArrayList<Printable> list) {
        System.out.println(list);
    }
}
