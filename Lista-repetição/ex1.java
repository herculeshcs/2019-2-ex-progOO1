import java.util.Scanner;

public class ex1
{
        public static void main ( String [] args)
        {
            Scanner teclado = new Scanner(System.in);
            int n;
            n = teclado.nextInt();
            for(int i =0;i<n;i++)
            {
                System.out.println(2*i+1);
            }
        }
}
