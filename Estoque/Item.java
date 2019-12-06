

public class Item {

    private double preco;
    private String nome;
    private  int id;

    public  Item (String nome, double preco)
    {
        this.nome=nome;
        this.preco = preco;
    }
    public double getPreco() {
        return preco;
    }
    public String getNome()
    {
        return  nome;
    }
    public int getId()
    {
        return  id;
    }

    public void setPreco( Double preco)
    {
        if(preco<0)
        {
            this.preco=0.01;
        }
        else {
            this.preco = preco;
        }
    }
    public  void  setNome( String nome)
    {
        this.nome = nome;
    }
    public  void setId(int id)
    {
        this.id = id;
    }
    public boolean compara (Item p)
    {
        String nome2 = p.getNome();
        if((p.getPreco() == this.preco)&& nome2.equals(this.nome))
        {
          return  true;
        }
        return  false;
    }
    public  void print()
    {
        System.out.println("imprimindo item de id :"+this.id);
        System.out.println("nome :"+this.nome);
        System.out.println("preco :"+this.preco);
    }
}
