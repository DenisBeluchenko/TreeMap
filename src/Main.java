import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Andrej", "Belyuchtnko", 14));
        people.add(new Person("jula", "Belyuchtnko", 9));
        people.add(new Person("Any", "Bul Bul Ogly", 46));
        people.add(new Person("Denis", "Belyuchtnko", 46));
        Collections.sort(people, compare -> {
            int len1 = compare.getSurname().split(" ").length;
            int len2 = compare.getSurname().split(" ").length;
            if (len1 != len2) return Integer.compare(len1, len2);
            return Integer.compare(compare.getAge(), compare.getAge());
        };);
        System.out.println(people);
    }
}
