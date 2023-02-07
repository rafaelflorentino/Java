package ExercicioInterface;

public class AnimalA implements SerVivo{ 
    public AnimalA(){}

    public void mover(){}
    public void comer(int massa){}
    public void info(){
        System.out.println("--------------------------");
        System.out.println("--------------------------");
        System.out.printf("Tipo..: %s%n",getClass().toString());
        System.out.printf("OBS: Animal Generico %n");
        System.out.printf("Herda: SerVivo %n");
        System.out.printf("Vivo: %s %n",vivo ? "Sim" : "Nao");
        System.out.printf("--------------------------%n");
    }
    
}
