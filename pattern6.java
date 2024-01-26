package programs;
import java.util.Scanner;
public class pattern6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of rows");
        int n=sc.nextInt();
        int i,j,k;
        for(i=1;i<=n;i++)
        {
            for(k=1;k<=i;k++)
            {
                System.out.print("  ");
            }

            for(j=1;j<=(n+1)-i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
