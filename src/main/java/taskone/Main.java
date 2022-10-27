package taskone;

import java.util.Scanner;

/**
 * Main klassen för uppgift 1
 */
public class Main {

    // Fråga anv efter user och name

    /**
     * Main metoden för uppgift 1
     * @param args
     */
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Var god ange namn: ");
            String name = scanner.next();

            if (name.startsWith("Ö")) {
                System.out.println("Namnet börjar på bokstaven Ö och det är sista bokstaven i alfabetet!");
            } else {
                System.out.println("Namnet börjar på bokstaven " + name.charAt(0));
            }
    }
}
