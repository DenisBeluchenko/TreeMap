import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Den", "Bul Bul Ogly", 16));
        people.add(new Person("jula", "Belyuchtnko", 44));
        people.add(new Person("Any", "Bul Bul Ogly", 46));
        people.add(new Person("Denis", "Belyuchtnko", 46));
        Collections.sort(people, new PersonComparator());
        System.out.println(people);
    }
}
