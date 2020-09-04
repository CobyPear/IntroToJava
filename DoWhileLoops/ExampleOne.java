package DoWhileLoops;

public class ExampleOne {
    
    public static void main(String[] args) {
        int i = 1;

        do {
            System.out.println(i);
            i += 2;
        } while (i < 50);

        char letter = 'a';

        do {
            System.out.println(letter);
            letter++;
        } while (letter <= 'z');

    }
}
