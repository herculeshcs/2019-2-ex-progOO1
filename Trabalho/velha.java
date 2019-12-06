
import java.util.Scanner;

public class velha{
    public static void main(String []args)
    {
        Scanner t = new Scanner(System.in);
        // 0 - não prenchido
        // 1 jogador 1
        // 2 jogador 2
        int tab [][] = new int[3][3];  
        printTab(tab,3,3);
       int rodada =0; 
       while(status(tab,3,3)==0)
       {
              if(rodada%2==0)
              {
                int a,b;
                a=0;
                b=0;
                do{
                System.out.println("jogador 1 indique as coordenadas");
                   a = t.nextInt();
                   b = t.nextInt();
                    
                 } while(tab[a][b]!=0);
                   tab[a][b]=1;
               }
               else
               {
                    int a,b;
                a=0;
                b=0;
                do{
                System.out.println("jogador  2 indique as coordenadas");
                   a = t.nextInt();
                   b = t.nextInt();
                  }while(tab[a][b]!=0);
                   tab[a][b]=2;
                }
            rodada++; 
            System.out.println("rodada"+rodada);
            printTab(tab,3,3);
            
       }
        
  
    }
    public static void printTab(int [][]tab, int n, int m )
    {
        for(int i =0;i<n;i++)
        {
            for(int j=0;j<m;j++)
                {
                    System.out.printf("%d ",tab[i][j]);
                }
            System.out.println();
        }        
    }
    // 0 - se não acabou 
    // 1 - se jogador 1 ganhou
    // 2 - se jogadro 2 ganhou
    // 3 - se empatou
    public static int status(int tab[][],int n, int m)
    {
       if(testeJogador(tab,3,3,1))
       {
            System.out.println("jogador 1 ganhou");
            return 1;
       }
       if(testeJogador(tab,3,3,2))
       {
        System.out.println("jogador 2 ganhou");
            return 2;
       }
       for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(tab[i][j]==0)
                {
                    return 0;
                }
            }
        }
            System.out.println("Empate");
        return 3;
    }
    
    public static boolean testeJogador(int tab[][],int n,int m,int jogador)
    {
    //    boolean testeLinha=false;
        for(int i =0; i<n;i++)
         { 
            boolean teste;
            
               teste= true;
           // System.out.printf("verificando a linha %d\n",i);
           // System.out.println(teste);
            for(int j=0; j<m;j++)
              {
                
                 if(tab[i][j]!=jogador)
                 {
 
                        teste=false;
                  }
               } 
               //System.out.println(teste);
                if(teste)
                {
                    return true;
                }
                
         }

        for(int i =0; i<n;i++)
         { 
            boolean teste;
           teste= true;
            for(int j=0; j<m;j++)
              {
                 if(tab[j][i]!=jogador)
                 {
                        teste=false;
                  }
               } 
                if(teste)
                {
                    return true;
                }
                
         }
        
         if((tab[0][0]==jogador)&&(tab[1][1]==jogador)&&(tab[2][2]==jogador))
            {
        
                return true;
            }
         if((tab[0][2]==jogador)&&(tab[1][1]==jogador)&&(tab[2][0]==jogador))
        {   
            return true;
        }
        return false;      
    }
    

}
