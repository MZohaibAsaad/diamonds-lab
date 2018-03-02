import java.util.Scanner;
import java.util.StringJoiner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Welcome to my Stars World....... (-^-) \n\n\n");

         Double userInput = getUserInput(reader);
        // topDownLeftSideStarsTriangle();
        // bottomUpLeftSideStarsTriangle();
        // topDownRightSideStarsTriangle();
        // bottomUpRightSideStarsTriangle();
        // starsRectangle();             not yet completed.
        // diamondStars();
        diamondStarsWithUserInput(userInput);
    }

    private static Double getUserInput(Scanner reader) {
        try {
            System.out.println("Enter the max number of stars in one line..and it should be odd number...");
            String input = reader.next();
            return Double.parseDouble(input);
        }
        catch (Exception e){
            System.out.println("Wrong input.. please try the right input.....");
            return getUserInput(reader);
        }


    }

    private static void topDownLeftSideStarsTriangle() {
        System.out.println("Starting Top down left side triangle with 10 Stars\n\n");

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void bottomUpLeftSideStarsTriangle() {
        System.out.println("Starting Bottom up left side Triangle with 10 Stars..\n\n");

        for (int i = 10; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    private static void bottomUpRightSideStarsTriangle() {
        System.out.println("Starting Top Down Right Side Triangle with 10 Stars\n\n");

        boolean check;
        for (int i = 0; i < 10; i++) {
            check = false;
            for (int j = 10; j > i; j--) {
                if (!check) {
                    for (int k = 0; k < i; k++) {
                        System.out.print(" ");
                        check = true;
                    }
                }
                System.out.print("*");
            }
            System.out.println();
        }

    }

    private static void topDownRightSideStarsTriangle() {
        System.out.println("Starting Bottom Up Right Side Triangle with 10 Stars\n\n");

        boolean check;
        for (int i = 1; i <= 10; i++) {
            check = false;
            for (int j = 0; j < i; j++) {
                if (!check) {
                    for (int k = 10; k > i; k--) {
                        System.out.print(" ");
                        check = true;
                    }
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void starsRectangle() {
        System.out.println("Staring Rectangle with 10 stars....\n\n");

        for (int i = 0; i < 10; i++) {
            for (int j = 10; j > i; j--) {
                for (int k = 0; k < j; k++) {
                    System.out.print("*");
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    private static void diamondStars() {
        System.out.println("Starting Diamond of Stars with 10 Stars.....\n\n");


        //   Upper half of Diamond....

        boolean check1;
        for (int i = 1; i <= 10; i++) {
            check1 = false;
            for (int j = 0; j < i; j++) {
                if (!check1) {
                    for (int k = 9; k >= i; k--) {
                        System.out.print(" ");
                        check1 = true;
                    }
                }
                System.out.print("*");
                }
            for (int k =0; k < i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }





        // Lower half of Diamond....

        boolean check;
        for (int i = 0; i < 9; i++) {
            check = false;
            for (int j = 9; j > i; j--) {
                if (!check) {
                    for (int k = 0; k <= i; k++) {
                        System.out.print(" ");
                        check = true;
                    }
                }
                System.out.print("*");
            }
            for (int k = 8; k > i ; k--) {
                System.out.print("*");
            }
            System.out.println();
        }


    }

    private static void diamondStarsWithUserInput(Double userInput) {

        System.out.println("Starting Diamond of Stars with user input.......\n\n");
        

    }
}

