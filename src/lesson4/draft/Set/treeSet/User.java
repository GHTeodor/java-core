package lesson4.draft.Set.treeSet;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Comparable<User>{
    private int id;
    private String name;

    @Override
    public int compareTo(User o) {
        return this.id - o.getId();
    }
}
