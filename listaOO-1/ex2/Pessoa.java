public class Pessoa
{
    int idade;
    int diaNascimento;
    int mesNascimento;
    int anoNascimento;
    String nome;
    

      public Pessoa(int diaNascimento,int mesNascimento,int anoNascimento, String nome)
    {
        this.diaNascimento = diaNascimento;
        this.mesNascimento = mesNascimento;
        this.anoNascimento = anoNascimento;
        this.nome=nome;
    }


    public void calculaIdade(int dia, int mes, int ano)
    {
       int idade = ano - this.anoNascimento;
        
         if(mes < mesNascimento)
        {
              idade = idade-1;
        }
        else if( mes == mesNascimento)
        {
            if(dia < diaNascimento)
            {
                idade = idade-1;
            }
        }
       this.idade = idade;
    }
    public int informaIdade()
    {
        return idade;
    }
    public String informaNome()
    {
        return nome;
    }
  
 
}
