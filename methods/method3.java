// WITH PARAMETER WITHOUT RETURN VALUE 

package programs.methods;

import java.util.Scanner;

public class method3 {
    static void add(int a,int b)
    {
        System.out.println("a is " +a);
        System.out.println("b is " +b);
        int c=a+b;
        System.out.println("c is " +c);
    }
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int a=sc.nextInt();
       int b=sc.nextInt();
    //    add(a,b);
         add(b,a);
      sc.close();
    }
}
