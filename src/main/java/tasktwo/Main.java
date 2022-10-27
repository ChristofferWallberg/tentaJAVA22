package tasktwo;

import java.util.Scanner;

/**
 * Klass för uppgift 2
 */
public class Main {
    /**
     * metod för uppgift 2
     * @param args
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Var god ange namn: ");
        String name = scanner.next();

        switch (name.charAt(0)) {
            case 'Ö':
                System.out.println("Namnet börjar på bokstaven Ö och det är sista bokstaven i alfabetet!");
                break;
            default:
                System.out.println("Namnet börjar på bokstaven " + name.charAt(0));
        }
    }
}
