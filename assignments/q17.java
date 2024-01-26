package programs.assignments;

import java.util.Scanner;

public class q17 {
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of rows");
        int n=sc.nextInt();
        int i,j,k;
        for(i=1;i<=n;i++)
        {
            for(k=1;k<=(n+1)-i;k++)
            {
                System.out.print("  ");
            }
            for(j=5;j>=(n+1)-i;j--)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }  
}
