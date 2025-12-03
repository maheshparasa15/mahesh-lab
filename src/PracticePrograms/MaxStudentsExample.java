package PracticePrograms;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
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

        int maxStudents = universities.stream().mapToInt(University::getStudents).max().orElse(0);
        System.out.println(maxStudents);
        List<University> universitiesList = universities.stream().filter(uni -> uni.getStudents() == maxStudents).toList();
        universitiesList.forEach(x -> System.out.println(x.getName() + " " + x.getStudents()));

    }
}
