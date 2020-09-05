package LabSearchAlgorithms;

public class LinearSearch {

    public static void main(String[] args) {

        // dummy data for our method
        char[] letters = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
                's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };

        LinearSearch ls = new LinearSearch();
        System.out.println(ls.findLetter('z', letters));
        System.out.println(ls.findLetterBackwards('a', letters));
        System.out.println(ls.findLetterFromMiddle('r', letters));
    }

    public int findLetter(char target, char[] data) {
        if (data == null)
            return -1;

        int result = -1;

        for (int i = 0; i < data.length; i++) {

            char temp = data[i];

            if (temp == target) {
                return i;
            }
        }

        return result;
    }

    public int findLetterBackwards(char target, char[] data) {
        if (data == null)
            return -1;

        int result = -1;

        for (int i = data.length - 1; i > -1; i--) {

            char temp = data[i];

            if (temp == target) {
                return i;
            }
        }

        return result;
    }

    public int findLetterFromMiddle(char target, char[] data) {
        if (data == null)
            return -1;

        int mid = data.length / 2;
        char[] firstHalf = new char[mid];
        char[] lastHalf = new char[mid];

        for (int i = 0; i < data.length; i++) {
            if (i < mid) {
                firstHalf[i] = data[i];
                lastHalf[(mid - i) - 1] = data[(data.length - 1 - i)];
            }
            // System.out.println("first half i "+firstHalf[i]);
            // System.out.println("last half i "+lastHalf[i]);
        }

        int lastHalfResult = findLetter(target, lastHalf);
        int firstHalfResult = findLetterBackwards(target, firstHalf);

        if (firstHalfResult > lastHalfResult) {
            return firstHalfResult;
        } else {
            return lastHalfResult + lastHalf.length;
        }

    }
}