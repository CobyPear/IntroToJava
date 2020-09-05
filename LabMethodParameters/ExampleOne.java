package LabMethodParameters;

public class ExampleOne {
    
    public static void main(String[] args) {
        
        printName("Coby");
    }

    // paramater names follow the same rules as variables and must be unique within a single method
    // Local varaibles cannot share names with paramaters.
    public static void printName(String name) {
        System.out.println("Hello " + name);
    }
}
