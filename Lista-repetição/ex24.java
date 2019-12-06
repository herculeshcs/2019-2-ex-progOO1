import java.util.Scanner;

public class ex24
{
        public static void main ( String [] args)
        {
            Scanner teclado = new Scanner(System.in);
            int n;
            int somaPrimos =0;
          
            n = teclado.nextInt();
            for(int i =0;i<n;i++)
            {
                int numero = teclado.nextInt();
                if(eprimo(numero))
                {
                    somaPrimos = somaPrimos+numero;
                }
           
            }
            System.out.println("soma dos primos= "+somaPrimos);
      
            
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
