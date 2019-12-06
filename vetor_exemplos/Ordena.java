import java.util.Scanner;

public class Ordena
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
            ordena(vetor,n);
               for(int i =0;i<n;i++)
            {
                System.out.printf("%d ",vetor[i]);
            }
            System.out.printf("\n");
        }
        // troca os elementos da posição a e b
        /* EX: seja v = {1,2,3} e a = 0 e b =2
         *   depois do método v = {3,2,1}
        */
        public static void troca (int [] v, int a, int b)
        {
            int aux= v[a];
            v[a]=v[b];
            v[b]=aux;
        }
        /* devolve o indice do maior elemento de v, onde n é o tamano de v
         * Ex  v = {1,2,3,4} n =2
         * valor retornado é 2, já que 3 é o maior elemento de v com n=2
        */        
        public static int achaMaior(int []v, int n)
        {
            int maior=v[0];
            int maiorI=0;
           
            for(int i=0;i<n;i++)
            {
                if(v[i]>maior)
                {
                    maior =v[i];
                    maiorI=i;
                }
            }
        return maiorI;
        }
        public static void  ordena(int v[], int n)
        {
            for(int i=0;i<n;i++)
            {
                int maiorI = achaMaior(v,n-i);
                troca(v,maiorI,n-i-1);
            }
        }
}
