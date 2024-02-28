import java.sql.SQLSyntaxErrorException;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("Welcome to this Quiz!");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want to play? ");
        String playing = scanner.nextLine();
        int score = 0;

        if (!playing.equalsIgnoreCase("yes")) {
            System.exit(0);
        }

        System.out.println("Okay! Let's play!");

        System.out.println("What does CPU stand for? ");
        String CPU = scanner.nextLine();

        if (CPU.equalsIgnoreCase("central processing unit")) {
            System.out.println("Correct!");
            score += 1;

        } else {
            System.out.println("Incorrect!");
        }

        System.out.println("What does GPU stand for? ");
        String GPU = scanner.nextLine();

        if (GPU.equalsIgnoreCase("graphics processing unit")) {
            System.out.println("Correct!");
            score += 1;

        } else {
            System.out.println("Incorrect!");
        }

        System.out.println("What does RAM stand for? ");
        String RAM = scanner.nextLine();

        if (RAM.equalsIgnoreCase("random access memory")) {
            System.out.println("Correct!");
            score += 1;

        } else {
            System.out.println("Incorrect!");
        }
        System.out.println("What does PSU stand for? ");

        String PSU = scanner.nextLine();

        if (PSU.equalsIgnoreCase("power supply unit")) {
            System.out.println("Correct!");
            score += 1;

        } else {
            System.out.println("Incorrect!");
        }
        float percentage = (score / 4) * 100;
        System.out.println("You got " + percentage + "% of the questions correct!");
    }
}