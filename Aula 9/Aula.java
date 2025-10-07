

public class HelloWorld {

     public int abs_if_else(int valor){
           if (valor < 0) {
            return -valor;
           } else {
            return valor;
           }
        }


     public int abs_ternario(int valor){
      return (valor < 0) ? -valor : valor; 

    }
    
    public int abs_somatorio_for(int valor){
        int soma = 0;
        for (int i = 0; i <= valor; i++) {
            soma += i;
        }
        return soma;
    }

    public int abs_somatorio_while(int valor){
        int soma = 0;
        int i = 0;
        while (i <= valor){
            soma += i;
            i += 1;
        }
    return soma;
    }

    public int somatorio_do_while(int valor){
        int soma = 0;
        int i = 0; 
    }
    
    
    
    
    
