package taskthree;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Person {
    private String firstName;
    private String lastName;
    private String favouriteMovie;

    public Person() {
    }

    public Person(String firstName, String lastName, String favouriteMovie) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.favouriteMovie = favouriteMovie;

    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFavouriteMovie() {
        return favouriteMovie;
    }

    public void setFavouriteMovie(String favouriteMovie) {
        this.favouriteMovie = favouriteMovie;
    }

    @Override
    public String toString() {
        return  "Förnamn: " + firstName +
                "\nEfternamn: " + lastName +
                "\nFavoritfilm: " + favouriteMovie +
                "\n-------------------------------------";
    }
    public static List<Person> createPerson() {
        Scanner scanner = new Scanner(System.in);
        int cancel;
        List<Person> people = new ArrayList<>();
        String firstName;
        String lastName;
        String favouriteMovie;

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
                    lastName = scanner.next();
                    System.out.println("Var god ange favoritfilm");
                    favouriteMovie = scanner.next();

                    Person newPerson = new Person(firstName, lastName, favouriteMovie);
                    people.add(newPerson);

            }

        } while (cancel != 1);

        return people;
    }
}
