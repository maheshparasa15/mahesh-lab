import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MaxStudentsExample {
    public static void main(String[] args) {

        List<University> universities = Arrays.asList(
                new University("Harvard", 22000),
                new University("Stanford", 16000),
                new University("MIT", 11466),
                new University("UCLA", 45000),
                new University("UC Berkeley", 45000)
        );

        // Step 1: Find max students value
        int maxStudents = universities.stream()
                .mapToInt(University::getStudents)
                .max()
                .orElse(0);

        // Step 2: Filter universities having max students
        List<University> maxUniversities = universities.stream()
                .filter(u -> u.getStudents() == maxStudents)
                .collect(Collectors.toList());

        // Print result
        System.out.println("Universities with maximum students (" + maxStudents + "):");
        maxUniversities.forEach(u -> System.out.println(u.getName()));
    }
}
