

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
    public  void remove (Item a)
    {
        itens.remove(a);
    }
}
