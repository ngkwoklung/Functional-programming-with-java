package programming;

import java.util.List;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class FP01Exercises {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
        List<String> courses = List.of("Spring", "Spring Boot", "API" , "Microservices",
                "AWS", "PCF","Azure", "Docker", "Kubernetes");

//        printAllNumbersInListFunctional(numbers);
//        printEvenNumbersInListFunctional(numbers);
//        printOddNumbersInListFunctional(numbers);
//        printAllCoursesInListFunctional(courses);
//        printSpringCoursesInListFunctional(courses);
//        print4lettersCoursesInListFunctional(courses);
//        ex5PrintCubesOfOddNumbers(numbers);
//        ex6PrintNumberOfCharInEachCourse(courses);
//        List<Integer> evenNumbers = ex10CreateListOfEvenNumbers(numbers);
//        System.out.println(evenNumbers);

        List<String> courseNameLength = ex11CreateListOfCourseNameLength(courses);
        System.out.println(courseNameLength);

    }

    private static List<String> ex11CreateListOfCourseNameLength(List<String> courses) {
        return courses.stream()
                .map(x -> x + " " + x.length())
                .collect(Collectors.toList());
    }

    private static List ex10CreateListOfEvenNumbers(List<Integer> numbers) {
        return numbers.stream()
                .filter(x -> x % 2 !=0)
                .collect(Collectors.toList());
    }

    private static void printAllNumbersInListFunctional(List<Integer> numbers) {

        numbers.stream()
                .forEach(System.out::println); //Method Reference
    }

    private static void printEvenNumbersInListFunctional(List<Integer> numbers) {

        numbers.stream()
//                .filter(FP01Functional::isEven)
                .filter(number -> number % 2 == 0)
                .forEach(System.out::println); //Method Reference
    }

    private static void printOddNumbersInListFunctional(List<Integer> numbers) {
        numbers.stream()
                .filter(number -> number % 2 != 0)
                .forEach(System.out::println);
    }

    private static void printAllCoursesInListFunctional(List<String> courses) {
        courses.stream()
                .forEach(System.out::println);
    }

    private static void printSpringCoursesInListFunctional(List<String> courses) {
        courses.stream()
                .filter(course -> course.toLowerCase().contains("spring"))
                .forEach(System.out::println);
    }

    private static void print4lettersCoursesInListFunctional(List<String> courses) {
        courses.stream()
                .filter(course -> course.length() >= 4)
                .forEach(System.out::println);
    }

    private static void ex5PrintCubesOfOddNumbers(List<Integer> numbers) {
        numbers.stream()
                .filter(number -> number % 2 != 0)
                .map(number -> number * number * number)
                .forEach(System.out::println);
    }

    private static void ex6PrintNumberOfCharInEachCourse(List<String> courses) {
        courses.stream()
                .map(course -> course + " " + course.length())
                .forEach(System.out::println);
    }
}
