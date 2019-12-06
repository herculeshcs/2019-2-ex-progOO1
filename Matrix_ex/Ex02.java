import java.util.Scanner;
public class Ex02{
  
    public static void main ( String args[])
    {
        int n,m;
        Scanner t = new Scanner (System.in);
        boolean cNula=true;
        boolean lNula=true;
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
        
        //int nula =0;
        for(int i=0;i<n;i++)
        {
            // verificando se a linha i é nula

            int nula;
            nula=0;
            for(int j=0;j<m;j++)
            {
                if(matriz[i][j]!=0)
                {
                    if(matriz[i][j] == 1)
                       {
                            nula++;
                       }
                   
                  
                }
            }
            if(nula!=1)
            {
               lNula=false; 
            }
            
        }
        
        System.out.println("linhas Nulas = "+lNula);

         for(int i=0;i<n;i++)
        {
            // verificando se a linha i é nula

           int nula;
            nula=0;
            for(int j=0;j<m;j++)
            {
                if(matriz[j][i]!=0)
                {
                    if(matriz[j][i] == 1)
                       {
                            nula++;
                       }
                }
            }
            if(nula!=1)
            {
                cNula=false; 
            }
           
        }
        System.out.println("colunas Nulas = "+cNula);
        
        if(cNula && lNula)
        {
            System.out.println("matriz de permutação");
        }
        else
        {
            System.out.println("não é matriz de permutação");
        }

        
        
        
    }
}
