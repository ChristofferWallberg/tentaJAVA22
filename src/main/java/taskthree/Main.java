package taskthree;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * klass för uppgf 3
 */
public class Main {

    /**
     * metod uppgf 3
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String firstName = "";
        int cancel;
        List<Person> people = new ArrayList<>();
        do {

            System.out.println("1. Avbryt \n" +
                    "2. Fortsätt");
            cancel = scanner.nextInt();
            switch (cancel) {
                case 1:
                    for (Person person :
                            people) {
                        System.out.println(person.toString());
                    }
                    break;
                default:
                    System.out.println("Vad god ange förnamn: ");
                    firstName = scanner.next();
                    System.out.println("Var god ange efternamn: ");
                    String lastName = scanner.next();
                    System.out.println("Var god ange favoritfilm");
                    String favouriteMovie = scanner.next();

                    Person newPerson = new Person(firstName, lastName, favouriteMovie);
                    people.add(newPerson);

            }

        } while (cancel != 1);


    }
}
