package ExercicioSuperClasse;

public class Veiculo {
    private String nome;
    private int tipo;
    protected String marca ="Fiat"; // pode acessar classe dentro do mesmo pacote ou classes com extends a veiculo

    public Veiculo(String nome, int tipo){
        this.nome=nome;
        this.tipo=tipo;
    }

    public void info(){
        System.out.printf("Nome: %s \n", this.nome);
        System.out.printf("Tipo: %d \n", this.tipo);
    }

    public String getNome() {
        return this.nome;
    }
}
