public class Day3f {
    void nonStaticMethod(){
        System.out.println("This is a non-Static method");
    }

    static void StaticMethod(){
        System.out.println("This is a Static Method");
    }

    public static void main(String[] args) {
        StaticMethod();
        // Calling non-static method
        // Object is REQUIRED because non-static belongs to the object
        Day3f d3= new Day3f();
        d3.nonStaticMethod();       
    }
    
}
