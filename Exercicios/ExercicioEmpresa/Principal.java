/* 
  Objetivo: Crie um programa em java que calcule o salario do empregado e o salario do gerente, gerente sercebe alem do salário
  uma comissão.
  Entrada: Sem entrada.
  Saida: Salário do gerente e salário do funcionário.
  Autor: Rafael Florentino.
*/
package ExercicioEmpresa;
import javax.swing.JOptionPane;
public class Principal {
    public static void main(String[] args) {
		
		Empregado empregado = new Empregado();
		Gerente gerente = new Gerente();
		
		empregado.setNome(JOptionPane.showInputDialog("Informe o nome do empregado:"));
		empregado.setSalario(Float.parseFloat(JOptionPane.showInputDialog("Informe o salario do empregado:")));

		gerente.setNome(JOptionPane.showInputDialog("Informe o nome do Gerente:"));
		gerente.setSalario(Float.parseFloat(JOptionPane.showInputDialog("Informe o salario do Gerete:")));
		gerente.setComissao(Float.parseFloat(JOptionPane.showInputDialog("Informe a comissao do Gerete:")));
		
		System.out.println("\nO nome do empregado = "+empregado.getNome());
		System.out.println("O salario do empregado = "+empregado.getSalario());
		
		System.out.println("\nO nome do gerente = "+gerente.getNome());
		System.out.println("O salario do gerente = "+gerente.getSalario());
		
	}
}
