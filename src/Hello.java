

// prints hello
public class Hello {
    private static int add(int a, int b) {
        return a + b;
    }
    
    private static int sub(int a, int b) {
        return a - b;
    }
    
    private static int mult(int a, int b) {
        return a * b;
    }
    
    private static int div(int a, int b) {
        if (b == 0) throw new IllegalArgumentException("Cannot divide by 0!");
        
        return a / b;
    }
    
    private static int mod(int a, int b) {
        if (b == 0) throw new IllegalArgumentException("Cannot divide by 0!");
        
        return a % b;
    }
    
    public static void main(String [] args) {
        System.out.println("Hello");
        System.out.println(add(4, 5));
    }
}
