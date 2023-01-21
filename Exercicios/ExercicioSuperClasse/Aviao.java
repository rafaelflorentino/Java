package ExercicioSuperClasse;
//import veiculos.*; //importa todos os pacotes da classe veiculos
//import veiculos.veiculo; //importa só a classe veiculo

public class Aviao extends Veiculo{
    private int categoria;

    public Aviao(String nome, int categoria){
        super(nome,10);// Chama o construtor da classe pai
        this.categoria=categoria;
    }
    
    public void info(){ //metodo com mesmo nome da claase pai
        super.info(); // Chama o info da da casse pai, sem SuperInfo(), só ia aparecer categoria desse metodo info
        System.out.printf("Categoria: %d \n", this.categoria);
        System.out.printf("Nome: %s \n", getNome() );// getNome() e publico, já nome e private this.nome não aceesa
        System.out.printf("Marca: %s \n", this.marca);//marca e do tipo Protected permite o acesso por classe aviao     
    }
}
