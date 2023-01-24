package ExercicioInterface;

public class Main {
    public static void main(String[] args) {
        AnimalA n1=new AnimalA();
        n1.info();

        //AnimalA n2=new AnimalA();// Classe abstrata nao pode ser intanciada só pode ser herdada
        Formiga a1 = new Formiga(); // Herda metodos de Animal2(clase estatica)
        
    }
    
}
