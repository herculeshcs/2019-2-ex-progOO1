public class Estoque {

    Vetor itens;
    public  Estoque (int n)
    {
        itens = new Vetor(n);
    }
    public void inserir (Item a)
    {
        itens.add(a);
    }
    public void inserir (String nome, double preco)
    {
        Item c = new Item(nome, preco);
        inserir(a);
    }
    public Item find( String nome)
    {
        int s = itens.findNome(nome);
        if(s!=-1)
        {
            return itens.v[s];
        }
        return null;
     }
     public void sort ()
    {
        for(int i=0;i< itens.total;i++)
        {
            for(int j=0;j<itens.total;j++)
            {
                String a;
                String b;
                a= itens.v[i].getNome();
                b= itens.v[j].getNome();
                if(a.compareTo(b)>0)
                {
                    Item aux = itens.v[i];
                    itens.v[i]=itens.v[j];
                    itens.v[j]=aux;
                }
            }
        }
     }

    public  void remove (Item a)
    {
        itens.remove(a);
    }
}
