
package fazendinha;

/**
 *
 * @author Orlando
 */
public class Cavalo {
    String porte;
    String raça;
    String genero;
    float peso;
    String cor;
    float idade;
    boolean corrida;
    boolean premiado;
    void status() {
        System.out.println("porte:"+ this.porte);
        System.out.println("raça:"+this.raça);
        System.out.println("peso:" + this.peso);
        System.out.println("cor:"+ this.cor);
        System.out.println("idade:"+ this.idade);
        System.out.println("e de corrida?"+ this.corrida);
        System.out.println("ja foi premiado?"+ this.premiado);
        
}

    void cavalo_caro(){
      if (this.premiado== true)  {
          System.out.println("Este cavalo é caro!");
                  } else {
          System.out.println("O cavalo não é caro!");
        } 
    }
    
       void rapidez () {
           if(this.corrida== true)
              System.out.println("este cavalo é veloz");
              else 
              System.out.println("o cavalo não é veloz");
       }
       }

       


