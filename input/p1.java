package programs.input;

 import java.util.Scanner;
public class p1 {
      public static void main(String[] args) 
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("enter the number in integer");
            int y = sc.nextInt();
           if((y%4==0)&& (y%400==0 || y%100!=0))
           {
            System.out.println("The Year is Leap Year");
           } 
           else{
            System.out.println("The Year is Not Leap Year");
           }
           sc.close();
        }
    }

