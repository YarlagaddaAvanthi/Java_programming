import java.util.Scanner;

public class Day3d {
    long factorial(int a){
        long fact =1;
        for (int i=1;i<=a;i++){
            fact *= i;
        }
        return fact;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int a =sc.nextInt();
        
        Day3d d3= new Day3d();
        long result =d3.factorial(a);

        System.out.println("Factorial= "+result);
    }
}
 
    

