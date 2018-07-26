package lambda2;

import java.util.*;
import java.util.function.Supplier;

/**
 * Created by yi.yh on 2018/7/23.
 */
public class MainTest {
    public static void main(String[] args) {


        String[] stringArray = { "Barbara", "James", "Mary", "John",
                "Patricia", "Robert", "Michael", "Linda" };
        Arrays.sort(stringArray, String::compareToIgnoreCase);


        Person p1 = new Person();
        Person p2 = new Person();
        Person[] arr = new Person[]{new Person(),  new Person()};
        Arrays.sort(arr, Person :: compareByAge);



        List<Person> people = Arrays.asList(arr);
        Set<Person> rosterSetLambda = transferElements(people, () -> {return new HashSet<>(); });
        Set<Person> rosterSet = transferElements(people, HashSet :: new);

    }


    public static <T, SOURCE extends Collection<T>, DEST extends Collection<T>> DEST transferElements(
            SOURCE sourceCollection, Supplier<DEST> collectionFactory) {

        DEST result = collectionFactory.get();
        for (T t : sourceCollection) {
            result.add(t);
        }
        return result;
    }
}
