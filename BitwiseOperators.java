public class BitwiseOperators {
    public static void main(String[] args) {
        int a = 5;  // 0101
        int b = 3;  // 0011
        System.out.println("a & b: " + (a & b)); 
        System.out.println("a | b: " + (a | b));
        System.out.println("a ^ b: " + (a ^ b)); 
        System.out.println("~a: " + (~a));     
        System.out.println("a << 1: " + (a << 1)); 
        System.out.println("a >> 1: " + (a >> 1)); 
    }
}
