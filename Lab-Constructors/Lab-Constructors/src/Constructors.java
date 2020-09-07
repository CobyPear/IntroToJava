public class Constructors {

    public Constructors() {
        System.out.println("Default Constructor Ran");
    }
    
    public Constructors(int value) {
        System.out.println(value);
    }
    public static void main(String[] args) {
        Constructors c = new Constructors(5);
        Constructors cNoArg = new Constructors();
    }
}
