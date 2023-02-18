package ExercicioVeiculos;

public class UsaVeiculos{
	public static void main(String[]args){
		Carro auto1 = new Carro();		// Cria 1 carro
		Camionete auto2 = new Camionete();	// Cria 1 camionete
		
		auto1.setVelocidade(120);
		auto1.setStatus(true);   // Metodo só de carro
	
		System.out.println("Status: "+auto1.getStatus());
		
		auto2.setVelocidade(70);
		auto2.setCarga(false);   // Método só de camionete
		
		mostraVelocidade(auto1);// Parâmetro de carro
		mostraVelocidade(auto2);// Parâmetro de camionete
	}
	public static void mostraVelocidade(Veiculo auto){
		System.out.println("Velocidade do veiculo: "+auto.getVelocidade()+" Km/h");
		// Não é permitido usar métodos de carro
		// System.out.println("Status = "+auto.getStatus());
	}
}