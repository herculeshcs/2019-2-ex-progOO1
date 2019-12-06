import java.util.Scanner;

public class nprimos
{
        public static void main ( String [] args)
        {
            Scanner teclado = new Scanner(System.in);
            int n;
            int somaPrimos =0;
          
            n = teclado.nextInt();
            int numero=0;
            
            for(int i =0;i<n;)
            {
                
                if(eprimo(numero))
                {
                    i++;
                    System.out.printf(" %d => %d\n", i,numero);
                }
                numero++;
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
