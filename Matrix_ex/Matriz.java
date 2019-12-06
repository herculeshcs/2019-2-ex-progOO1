import java.util.Scanner;
public class Matriz{
  
    public static void main ( String args[])
    {
        int n,m;
        Scanner t = new Scanner (System.in);
        n= t.nextInt();
        m= t.nextInt();
        
        int matriz [][] = new int [n][m];        
        
        for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++)
                {
                    matriz[i][j]=t.nextInt();
                }
            }
       
         for(int i=0;i<n;i++)
            {
                for(int j=0;j<n;j++)
                {
                  System.out.printf("%d ", matriz[i][j]);
                }
                System.out.println();
            }
        
    }
}
