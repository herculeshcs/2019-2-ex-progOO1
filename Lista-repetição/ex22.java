import java.util.Scanner;

public class ex22
{
        public static void main ( String [] args)
        {
            Scanner teclado = new Scanner(System.in);
            int n = teclado.nextInt();
            for(int i=0;i<n;i++)
            {
                int soma;
                soma =0;
                int elemento;
                elemento=teclado.nextInt();                
                while(elemento!=0)
                {
                    if(elemento%2==0)
                    {
                    soma+=elemento;
                    }                    
                    elemento = teclado.nextInt();
                }
                System.out.printf("sequencia %d tem soma = %d\n",i,soma); 
            }
          
       }
}

