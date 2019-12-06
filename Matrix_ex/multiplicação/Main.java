
import  java.util.Scanner;
public class Main {

    public static void main (String args[])
    {
        Scanner t = new Scanner(System.in);

        int n= t.nextInt();
        int[][] A = new int[n][n];
        int [][] B = new int[n][n];

        for (int i=0;i<n;i++) {
            for (int j = 0; j < n; j++) {
                A[i][j] = t.nextInt();
            }
        }
        for (int i=0;i<n;i++) {
            for (int j = 0; j < n; j++) {
                B[i][j] = t.nextInt();
            }
        }

        int [][] c = new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j =0;j<n;j++)
            {
                for(int k =0;k<n;k++)
                {
                    c[i][j] +=  A[i][k]*B[k][j];
                }
            }
        }

        for (int i=0;i<n;i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%d ", c[i][j]);
            }
            System.out.println();
        }

    }
}
