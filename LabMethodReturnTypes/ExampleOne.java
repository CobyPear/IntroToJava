package LabMethodReturnTypes;

public class ExampleOne {
        public static void main(String[] args) {
            String val = stringReturn();
            System.out.println(val);
        }

        public static String stringReturn() {
            return "Hello";
        }
}
