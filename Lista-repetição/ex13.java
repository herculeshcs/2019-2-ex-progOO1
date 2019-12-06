import java.io.IOException;
import java.util.Scanner;
import java.util.stream.StreamSupport;

public class ex13 {

    public static void main(String[] args) throws IOException {

        Scanner entrada = new Scanner(System.in);
        int n = entrada.nextInt();
        boolean cres =true;
        int ant, prox;
        ant = entrada.nextInt();
        for(int i =0;i<n-1;i++)
        {
            prox = entrada.nextInt();
            if(ant>prox)
            {
                cres=false;
                i=n;
            }
            ant = prox;
        }

        if(cres)
        {
            System.out.println("é crescente");
        }
        else
        {
            System.out.println("não é crescente");
        }


        //
        // System.out.println(sum);
    }




}