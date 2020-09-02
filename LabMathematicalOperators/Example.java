package LabMathematicalOperators;

public class Example {
    public static void main(String[] args) {
        // default values
        int i = 200;

        // cast to a short
        short s = (short)i;
        System.out.println(s);

        // cast to a double
        double d = (double)i;
        System.out.println(d);

        // cast to a byte
        byte b = (byte)i;
        // this prints -56. Why? Because we've truncated bits by converting an int (32 bits) to a byte (8 bits) so we've lost some data and our output is not what we expected.
        System.out.println(b);
    }
}
