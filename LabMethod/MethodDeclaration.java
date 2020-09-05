package LabMethod;

public class MethodDeclaration {

    public static void main(String[] args) {
        // creates an instance of our MethodDeclaration class
        MethodDeclaration md = new MethodDeclaration();

        // call the talk method of the MethodDeclaration class
        md.talk();

        // call getInt here
        int value = 150;
        int sameValue = md.getInt(value);

        System.out.println(sameValue);

        // call sum here

        System.out.println(md.sum(1, 2, 4.5));

        System.out.println(md.random());

    }

    // create first method here
    public void talk() {
        System.out.println("Inside of the talk method");
    }

    public int getInt(int input) {
        return input;
    }

    public double sum(int x, int y, double z) {
        return x + y + z;
    }

    public int random() {

        double d = (Math.random() * 50) + 1;

        return (int)d;
    }
}