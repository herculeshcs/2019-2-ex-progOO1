import java.util.Scanner;

public class ex1
{
        public static void main ( String [] args)
        {
           Pessoa albert = new Pessoa();
           Pessoa issac = new Pessoa();
           
           albert.nome = "Albert Einstein";
           issac.nome ="Issac Newton";
           
            albert.ajustarDataNascimento(15,3,1879);
            issac.ajustarDataNascimento(4,1,1643);
            
            albert.calculaIdade(6,9,2019);
            issac.calculaIdade(6,9,2019);
            
            System.out.println(albert.idade);
            System.out.println(issac.idade);
        }
}
