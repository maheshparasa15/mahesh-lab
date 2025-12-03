import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class University {
    private String name;
    private int students;

    public String getName() {
        return name;
    }

    public University(String name, int students) {
        this.name = name;
        this.students = students;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudents() {
        return students;
    }

    public void setStudents(int students) {
        this.students = students;
    }
}

