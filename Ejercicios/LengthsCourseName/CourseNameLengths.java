package LengthsCourseName;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Enunciado resumido: Dada una lista de nombres de cursos, devolver una lista con sus longitudes.
//Ejemplo:
//Input: ["Java", "Python", "JavaScript"]
//Output: [4, 6, 10]
public class CourseNameLengths {
    public static void main(String[] args) {
        List<String> courses = Arrays.asList("Java", "Python", "JavaScript");
        List<Integer> lengths = courseNameLengths(courses);
        System.out.println(lengths);
    }

    public static List<Integer> courseNameLengths(List<String> courses) {
        return courses.stream()
                      .map(String::length)
                      .collect(Collectors.toList());
    }

/*     public static List<Integer> courseNameLengths2(List<String> courses) {
        Function<String, Integer> lengthMapper = String::length;
        return courses.stream()
                      .map(lengthMapper)
                      .collect(Collectors.toList());
    } */

}
