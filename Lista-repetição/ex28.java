import java.util.Scanner;

public class ex28
{
        public static void main ( String [] args)
        {
            Scanner teclado = new Scanner(System.in);
       
          
            int n = teclado.nextInt();
            int primoAtual =2;
            int mult =0;
            while(n>1)
            {
                    mult=0;
                    while(n%primoAtual==0)
                    {
                        n=n/primoAtual;
                        mult++;
                    }      
                    System.out.printf("fator %d multiplicidade %d\n",primoAtual,mult);
                    primoAtual = proximoPrimo(primoAtual);
            }
      
            
        }
         public static int proximoPrimo(int primoAtual)
          {
            int i;
            i =primoAtual;
              while(true)
              {
                 i++;
                 if(eprimo(i))
                {
                       return i; 
                }
               
              }
           } 

        public static boolean eprimo(int n)
        {
                int div=0;
                 for(int i=1;i<n;i++)
                   {
                        if(n%i==0)
                        {
                            div++;                            
                        }
                    }    
                  if(div==1)
                    {
                        return true;
                    }
                return false;
        } 
}
