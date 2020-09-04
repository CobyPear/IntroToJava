package LabStringMethods;

public class StringMethods {

    public static void main(String[] args) {
        
        String str = "Hello";
        String s = new String("Hello");
        String b = new String("hello");

        System.out.println(str.equals("Hello"));
        System.out.println(str.equals(s));
        System.out.println(str.length());
        System.out.println(str.indexOf("L"));
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
        System.out.println(str.equalsIgnoreCase(b));
        System.out.println(str.substring(2));


    }
}
