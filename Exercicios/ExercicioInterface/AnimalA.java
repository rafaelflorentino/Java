package ExercicioInterface;

public class AnimalA implements SerVivo{ 
    public AnimalA(){}

    public void mover(){}
    public void comer(int massa){}
    public void info(){
        //System.out.printf("%s", this.vivo ? "Sim" : "Nao");// busca vivo em uma interface
        System.out.println("--------------------------");
        System.out.println("--------------------------");
        System.out.printf("Tipo..: %s%n",getClass().toString());
        System.out.printf("OBS: Animal Generico %n");
        System.out.printf("Herda: SerVivo %n");
        System.out.printf("Vivo: %s %n",this.vivo ? "Sim" : "Nao");
        System.out.printf("--------------------------%n");
    }
    
}
