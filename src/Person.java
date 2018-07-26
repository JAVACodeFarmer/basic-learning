import java.time.LocalDate;
import java.util.List;

/**
 * Created by yi.yh on 2018/7/20.
 */
public class Person {

    public enum Sex {
        MALE, FEMALE
    }

    String name;
    LocalDate birthday;
    Sex gender;
    String emailAddress="123456789";

    public int getAge() {
        return 20;
    }

    public void printPerson() {
        System.out.println(this.toString());
    }

    public void printPerson(List<Person> roster, CheckPerson tester) {
        roster.stream().forEach(p->{
            boolean result = tester.test(p);
            if(result)
                System.out.println(p.toString());
        });
    }


    @Override
    public String toString() {
        return "name:"+ this.name + ", birthday:"+ this.birthday;
    }
}
