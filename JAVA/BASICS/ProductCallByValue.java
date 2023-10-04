public class ProductCallByValue {
    public static int multiply (int a, int b) {
        int product = a * b;
        return product;

    }
    public static void main(String[] args) {
        int a = 3;
        int b = 6;
        int result = multiply(a, b);
        System.out.println(result);
        result = multiply(20 , 40);
        System.out.println(result);

        
    }
    
}
