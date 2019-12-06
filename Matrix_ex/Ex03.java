import java.util.Scanner;
public class Ex03{
  
    public static void main ( String args[])
    {
        int n,m;
        Scanner t = new Scanner (System.in);
        boolean pLinha=true;
        boolean pColuna=true;
        boolean pDiagonal= true; 
 
        int sLinha=0;
        int sColuna=0;
        int sDiagonal=0;
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
        int sumAnt =0;
        for(int i=0;i<n;i++)
        {
            int sum;    
            sum =0;
            // verificando se a linha i é nula
            for(int j=0;j<m;j++)
            {
              sum+=matriz[i][j];
            }
            if(i==0)
            {
                sumAnt = sum;
            }
            else
            {
                if(sumAnt !=sum)
                {
                        pLinha =false;
                }
            }
            sLinha = sum;
        }
        
        System.out.println("linhas  = "+pLinha);


        for(int i=0;i<n;i++)
        {
            int sum;    
            sum =0;
            // verificando se a linha i é nula
            for(int j=0;j<m;j++)
            {
              sum+=matriz[j][i];
            }
            if(i==0)
            {
                sumAnt = sum;
            }
            else
            {
                if(sumAnt !=sum)
                {
                        pColuna =false;
                }
            }
            sColuna = sum;
        }
        
        System.out.println("coluna  = "+pColuna);
        sumAnt =0;
          int sum=0;
            int sumSecundaria =0;  
         for(int i=0;i<n;i++)
        {
            
           // sum =0;
            // verificando se a linha i é nula
            for(int j=0;j<m;j++)
            {
              if( i == j)
               {
                sum+=matriz[i][j];
               }
              if(i+j==n-1)
              {
                sumSecundaria+=matriz[i][j];
              } 
            
            }
        }
         if(sum != sumSecundaria)
         {
                pDiagonal =false;
         }
         sDiagonal = sum;
         System.out.println("diagonais = "+pDiagonal);
        
        if((pLinha && pColuna) && pDiagonal)
        {
            if((sDiagonal == sLinha) && (sLinha == sColuna))
            {
                System.out.println("quadrado magico");
            }
         
        }
        else
        {
           System.out.println("não é quadrado magico");
        }
        
        
    }
}
