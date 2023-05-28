import java.util.*;
public class Pattern2
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int n = sc.nextInt();
        System.out.println("Enter the number of colums:");
        int m = sc.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(i==0 || i==n || j==0 || j==n)
                {
                    System.out.print("*");                                
                }
            }
            System.out.println("");                
        }
    }
}