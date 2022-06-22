package lesson5.draft_stream;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private int id;
    private String name;
    private boolean status;
    private List<String> skills = new ArrayList<String>() {{
        this.add("Java");
        this.add("JS");
        this.add("Node");
    }};

    public User(int id, String name, boolean status) {
        this.id = id;
        this.name = name;
        this.status = status;
    }
}
