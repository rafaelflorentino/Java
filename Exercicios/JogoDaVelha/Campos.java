package JogoDaVelha;

public class Campos {
    private char simbolo;
    
    public Campos(){
        this.simbolo= ' ';
    }
    public char getSimbolo(){
        return this.simbolo;
    }
    public void setSimbolo(char simbolo){
        if(this.simbolo==' '){
            this.simbolo = simbolo;
        }else{
            System.out.print("Campo ja usado");
        }
    }
}
