package programming;

import java.util.List;

public class FP01Exercises {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(12, 9, 13, 4, 6, 2, 4, 12, 15);
        List<String> courses = List.of("Spring", "Spring Boot", "API" , "Microservices", "AWS", "PCF","Azure",
                "Docker", "Kubernetes");

//        printAllNumbersInListFunctional(numbers);
//        printEvenNumbersInListFunctional(numbers);
//        printOddNumbersInListFunctional(numbers);
//        printAllCoursesInListFunctional(courses);
//        printSpringCoursesInListFunctional(courses);
        print4lettersCoursesInListFunctional(courses);

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
}
