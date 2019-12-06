import java.util.Scanner;

public class Ordena2
{
        public static void main ( String [] args)
        {
            Scanner teclado = new Scanner(System.in);
            int n;
            n = teclado.nextInt();
            int vetor[] =  new int [n];            
            for(int i =0;i<n;i++)
            {
                vetor[i]=teclado.nextInt();
            }

           for(int i =0;i<n;i++)
            {
                for(int j=0;j<n;j++)
                {
                    if(vetor[i]<vetor[j])
                    {
                        int aux = vetor[i];
                        vetor[i]=vetor[j];
                        vetor[j]=aux;
                    }
                }
            }
            for(int i =0;i<n;i++)
            {
                System.out.printf("%d ",vetor[i]);
            }
            System.out.printf("\n");
        }
}
