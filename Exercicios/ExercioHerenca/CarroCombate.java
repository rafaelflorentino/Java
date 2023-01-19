package ExercioHerenca;

public class CarroCombate extends Carro{ // Herda da classe pai: Carro
    private final int Max_Armamento=100;
    private final int Min_Armamento=0;
    private int qtdeArmamento;

    public CarroCombate(String nome,int blindagem){
        super(nome); // Chama o construtor da classe pai e paasa o valor que o pai pede para instanciar um novo carro
        setArmamento(true); // Não é necessário usar a classe super pois já herdam tudo da classe pai 
        super.setBlindagem(blindagem);//super opcional
        this.qtdeArmamento=100;   
    }

    public void setQtdeArmamento(int qtdeArmamento) {
        this.qtdeArmamento += qtdeArmamento;
        // Validando a entrada de armamento
        if(this.qtdeArmamento > Max_Armamento){
            this.qtdeArmamento=Max_Armamento;
        }
        if(this.qtdeArmamento < Min_Armamento){
            this.qtdeArmamento=Min_Armamento;
        }
    }

    public int getQtdeArmamento() {
        return this.qtdeArmamento;
    }

    public void atirar(){
        if(this.qtdeArmamento> Min_Armamento){
            setQtdeArmamento(-1);
        }else{
            System.out.println("Sem Municao");
        }
    }

    public void info(){
        super.info();
        System.out.printf("Qtde.Arm....: %d%n", this.qtdeArmamento);
    }
    
}
