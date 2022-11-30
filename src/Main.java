import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Andrej", "Belyuchtnko", 14));
        people.add(new Person("jula", "Belyuchtnko", 9));
        people.add(new Person("Any", "Bul Bul Ogly", 46));
        people.add(new Person("Denis", "Belyuchtnko", 46));
        people.removeIf(x -> x.getAge() < 18);
        System.out.println(people);
    }
}
