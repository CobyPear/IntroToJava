package LabRecursion;

public class ExampleOne {

    public static void main(String[] args) {

        ExampleOne eo = new ExampleOne();

        // int input = 5;
        // System.out.println(eo.factorial(input));

        // eo.prevLetters('z');

        int[] array = { 1, 2, 3, 4, 5 };

        eo.binarySearch(array, 2);

    }

    // recursive altorithm for calculating the factorial of a number.
    // a factorial is the sum of n * (n-1) * (n-2) and so on.

    public int factorial(int num) {
        if (num <= 0)
            return 0;
        if (num == 1)
            return 1;

        // our recursive call:
        return num * factorial(num - 1);

    }

    public void prevLetters(char letter) {
        if (letter < 'a' || letter > 'z')
            return;

        System.out.println(letter);
        letter--;
        prevLetters(letter);

    }

    public int[] firstHalf(int[] arr) {

        int mid = arr.length / 2;
        int[] firstHalf = new int[mid];

        for (int i = 0; i < arr.length; i++) {
            if (i < mid) {
                firstHalf[i] = arr[i];
            }
        }
        return firstHalf;
    }

    public int[] lastHalf(int[] arr) {

        int mid = arr.length / 2;
        int[] lastHalf = new int[mid];

        for (int i = 0; i < arr.length; i++) {
            if (i < mid) {
                lastHalf[(mid - i) - 1] = arr[(arr.length - 1 - i)];
            }
        }
        return lastHalf;
    }

    // public int binarySearch(int[] arr, int target) {
    // // [1, 2, 3, 4, 5]
    // if (arr == null)
    // return -1;

    // int minIndex = 0;
    // int maxIndex = arr.length;
    // int midPoint = arr[maxIndex/2];

    // if (target == midPoint) {
    // return midPoint;
    // } else if (arr.length == 1) {
    //     return -1;
    // } else if (target > midPoint) {

    // } else if (target < midPoint) {
    //     minIndex = (maxIndex/2);


    // }

    // return -1;
    // }

    public int binarySearch(int[] data, int target) {
        // return -1 if the given array is empty
        if (data == null || data.length == 0)
            return -1;
        // define the range of indexes
        int minRange = 0;
        int maxRange = data.length;
        // find the midpoint value
        int midpoint = data[maxRange / 2];
        if (midpoint == target) {
            return maxRange / 2;
            // return the position
        } else if (data.length == 1) {
            return -1;
            // this is to stop additional recursive calls
        } else if (midpoint < target) {
            minRange = (maxRange / 2);
            // create new data to search upon
            int[] temp = copyArray(data, minRange, maxRange);
            // need to add the range if it is in the upper half
            // to keep track of the index otherwise the index is based
            // on the smaller range
            int indexAdder = (maxRange / 2);
            // find the index in the smaller array
            int search = binarySearch(temp, target);
            // check if the search found the value
            if (search == -1) {
                return -1;
                // return -1, if the search didn't find it
            } else {
                return indexAdder + search;
                // return the value plus the adder if found
            }
        } else if (midpoint > target) {
            maxRange = (maxRange / 2);
            // create new data to search upon
            int[] temp = copyArray(data, minRange, maxRange);
            // because we're searching the lower half, we don't need to keep track of the
            // index
            return binarySearch(temp, target);
        }
        return -1;
    }

    // A method used to copy the values of one array into the next
    public int[] copyArray(int[] original, int min, int max) {
        int[] target = new int[max - min];
        for (int i = 0; i < target.length; i++) {
            target[i] = original[min + i];
        }
        return target;
    }

}