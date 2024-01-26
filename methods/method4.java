// WITH PARAMETER WITH RETURN VALUE 

package programs.methods;

import java.util.Scanner;

public class method4 {
    static int add(int a,int b)
    {
        System.out.println("a is " +a);
        System.out.println("b is " +b);
        int c=a+b;
        return c;
        
    }
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int a=sc.nextInt();
       int b=sc.nextInt();
       int res = add(a,b);
       System.out.println("c is " +res);
       sc.close();
    }
}
