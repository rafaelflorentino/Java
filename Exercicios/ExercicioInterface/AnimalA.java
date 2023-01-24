package ExercicioInterface;

public class AnimalA implements SerVivo{ 
    public AnimalA(){}

    public void mover(){}
    public void comer(int massa){}
    public void info(){
        //System.out.printf("%s", this.vivo ? "Sim" : "Nao");// busca vivo em uma interface
        System.out.printf("Animal A");
    }
    
}
