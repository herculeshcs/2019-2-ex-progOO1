import java.util.Scanner;

public class ex14
{
        public static void main ( String [] args)
        {
            Scanner teclado = new Scanner(System.in);
            int d = teclado.nextInt();
            int n = teclado.nextInt();
            int auxn=n;
            int frequencia=0;
            while(n>0)
            {
               int digito= n%10;
                if(digito ==d)
                {
                       frequencia++;
                }
                n=n/10;
            }
            System.out.printf(" %d aparece %d vezes em %d\n",d,auxn,frequencia);
        }
}
