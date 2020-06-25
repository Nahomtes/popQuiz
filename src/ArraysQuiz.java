import java.util.Arrays;
import java.util.Scanner;
public class ArraysQuiz {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nJava program to find the index of an array element. \n");

        // First Part
        indexFinderForNumbers(scanner);
        System.out.println();

        // Second Part (Bonus)
        indexFinderForString(scanner);

    }

    // First Part
    public static void indexFinderForNumbers(Scanner scanner){
        int[] arrayElements = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};

        System.out.println("1. Elements in Array: " + Arrays.toString(arrayElements) +"\n");

        boolean askAgain = true;
        boolean firstOne = true;
        boolean found = false;
        int inputElement = 0;
        do {
            if (firstOne) {
                System.out.println("Enter an element inorder to find out it's index in the array: ");
                firstOne = false;
                inputElement = scanner.nextInt();
            }
            boolean first = true;
            found = false;
            for (int i=0; i < arrayElements.length; i++) {
                if (inputElement == arrayElements[i]) {
                    if (first) {
                        found = true;
                        System.out.printf("\t- " +inputElement + " is located at index: %d", i);
                        first = false;
                    } else System.out.printf(", %d ", i);
                }
            }
            if(!found) System.out.println("\t- " + inputElement + " is not in the array");
            else System.out.println();

            System.out.println("Enter another element inorder to find out " +
                    "it's index in the array or (type \"0\" to stop): ");
            inputElement = scanner.nextInt();
            askAgain = inputElement == 0;

        } while (!askAgain);

        System.out.println("\n \t\t********* DONE! *********");
    }

    // // Second Part (Bonus)
    public static void indexFinderForString(Scanner scanner) {
        String[] arrayElements = { "January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"};
        System.out.println("2. Elements in Array: " + Arrays.toString(arrayElements) +"\n");

        boolean askAgain = false;
        boolean firstOne = true;
        String inputElement = "";
        boolean found = false;
        do {
            if (firstOne) {
                System.out.println("Enter an element inorder to find out it's index in the array: ");
                firstOne = false;
                inputElement = scanner.next();
            }

            boolean first = true;
            found = false;
            for (int i=0; i < arrayElements.length; i++) {
                if (inputElement.equals(arrayElements[i])) {
                    found = true;
                    if (first) {
                        System.out.printf("\t- " +inputElement + " is located at index %d", i);
                        first = false;
                    } else System.out.printf(", %d", i);
                }
            }
            if(!found) System.out.println("\t- " + inputElement + " is not in the array");
            else System.out.println();

            System.out.println("Enter another element inorder to find out " +
                    "it's index in the array or (type \"stop\" to stop): ");
            inputElement = scanner.next();
            askAgain = inputElement.compareToIgnoreCase("stop") == 0;

        } while (!askAgain);

        System.out.println("\n \t\t********* DONE! *********");
    }
}
