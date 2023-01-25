package ExercicioInterface;

public class Aranha extends Animal{
    private int veneno;
    public Aranha(int vel, int massa, int forca, int veneno){
        super(vel,massa,forca);
        this.veneno=veneno;
    }
        public void info(){
        System.out.println("--------------------------");
        System.out.printf("Tipo..: %s%n",getClass().toString());
        System.out.printf("Vivo..: %s%n",this.getVivo() ? "Sim" : "Nao");
        System.out.printf("Massa.: %s%n",this.getMassa());
        System.out.printf("Veneno.: %d%n",this.veneno);
        System.out.printf("Forca.: %s%n",this.getForca());
        System.out.println("--------------------------");
    }; 

    @Override 
    public void atacar(Animal a){ // Override sobrescre a classe atacar de animal, pela atacar de aranha
        if(this.getVivo()){
            if((this.getForca() + this.veneno) <= a.getForca()){
                this.setVivo(false);
            } 
            if((this.getForca() + this.veneno) > a.getForca()){
                a.setVivo(false);
            }
        }else{
          System.out.println("--------------------------");
          System.out.println("\nEste Animal esta morto");
          System.out.println("--------------------------");
        }
      }
}
