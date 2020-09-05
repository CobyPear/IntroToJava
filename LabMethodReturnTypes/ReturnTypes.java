package LabMethodReturnTypes;

public class ReturnTypes {
    
    public static void main(String[] args) {
        
        // new instance of ReturnTypes method
        ReturnTypes rt = new ReturnTypes();

        // call methods below
        rt.returnNothing();

        boolean b = rt.returnBoolean();
        System.out.println(b);
        
        double PI = rt.getPi();
        System.out.println(PI);
    }

    public void returnNothing() {
        System.out.println("Inside of a void method");
    }

    // a method that returns a boolean value
    public boolean returnBoolean() {
        return true;
    }

    public double getPi() {
        return Math.PI;
    }
}
