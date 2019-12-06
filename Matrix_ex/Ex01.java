import java.util.Scanner;
public class Ex01{
  
    public static void main ( String args[])
    {
        int n,m;
        Scanner t = new Scanner (System.in);
        int cNula=0;
        int lNula=0;
        n= t.nextInt();
        m= t.nextInt();
       
        int matriz [][] = new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                matriz[i][j] = t.nextInt();
            }
        }
        

        for(int i=0;i<n;i++)
        {
            // verificando se a linha i é nula

            boolean nula;
            nula=true;
            for(int j=0;j<m;j++)
            {
                if(matriz[i][j]!=0)
                {
                    nula=false;
                    j=m;
                }
            }
            if(nula)
            {
               lNula++; 
            }
           
        }
        
        System.out.println("linhas Nulas = "+lNula);

         for(int i=0;i<n;i++)
        {
            // verificando se a linha i é nula

            boolean nula;
            nula=true;
            for(int j=0;j<m;j++)
            {
                if(matriz[j][i]!=0)
                {
                    nula=false;
                    j=m;
                }
            }
            if(nula)
            {
               cNula++; 
            }
           
        }
        System.out.println("colunas Nulas = "+cNula);
        
        
        
        
    }
}
