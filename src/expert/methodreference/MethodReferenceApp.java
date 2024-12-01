package expert.methodreference;

import java.util.Comparator;
import java.util.List;

public class MethodReferenceApp {

    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Steve", 40),
                new Person("Brit", 20),
                new Person("Adam", 27),
                new Person("Kumar", 91),
                new Person("Anna", 4),
                new Person("Anna", 12));


        PersonComparisonProvider comparisonProvider = new PersonComparisonProvider();
        people.stream()
                .sorted(comparisonProvider::compareByNameAndAge)
                .forEach(System.out::println);
    }
}
