import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Andrej", "Belyuchtnko", 14));
        people.add(new Person("jula", "Belyuchtnko", 9));
        people.add(new Person("Any", "Bul Bul Ogly", 46));
        people.add(new Person("Denis", "Belyuchtnko", 46));
        Collections.sort(people, (o1, o2) -> {
            int len1 = o1.getSurname().split(" ").length;
            int len2 = o2.getSurname().split(" ").length;
            if (len1 != len2) {
                return Integer.compare(len1, len2);
            }
            return Integer.compare(o1.getAge(), o2.getAge());
        });
        Collections.sort(people, new PersonComparator());
        System.out.println(people);
    }
}
