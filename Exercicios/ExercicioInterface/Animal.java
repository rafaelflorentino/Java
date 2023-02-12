package ExercicioInterface;

abstract class Animal implements SerVivo{ // Classe abstrata não pode ser instanciada, só pode ser herdada

    private Boolean vivo;
    private int massa;
    private int x=0;
    private int y=0;
    private int vel;
    private int forca;

    public Animal(int vel, int massa, int forca){
        this.vivo=true;
        this.massa=massa;
        this.x=0;
        this.y=0;
        this.forca=forca;
        this.vel=vel;
    }
    public Animal(int vel, int massa, int forca, int x, int y){
        this.vivo=true;
        this.massa=massa;
        this.x=0;
        this.y=0;
        this.forca=forca;
        this.vel=vel;
    }
    public void setVivo(Boolean vivo){
        this.vivo=vivo;
    }
    public Boolean getVivo(){
        return this.vivo;
    }

    public void setForca(int forca){
        this.forca=forca;
    }
    public int getForca(){
        return this.forca;
    }

    public void setMassa(int massa){
        if(this.massa <= 0){
            this.massa=massa;
        }else{
            this.massa+=massa;
        }  
    }
    public int getMassa(){
        return this.massa;
    }
    public void atacar(Animal a){
      if(this.vivo){
            if(this.forca > a.forca){
                //this.forca+=a.getMassa();
                a.vivo=true;
            }else{
                this.vivo=false;
            }
      }else{
        System.out.println("--------------------------");
        System.out.println("\n"+this.getClass().toGenericString() + " Esta morto(a) nao pode atacar");
        System.out.println("--------------------------");
      }
    };
    public void mover(){
        if(this.vivo){
            this.x+=this.vel;
            this.y+=this.vel;
        }else{
            System.out.println("--------------------------");
            System.out.println("\n"+this.getClass().toGenericString() + " Esta morto(a) nao pode Mover");
            System.out.println("--------------------------");
          }
        
    };
    public int moverDirecao(int direita, int esquerda){
        this.x=direita;
        this.y=esquerda;
        System.out.println("Moveu para Direita: "+direita+" Metros");
        System.out.println("Moveu para Esquerda: "+esquerda+" Metros");
        return this.x + this.y;
    }

    public void comer(int massa){
        if(this.vivo){
            this.forca+=massa;
            this.setMassa(massa);
            //setMassa(massa);
            
        }else{
            System.out.println("--------------------------");
            System.out.println("\n"+this.getClass().toGenericString() + " Esta morto(a) nao pode Comer");
            System.out.println("--------------------------");
          }
    };
    public void comer(Vegetal v1){
        if(this.vivo){
            this.forca+=v1.getMassa();
            this.massa+=v1.getMassa();
            System.out.println("\n Massa do vejetal: "+v1.getMassa());
            v1.setVivo(false);
        }else{
            System.out.println("--------------------------");
            System.out.println("\n"+this.getClass().toGenericString() + " Esta morto(a) nao pode Comer");
            System.out.println("--------------------------");
          }
    };
    public void info(){
        System.out.println("--------------------------");
        System.out.printf("Tipo..: %s%n",getClass().toString());
        System.out.printf("Vivo..: %s%n",this.getVivo() ? "Sim" : "Nao");
        System.out.printf("Massa.: %s%n",this.massa);
        System.out.printf("Vel...: %s%n",this.vel);
        System.out.printf("Forca.: %s%n",this.forca);
        System.out.println("--------------------------");
    };
   
}
