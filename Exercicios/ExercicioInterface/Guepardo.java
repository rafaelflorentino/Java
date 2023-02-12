package ExercicioInterface;

public class Guepardo extends Animal{

    public Guepardo(int vel, int massa, int forca, int y, int x) {
        super(vel, massa, forca, y, x);
    }
    public void mover(){
        System.out.println("Correu Muito Rapido, por 20 segundos.");
    }
    
    
}
