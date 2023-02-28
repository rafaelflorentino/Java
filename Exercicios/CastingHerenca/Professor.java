package CastingHerenca;

public class Professor extends Pessoa {
    public Professor(String nome, String cpf) {
        super(nome, cpf);
    }

    public double salario;
    public String disciplina;
}