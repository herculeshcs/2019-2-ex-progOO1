import java.util.Scanner;

public class ex3
{
        public static void main ( String [] args)
        {
           Setor s1 = new Setor();
           Setor s2 = new Setor();
           
           s1.nome = "setor1";
           s2.nome = "setor2";
           Funcionario f1 = new Funcionario();
           Funcionario f2 = new Funcionario();
           
           f1.nome = "joao";
           f1.cpf= "0190101";
           f1.dia = 10;
           f1.mes = 6;
           f1.ano = 1900;

           f2.cpf="9121029";
           f2.nome="maria";
           f2.dia= 10;
           f2.mes=9;
           f2.ano=2910;
            
 
           f1.s=s1;
           f2.s=s2;
           
           f1.printInfo();
           f2.printInfo();
            
        }
}
