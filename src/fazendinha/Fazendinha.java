
package fazendinha;

/**
 *
 * @author Orlando
 */
public class Fazendinha {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Cavalo C1 = new Cavalo();
       C1.porte = "médio";
       C1.raça= "mangalarga";
       C1.genero= "masculino";
       C1.peso= 70;
       C1.cor= "marrom";
       C1.idade= 20;
       C1.corrida= true;
       C1.premiado=false;
       C1.status();
       C1.cavalo_caro();
       C1.rapidez();  
      
       
       
       Cavalo C2= new Cavalo();
       C2.porte= "grande";
       C2.raça= "Arabe";
       C2.genero= "feminino";
       C2.peso= 120;
       C2.cor= "preto";
       C2.idade= 22;
       C2.corrida = true;
       C2.premiado=true;
       
       
       C2.status();
       C2.cavalo_caro();
       C2.rapidez();        
        
    }
    
}
