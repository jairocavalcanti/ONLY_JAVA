package TRY_CATCH.Pratico2;

public class Source {

    String nome1;
    String nome2;
   
   
    public Source(String nome1, String nome2) {
     
         if(nome1.length() < nome2.length()){
           throw new RuntimeException("nome 1 menor que nome 2");
          
        }else if(nome2.length() < nome1.length()){
            throw new RuntimeException("nome 2 menor que nome 1");
        }
      
        this.nome1 = nome1;
        this.nome2 = nome2;
    
   
    }

    public int met(){
        return nome1.length() + nome2.length();
    }
    

    
}
