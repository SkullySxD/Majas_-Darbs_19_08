import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String[] elements = {"Akmens", "Skeres", "Papirits"};
        String result = elements[new Random().nextInt(elements.length)];


        while (true) {
            System.out.println("Izvēlies: Akmens, Skeres, Papirits");
            String userChoice = scan.nextLine();
            if (userChoice.equals(result)) {
                System.out.println("Neizšķirts");
            } else if (userChoice.equals("Akmens")) {
                switch (result) {
                    case "Skeres":
                        System.out.println("Tu uzvarēji");
                        break;
                    case "Papirits":
                        System.out.println("Tu zaudēji");
                        break;
                }
            } else if (userChoice.equals("Papirits")) {
                switch (result) {
                    case "Akmens":
                        System.out.println("Tu uzvarēji");
                        break;
                    case "Skeres":
                        System.out.println("Tu zaudēji");
                        break;

                }
            } else if (userChoice.equals("Skeres")) {
                switch (result) {
                    case "Papirits":
                        System.out.println("Tu uzvarēji");
                        break;
                    case "Akmens":
                        System.out.println("Tu zaudēji");
                        break;
                }
            }

        }
    }
}