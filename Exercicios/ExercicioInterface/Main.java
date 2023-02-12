package ExercicioInterface;
//import java.io.Console;
public class Main {
    public static void main(String[] args) {
        AnimalA n1=new AnimalA();
        n1.info();

        Formiga f1= new Formiga(2, 2, 2);
        Sapo s1 = new Sapo(10, 10, 10);
        Aranha a1 = new Aranha(5, 5, 6, 3);
        Vegetal v1 = new Vegetal(1);

        // Formiga Come Vejetal
        f1.info();
        v1.info();
        f1.comer(v1);
        System.out.printf("\nFormiga esta: %s \n", (f1.getVivo() ? "Vivo(a)" : "Morto(a)"));
        System.out.printf("\nVejetal esta: %s \n", (v1.getVivo() ? "Vivo(a)" : "Morto(a)"));
        f1.info();
 
        // Aranha ataca Formiga
        a1.info();
        f1.info();
        a1.atacar(f1);
        System.out.printf("\nArranha esta: %s \n", (a1.getVivo() ? "Vivo(a)" : "Morto(a)"));
        System.out.printf("\nFormiga esta: %s \n", (f1.getVivo() ? "Vivo(a)" : "Morto(a)"));

        // Formiga não pode se mover porque esta morta
        f1.mover();        

        // Aranha come a formiga e soma a massa da formiga a sua força.
        a1.comer(f1.getMassa());
        a1.info();
  
        // Aranha ataca o sapo
        s1.info();
        a1.info();
        a1.atacar(s1);
        System.out.printf("\nSapo esta: %s \n", (s1.getVivo() ? "Vivo(a)" : "Morto(a)"));
        System.out.printf("\nAranha esta: %s \n", (a1.getVivo() ? "Vivo(a)" : "Morto(a)"));
        
        //Animal n2=new Animal();// Classe abstrata nao pode ser intanciada só pode ser herdada 


        Guepardo guepardo = new Guepardo(35, 40, 55, 30, 150);
        guepardo.mover();
        System.out.println("Guepardo andou no total: "+guepardo.moverDirecao(20,30)+" Metros.");

        

    } 
}
