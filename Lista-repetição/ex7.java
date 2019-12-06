import java.util.Scanner;

public class ex7
{
        public static void main ( String [] args)
        {
            Scanner teclado = new Scanner(System.in);
            int n;
            int somaPar =0;
            int somaImpar =0;
            n = teclado.nextInt();
            for(int i =0;i<n;i++)
            {
                int numero = teclado.nextInt();
                if(numero%2==0)
                {
                    somaPar = somaPar+numero;
                }2
                else
                {
                    somaImpar= somaImpar+numero;
                }
            }
            System.out.println("soma dos pares= "+somaPar);
            System.out.println("soma dos impares =" +somaImpar);
            
        }
}
