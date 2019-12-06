public class Funcionario{
    
        String cpf;
        String nome;
        int dia;
        int mes;
        int ano;
        Setor s;

        
        void printInfo()
        {
            System.out.println(cpf); 
            System.out.println(nome); 
            System.out.println(dia+"/"+mes+"/"+ano); 
            s.printNome();                           
        }
}
