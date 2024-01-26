package programs.assignments;
import java.util.Scanner;
public class q12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of rows");
        int n=sc.nextInt();
        int i,j;
        for(i=n;i>=1;i--)
           {
            
            for(j=i;j>=1;j--)
              {
                System.out.print(j+" ");
              }
            
              System.out.println();
        }
    }
}