import java.util.Scanner;

public class Day3e {
    int add(int a, int b){
        return a+b;
    }
    int add(int a, int b, int c){
        return a+b+c;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number:");
        int a=sc.nextInt();
        System.out.println("Enter 2nd number:");
        int b =sc.nextInt();
        System.out.println("Enter 3rd number:");
        int c =sc.nextInt();
        
        Day3e d3= new Day3e();
        int result1 = d3.add(a, b);
        int result2 = d3.add(a, b, c);

        System.out.println("Sum of 2 digits:"+result1);
        System.out.println("Sum of 3 digits:"+result2);
    }
    
}
