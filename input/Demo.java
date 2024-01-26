package programs.input;
import java.util.Scanner;
public class Demo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value in integer");
        int a = sc.nextInt();
        System.out.println("enter the value in float");
        float b = sc.nextFloat();
        System.out.println("enter the value in double");
        double d  = sc.nextDouble();
        System.out.println("enter the value in string");
        String str = sc.next();
        System.out.println("enter the value in character");
        char c = sc.next().charAt(0);
        System.out.println("a is " +a);
        System.out.println("b is " +b);
        System.out.println("d is " +d);
        System.out.println("string is " +str);
        System.out.println("character is " +c);
        sc.close();
    }
}
