package exponent;

public class Exponent {
    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        int num = 0; 
        System.out.print("Enter an integer number: ");
        num=sc.nextInt();
        System.out.println("Squared: "+squared(num));
        System.out.println("Cubed: "+cube(num));    
}
    static int squared(int num){
        
       int square = num * num;
       return square;
       
    }
    static int cube(int num){
        int cube = num * num * num;
        return cube;
    }
}
