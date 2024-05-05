import company.beans.Person;
import company.exceptions.InvalidAgeException;
import company.implementations.EmailMessenger;
import company.utils.MathUtils;

public class Main {
    public static void main(String[] args) {
        final int b = 10;

        Person[] people = new Person[5];

        try {
            people[0] = new Person("John Doe", 30);
            people[1] = new Person("Tom Ellis", 27);
            people[2] = new Person("Bob Marlin", 41);
            people[3] = new Person("Emily Clark", 33);
            people[4] = new Person("Jack Erickson", 22);

            for (Person person : people) {
                int result = MathUtils.add(person.getAge(), b);

                EmailMessenger emailMessenger = new EmailMessenger();
                emailMessenger.sendMessage(person.getName() + " - Result of addition is: " + result);
            }
        } catch (InvalidAgeException e) {
            System.out.println("Invalid age: " + e.getMessage());
        }
    }
}