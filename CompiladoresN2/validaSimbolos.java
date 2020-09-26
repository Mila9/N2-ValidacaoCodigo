import java.util.HashMap;
import java.util.Stack;

public class validaSimbolos {
    public static boolean verificaSimboloBalanceado(String expressao){
        HashMap<Character,Character> mapeia=new HashMap<Character,Character>(); //mapeia a string digitada
        mapeia.put(')','(');
        mapeia.put(']','[');
        mapeia.put('}','{');
        mapeia.put('>','<');
        Stack<Character> pilha= new Stack<Character>(); //validação por pilha
        
        for(int i=0;i<expressao.length();i++){
            char simbolo= expressao.charAt(i);
            if(mapeia.containsKey(simbolo)){
                if(pilha.empty()||pilha.pop()!=mapeia.get(simbolo)) return false;
            }
            else
                pilha.push(simbolo);
        }
        return pilha.empty();
        //valida a string a partir dos chars e o map feito pelo hashmap
    }
}