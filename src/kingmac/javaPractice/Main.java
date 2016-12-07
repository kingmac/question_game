package kingmac.javaPractice;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> ages = new ArrayList<>();

        System.out.print("Left or Right ");
        ages.add(scanner.next());

        System.out.print("What is your mom's age? ");
        ages.add(scanner.next());

        System.out.print("What is your best friend's age? ");
        ages.add(scanner.next());

        for (int i = 0; i < ages.size(); i += 1) {

            System.out.println(i + ": " + ages.get(i));

        }
    }
}
