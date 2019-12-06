

public class Vetor{

    public Item v[];
    public int n;
    public  int total;
    public static int h;
    public Vetor( int n)
    {
        v = new Item[n];
        this.n = n;
        total=0;
    }
    public int find(Item buscado)
    {
        for(int i =0;i<total;i++)
        {
            if(v[i].compara(buscado))
            {
                return i;
            }
        }
        return -1;

    }
    public void replace (Item buscado, Item substituto)
    {
        int pos = find(buscado);
        if(pos!=-1)
        {
            v[pos]=substituto;
        }
    }
    public void replaceAll(Item buscado, Item substituto)
    {
        if(buscado == substituto)
            return;

        int pos= find(buscado);
        while(pos != -1)
        {
            v[pos]=substituto;
            pos = find(substituto);
        }

    }
    public void swap (int a,int b)
    {
        Item aux = v[a];
        v[a]=v[b];
        v[b]=aux;
    }
    public void invert ()
    {
        for(int i=0,j=total-1;i<j;j--,i++)
        {
            swap(i,j);
        }
    }

    public void invert2()
    {

        Item v2[] = new Item[n];
        int j =0;
        for(int i=total-1;i>=0;i--)
        {
            v2[j]=v[i];
            j++;
        }
        v=v2;
    }

    public void print()
    {
        for(int i=0;i<total;i++)
        {
            v[i].print();
        }
        System.out.printf("\n");
    }
    public void  add (Item a)
    {
        if(total<n)
        {
            v[total]=a;
            total++;
        }
    }
    public  void  remove(Item a)
    {
        int pos = find(a);
        if(pos!=-1)
        {
            for(int i =pos;i<total;i++)
            {
                v[i]=v[i+1];
            }
        }
    }


}