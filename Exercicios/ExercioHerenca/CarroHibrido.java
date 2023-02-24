package ExercioHerenca;

/* No java não pode herdar 2 classes, não aceita herança multipla */
public class CarroHibrido extends Carro implements CarroPasseio, MaquinaDoTempo { // Vou usar 2 implements de interface carro passeio e maquina do tempo terão metodo passear() próprios é o brigatórios

    public CarroHibrido(String nome) {
        super(nome);
        
    }

    @Override
    public void passear(boolean passeio){
        if(passeio == true){
            System.out.println("Estou passeando na terra e na agua com esse automovel");
            System.out.println("Sou um carro de passeio Hibrido ando na agua e na terra: "+ passeio);
        }else{
            System.out.println("Não sou um carro de passeio, passeio: "+ passeio);
        }

    }

    @Override
    public void voltarNoTempo() {
        System.out.println("Estou Indo para o Passado...");
    }

    @Override
    public void avancarNoTempo() {
        System.out.println("Estou Indo para o futuro...");
    } 
}
