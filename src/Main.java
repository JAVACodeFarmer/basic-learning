import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Person pe = new Person();
        pe.name = "hha";
        pe.gender = Person.Sex.MALE;
        pe.emailAddress = "123";
        Person pe2 = new Person();
        pe2.name = "hhaabb";
        pe2.gender = Person.Sex.MALE;
        pe2.emailAddress = "456";
        List<Person> list = new ArrayList<>();
        list.add(pe);
        list.add(pe2);
//        pe.printPerson(list, (Person p) -> p.gender == Person.Sex.MALE && p.getAge() >= 18 && p.getAge() <= 25);

//        CheckPersonEligibleForSelectiveService.printPersonsWithPredicate(list,
//                (Person p) -> p.gender == Person.Sex.MALE && p.getAge() >= 18 && p.getAge() <= 25);

//        CheckPersonEligibleForSelectiveService.processPersons(list,
//                p -> p.gender == Person.Sex.MALE && p.getAge() >= 18 && p.getAge() <= 25,
//                p -> p.printPerson());

//        CheckPersonEligibleForSelectiveService.processPersonsWithFunction(
//                list,
//                p -> p.gender == Person.Sex.MALE
//                        && p.getAge() >= 18
//                        && p.getAge() <= 25,
//                p -> p.emailAddress,
//                email -> System.out.println(email)
//        );

//        CheckPersonEligibleForSelectiveService.processElements(
//                list,
//                p -> p.gender == Person.Sex.MALE
//                        && p.getAge() >= 18
//                        && p.getAge() <= 25,
//                p -> p.emailAddress,
//                email -> System.out.println(email)
//        );

        //聚合操作流
        list.stream()
                .filter( (p) -> p.gender == Person.Sex.MALE && p.getAge() >= 18 && p.getAge() <= 25)
                .map( (p) -> p.emailAddress)
//                .collect(Collectors.toList())
                .forEach( s -> System.out.println(s));
    }
}
