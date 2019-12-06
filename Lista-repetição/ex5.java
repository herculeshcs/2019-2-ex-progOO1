import java.util.Scanner;

public class ex5
{
        public static void main ( String [] args)
        {
            Scanner teclado = new Scanner(System.in);
            int n;
            int soma =0;
            n = teclado.nextInt();
            for(int i =0;i<n;i++)
            {
                int numero = teclado.nextInt();
                soma = soma + numero;
            }
            System.out.println("soma = "+soma);
            
        }
}
