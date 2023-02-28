package CastingHerenca;

public class Pessoa {
    public String nome;
    public String cpf;

    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public void imprimeNome() {
        System.out.println(this.nome);
    }
}
