import java.util.Scanner;

public class ex19
{
        public static void main ( String [] args)
        {
            Scanner teclado = new Scanner(System.in);
            int n;
            int somaPrimos =0;
          
            int a = teclado.nextInt();
            int b = teclado.nextInt();
            int r; 
            while(b!=0)
            {   
                r = a%b;
                a=b;
                b=r;
            }            
            
            System.out.println(a);
      
            
        }
        public static int  mdc(int a,int b)
        {
               if(b == 0)
                return a;

            return mdc(b, a%b);
        } 
}
