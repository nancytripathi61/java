package programs.assignments;
import java.util.Scanner;
public class q2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of rows");
        int n= sc.nextInt();
        int i,j;
    for(i=1;i<=n;i++)
    {
        System.out.print("  ");

    for(j=1;j<=n;j++)
    {
        System.out.print(i+"  ");
    }
    System.out.println();
   
    }
 }
}