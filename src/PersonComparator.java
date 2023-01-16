import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        int len1 = o1.getSurname().split(" ").length;
        int len2 = o2.getSurname().split(" ").length;
        if (len1 != len2) {
            return Integer.compare(len1, len2);
        }
        return Integer.compare(o1.getAge(), o2.getAge());
    }
}