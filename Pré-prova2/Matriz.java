public class Matriz
{
    int [][] matriz;
    int n,m;    
    public Matriz (int n, int m)
    {
        this.matriz = new int[n][m];
        this.n=n;
        this.m=m;
    }
    public int leitura(int a, int b)
    {
        return matriz[a][b];
    }
    public void escrever(int a, int b, int c)
    {
        matriz[a][b]=c;
    }

    public Matriz mul(Matriz a, Matriz b)
    {
        Matriz c = new Matriz(a.n,a.n);
        for(int i =0;i<a.n;i++)
        {
            for(int j=0;j<a.n;j++)
            {
                for(int k=0;k<a.n;k++)
                {
                c.matriz[i][j]+= a.matriz[i][k]*b.matriz[k][j];
                }
            }
        }
        return c;
    }
    public Matriz trans( Matriz a)
    {
        Matriz c = new Matriz(a.m,a.n);
        for(int i =0;i<a.n;i++)
        {
            for(int j =0;j<a.m;j++)
            {
                c.matriz[j][i]=a.matriz[i][j];
            }            
        
        }
        return c;
    }
}
