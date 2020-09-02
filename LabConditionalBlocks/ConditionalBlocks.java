package LabConditionalBlocks;

public class ConditionalBlocks {

    public static void main(String[] args) {
        // boolean b = false;

        // if (b) {
        //     System.out.println("Inside the if statement!");

        // } else if (!b) {
        //     System.out.println("Else if executed!");
        // } else {
        //     System.out.println("Not sure how you got here, mate.");
        // }

        // System.out.println("Outside the if statement");

        boolean firstCondition = false;
        boolean secondCondition = true;

        if (firstCondition) {
            System.out.println("Inside the if-statement");

            if (secondCondition) {
                System.out.println("Inside the nested if-statement");
            }
        } else if (secondCondition) {
            System.out.println(5);
        } else {
            System.out.println("Inside else statement");
        }
    }
}