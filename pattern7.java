package programs;

public class pattern7 {
    public static void main(String[] args) 
    {
        int row =5;
        for(int i=1;i<=row;i++)
            {
                for(int k=1;k<=(row-i);k++){
                    System.out.print(" ");
                }
                for(int j=1;j<=2*i-1;j++){
                    System.out.print("j");
                }
                System.out.println();
            }
        
        for(int i=1;i<=row;i++)
            {
                for(int k=1;k<=(i);k++){
                    System.out.print(" ");
                }
                for(int j=1;j<=(11-2*i);j++){
                    System.out.print("j");
                }
                System.out.println();
            }
            
    }
}

