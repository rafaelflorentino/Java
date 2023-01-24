package ExercicioInterface;

public class Main {
    public static void main(String[] args) {
        AnimalA n1=new AnimalA();
        n1.info();

        Formiga f1= new Formiga(2, 2, 2);
        f1.info();

        Sapo s1 = new Sapo(10, 10, 10);
        s1.info();

        Aranha a1 = new Aranha(5, 5, 5, 3);
        a1.info();

        Vegetal v1 = new Vegetal(1);
        v1.info();
 
        //Animal n2=new Animal();// Classe abstrata nao pode ser intanciada só pode ser herdada 
    } 
}
