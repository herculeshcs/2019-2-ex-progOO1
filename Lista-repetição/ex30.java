import java.util.Scanner;

public class ex30
{
        public static void main ( String [] args)
        {
            Scanner teclado = new Scanner(System.in);
       
          
            int n = teclado.nextInt();
            int r;
            int exp=0;
            int num=0;        
            while(n>0)
            {
                 r = n%10;
                 num+=r*myPow(2,exp);  
                 exp++;
                 n=n/10;
                
            }
        
        System.out.println(num);
      
            
        }
        
        public static int myPow(int a, int b)
        {
            int num=1;
            if(b==0)
                return 1;
            for(int i=0;i<b;i++)
            {
                num=num*a;
            }
           return num;
        }
 
 
}
