import java.util.Scanner;

public class main{
    public static void main(String []args){
        try{
            validaSimbolos valida= new validaSimbolos();
            Scanner s = new Scanner(System.in);
            String leitura= " ";
            System.out.println("Digite as palavras com ()[]{}<>");
            System.out.println("escreva sair para terminar o programa");
            
            while(leitura!="sair"){
                leitura = s.next();
                
                if(valida.verificaSimboloBalanceado(leitura.trim())){
                    System.out.println(leitura + " OK - Válido");
                }
                else{
                    System.out.println(leitura + " Não - Inválido");
                }
            }
        }
        catch(Exception erro){
            System.out.println("Erro: "+ erro.getMessage());
        }
    }
}