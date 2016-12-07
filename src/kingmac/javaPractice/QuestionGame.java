package kingmac.javaPractice;

import java.util.ArrayList;
import java.util.Scanner;

public class QuestionGame {
    private static Scanner scanner;

    public static void main(String[] args) {
        scanner = new Scanner(System.in);

        ArrayList<String> leftOrRight = new ArrayList<>();
        leftOrRight.add("left");
        leftOrRight.add("right");

        ArrayList<String> yesOrNo = new ArrayList<>();
        yesOrNo.add("yes");
        yesOrNo.add("no");

        if (askQuestion("Left or right?", leftOrRight).equals("left")) {
            if (askQuestion("There's a door, open it?", yesOrNo).equals("yes")) {
                System.out.println("There's a murderer, you die.");
            }
            else {
                System.out.println("The door opens anyways.");
                if (askQuestion("Do you want to go in?", yesOrNo).equals("yes")) {
                    System.out.println("You walk into the room.");

                }
                else {
                    System.out.println("A dark figure pulls you into the door and gives you \nSpankings.");
                }
            }

        }
        else {
            System.out.println("You get kidnapped, you lose.");
        }


    }

    public static String askQuestion(String            question,
                                     ArrayList<String> possibleAnswers) {
        System.out.println(question);

        String answer;

        while (true) {
            answer = scanner.next().trim().toLowerCase();

            boolean found = false;
            for (String i : possibleAnswers) {
                if (answer.equals(i)) {
                    found = true;
                    break;
                }
            }

            if (found) {
                break;
            }
        }

        return answer;
    }
}
