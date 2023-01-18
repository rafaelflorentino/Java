package ExercicioJogadores;

public class Jogador{
    private final int maxVidas=3;
    public int num=0;
    private int vidas=0;
    static boolean alerta=false;
    static int qntJogadores=0;
    static int pontosJogadores=0;

    public Jogador(int num){// Método Construtor, mesmo nome da classe.
        this.num=num;
        this.setVidas(1);
        System.out.printf("%n jogador numero: %d criado.%n",num);
        qntJogadores++;
        pontosJogadores+=10;
    }

    public int getVidas(){
        return this.vidas;
    }

    private void setVidas(int vidas){
        if(vidas >= maxVidas){
            this.vidas = maxVidas;
        }else if(vidas < 0){
            this.vidas = 0;
        }else{
            this.vidas = vidas;
        }    
    }

    public void addVidas(){
        if(this.vidas < maxVidas){
            this.vidas++;
        }
    }

    public void LostVidas(){
        if(this.vidas <= 0){
            this.vidas=0;
            System.out.println("\nVidas = "+this.vidas+" Voce Morreu,");
        }else if(this.vidas >0){
            this.vidas--;
        }
    }

    static void pontos(){
        pontosJogadores+=10;
    }

    public void info(){
        System.out.printf("\nJogador: %d",this.num);
        System.out.printf("\nVidas: %d",this.vidas);
        System.out.printf("\nAlerta: %s",(alerta ? "Sim":"Nao"));
        System.out.printf("\nJogadores: %d",qntJogadores);
        System.out.printf("\nPontos: %d",pontosJogadores);
        System.out.printf("%n----------------------------------------");
    }
    
}
