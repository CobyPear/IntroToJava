public class OverloadedMethods {
    
    public static void main(String[] args) {
        // create instance here
        OverloadedMethods om = new OverloadedMethods();
        om.print();
        om.print("Hello");
        om.print("Hello", "World");
    }

    // overloaded methods here
    public void print() {
        System.out.println("Original print method");
    }

    public void print(String str) {
        System.out.println(str);
    }

    public void print(String str, String str2) {
        System.out.println(str + " " + str2);
    }

    // this method will conflict with the one right above it bc it has the same number and same types of inputs. changing the paramater names doesn't overload the method.
    // public void print(String first, String second) {
    //     System.out.println(first + " " + second);
    // }
}
