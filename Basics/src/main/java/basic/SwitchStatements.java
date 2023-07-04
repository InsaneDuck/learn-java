package basic;

import java.util.Scanner;

public class SwitchStatements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter a number");
        int stage = scanner.nextInt();
        String season = switch (stage) {
            case 0 -> "Spring";
            case 1 -> "Summer";
            case 2 -> "Fall";
            default -> {
                System.out.println("entered invalid number");
                yield "Invalid";
            }
        };

        System.out.println(season);
    }
}
