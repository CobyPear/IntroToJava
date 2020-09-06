package ScannerPractice;

import java.util.Scanner;

public class ExampleOne {

    public static void main(String[] args) {

        // Scanner sc = new Scanner(System.in);

        // System.out.println("Please type in a line and hit Enter");

        // String line = sc.nextLine();
        // System.out.println("You have typed: " + line);
        // sc.close();

        // String numbers = "1 2 5 6 8";
        // Scanner scanner = new Scanner(numbers);

        // while (scanner.hasNextInt()) {
        // System.out.print(scanner.nextInt());
        // }
        // scanner.close();

        // ExampleOne eo = new ExampleOne();

        // System.out.println("");
        // eo.numberOfVowels();

        userInput();
    }

    public void numberOfVowels() {

        Scanner sc = new Scanner(System.in);
        int counter = 0;
        // set our input line to a string variable
        String line = sc.nextLine();
        for (int i = 0; i < line.length(); i++) { // remember, length of a string is called as a method

            char letter = line.charAt(i);

            if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
                counter++;
            }
        }
        System.out.print("Your line had " + counter + " vowels");

        sc.close();

    }

    // public static void printVowels() {
    // Scanner scanner = new Scanner(System.in);
    // System.out.println("Please type in a line and hit Enter.");
    // String line = scanner.nextLine();
    // int count = 0;
    // for (int i = 0; i < line.length(); i++) {
    // char letter = line.charAt(i);
    // if (isVowel(letter)) {
    // count++;
    // }
    // }
    // System.out.println("The number of vowels: " + count);
    // scanner.close();
    // }

    // public static boolean isVowel(char letter) {
    // if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' ||
    // letter == 'u') {
    // return true;
    // }
    // return false;
    // }

    public static void userInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter 1, 2, 3, 4, or q to quit");
        boolean exit = false;
        
        while (sc.hasNext()) {

            String input = sc.next();

            switch (input) {
                case "1":
                    System.out.println("Moving Right");
                    break;
                case "2":
                    System.out.println("Moving Left");
                    break;
                case "3":
                    System.out.println("Moving Up");
                    break;
                case "4":
                    System.out.println("Moving Down");
                    break;
                case "q":
                    System.out.println("Bye bye");
                    exit = true;
                    sc.close();
                    break;
                default:
                    System.out.println(
                            "Try again. Acceptable input:  [1 - Move Right, 2 - Move Left, 3 - Move Up, 4 - Move Down, q - exit program]");
            }
            if (exit) {
                break;
            }
        }
    }
}
