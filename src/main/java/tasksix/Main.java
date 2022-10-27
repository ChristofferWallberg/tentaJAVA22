package tasksix;

import java.util.Scanner;

/**
 * klass uppgf 6
 */
public class Main {
    /**
     * metod uppgf 6
     * @param args
     */
    public static void main(String[] args) {
        int points = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nämn en roll i Scrum: ");
        String roleScrum = scanner.nextLine();
        if (roleScrum.equalsIgnoreCase("Product Owner")) {
            ++points;
        } else if (roleScrum.equalsIgnoreCase("Scrum Master")) {
            ++points;
        } else if (roleScrum.equalsIgnoreCase("Team member")) {
            ++points;
        }
        System.out.println("Nämn en ceremoni inom Scrum: ");
        String ceremonyScrum = scanner.nextLine();
        if (ceremonyScrum.equalsIgnoreCase("sprint planning")) {
            ++points;
        } else if (ceremonyScrum.equalsIgnoreCase("daily standup")) {
            ++points;
        } else if (ceremonyScrum.equalsIgnoreCase("sprint review")) {
            ++points;
        } else if (ceremonyScrum.equalsIgnoreCase("sprint retrospective")) {
            ++points;
        } else if (ceremonyScrum.equalsIgnoreCase("product backlog grooming")) {
            ++points;
        }

        System.out.println("Hur många är rekommenderat max antal person i ett Scrumteam?");
        int amountOfPeopleScrum = Integer.parseInt(scanner.nextLine());
        if (amountOfPeopleScrum == 9) {
            ++points;
        }

        System.out.println("Vad heter dokumentet där all information om Scrum finns?");
        String docScrum = scanner.nextLine();
        if (docScrum.equalsIgnoreCase("Scrum guide")) {
            ++points;
        }

        System.out.println("Vem är den enda personen som avbryta en Sprint?");
        String leaderScrum = scanner.nextLine();
        if (leaderScrum.equalsIgnoreCase("Product Owner")) {
            ++points;
        }

        if (points < 3) {
            System.out.println("Du har fått " + points + ". Du bör läsa på lite mer om Scrum.");
        } else if (points == 5) {
            System.out.println("Du har fått " + points + ". Grattis du fick alla rätt!");
        } else {
            System.out.println("Du har fått " + points + ".");
        }
    }
}
