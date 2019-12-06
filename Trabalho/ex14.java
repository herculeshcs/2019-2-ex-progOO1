import java.util.Scanner;
public class ex14{
   public static void main (String args [])
    {
        Scanner t = new Scanner(System.in);
        int n = t.nextInt();
        int[][] m = new int[n][n];
        int s = t.nextInt();
        for(int i=0;i<n;i++)
        {
            m[i][i]=1;
        }
        // dois inteiros a b onde isso indica uma estrada que sai de a e chega em b.
        /*
        *4// numero de cidades  
        *4// numero de estradas
        * 0 1
        * 1 2
        * 2 3
        * 3 4
        */
        for(int i=0;i<s;i++)
        {
            int a,b;
            a = t.nextInt();
            b = t.nextInt();
            m[a][b]=1;
        }
    }

}
