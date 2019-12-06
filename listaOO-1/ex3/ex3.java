import java.util.Scanner;

public class ex3
{
        public static void main ( String [] args)
        {
           Pessoa albert = new Pessoa(15,3,1879,"Albert  Einstein");
           Pessoa issac = new Pessoa(4,1,1643,"Issac Newton");
           Universidade princeton = new Universidade();
           Universidade cambridge = new Universidade();
            
           princeton.nome = "Princeton";
           cambridge.nome = "Cambrigde";
        
            issac.universidade = cambridge;
            albert.universidade =princeton;
        
        
           //albert.nome = "Albert Einstein";
          // issac.nome ="Issac Newton";
           
            //albert.ajustarDataNascimento(15,3,1879);
           /// issac.ajustarDataNascimento(4,1,1643);
            
            albert.calculaIdade(6,9,2019);
            issac.calculaIdade(6,9,2019);
            albert.printInfo();
            System.out.println(albert.idade);
            System.out.println();
            issac.printInfo();            
            System.out.println(issac.idade);
        }
}
