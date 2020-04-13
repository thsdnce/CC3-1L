package salary;

public class Salary {

    public static void main(String[] args) {
        int hourlypayrate = 0;
        int regularhours = 0;
        int overtimehours = 0;
        double number = 0;
        
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter hourly pay rate: ");
        hourlypayrate = sc.nextInt();
        System.out.print("Enter regular hours: ");
        regularhours = sc.nextInt();
        System.out.print("Enter overtime hours: ");
        overtimehours = sc.nextInt();
        number = 1.5;
        System.out.println("Weekly Salary: "+calculate(hourlypayrate,regularhours,overtimehours,number));      
    }
    static double calculate(int hourlypayrate, int regularhours, int overtimehours, double number){
        double calculate = regularhours * hourlypayrate + overtimehours * number * hourlypayrate;
        return calculate;        
    }   
}
