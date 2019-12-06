import java.util.Scanner;
// busca linear
public class ex2
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
            int buscado = teclado.nextInt();
            boolean achou = false;
            int lugar =-1;
              for(int i =0;i<n;i++)
            {
                if(vetor[i]==buscado)
                     {
                      achou=true;
                        lugar = i;
                      i=n;
                       
                     }
                    
            }
            if(achou)
            {
                System.out.printf("achou em %d \n",lugar);
            }
            else
            {
                System.out.printf("não achou \n");
            }
        }
}
