package LabForLoops;

public class Loops {

    public static void main(String[] args) {
        
        for (int i = 0; i <= 10; i++) {

            System.out.println(i);
        }

        // create an array of ten byte values. the values can be any arbitrary numbers that you choose. now use a for-loop to iterate over the elements in the array and print them to the console.

        byte[] b = {1, 3, 5, 6, 2, 4, 8, 1, 7, 10};

        for (int i = 0; i < b.length; i++) {
            System.out.println(b[i]);
        }
    }
}