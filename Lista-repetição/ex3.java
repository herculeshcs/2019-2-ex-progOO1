import java.util.Scanner;

public class ex3
{
        public static void main ( String [] args)
        {
            Scanner teclado = new Scanner(System.in);
            int n;
            n = teclado.nextInt();
            int pot = 1;            
            for(int i=0;i<n;i++)
            {
                   System.out.println(pot);
                   pot=pot*2;    
            }
        }
}
