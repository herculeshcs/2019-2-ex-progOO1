import java.util.Scanner;

public class ex18
{
        public static void main ( String [] args)
        {
            Scanner teclado = new Scanner(System.in);
            int n = teclado.nextInt();
            int a=1;
            int b=2;
            int c=3;
            int mult = a*b*c;
          
            while(mult<n)
            {
              a++;
              b++;
              c++;
              mult = a*b*c;
            }
           if(mult==n)
            {
               System.out.printf("triangular %d * %d * %d = %d\n",a,b,c,mult);
            }
          else
            {
                    System.out.printf("não é triangular \n");
            }
          }
}

