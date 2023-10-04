public class FunctionOverloadingbyParameters {
    public static int sum (int a, int b ) {
        return a + b;
    }
    public static int sum (int a, int b, int c) {
        return a + b +c;
    }
    public static void main(String[] args) {
        System.out.println(sum(3,5));
        System.out.println(sum(3,4,5));
    }
    
}
/*  using data types

public static int sum (int a, int b) {
    return a + b;
}
public static float sum (int a, int b) {
    return a + b;
}
public static void main (String[] args) {
    System.out.print(sum(2,5));
     System.out.print(sum(2f,5f));

} */