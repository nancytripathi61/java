package programs.input;
import java.util.Scanner;
public class sum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first number");
        double num1 = sc.nextDouble();
        System.out.println("enter second number");
        double num2 = sc.nextDouble();
        double sum = num1+num2;
        System.out.println("sum is " +sum);
        sc.close();
    }
}
