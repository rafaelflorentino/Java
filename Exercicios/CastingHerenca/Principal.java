/* 
  Objetivo: Crie um programa em java onde a classe aluno e professor herdem a classe pessoa.
  Entrada: Sem entrada.
  Saida: Resultado da pesquisa.
  Autor: Rafael Florentino.
*/
package CastingHerenca;

public class Principal {
    public static void main(String[] args) {
        Pessoa p = new Pessoa("João", "123456");
        Aluno a = new Aluno("Paulo", "5544");
        p.imprimeNome();
        a.imprimeNome();
        System.out.println(" ");

        // Usando Casting
        Aluno aluno = new Aluno("Paulo", "5544");
        aluno.matricula = "123456";
        Professor professor = new Professor("João", "7788");
        imprimeMatricula(aluno);
        System.out.println(" ");
        imprimeMatricula(professor);        
    }

    // Verifica se a pessoa é um aluno, verifica se instância de aluno
    public static void imprimeMatricula(Pessoa p) {
        if (p instanceof Aluno) {
            Aluno a = (Aluno) p; // Casting tranformar pessoa em aluno
            System.out.println("Matricula do Aluno: "+a.matricula+"\nNome do Aluno: "+ a.nome);
        } else {
            System.out.println("Não é aluno!");
        }
    }
}
