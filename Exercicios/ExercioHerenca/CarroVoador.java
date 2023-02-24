package ExercioHerenca;

public class CarroVoador implements CarroPasseio{

    @Override
    public void passear(boolean passeio) {
        if(passeio == true){
            System.out.println("Estou passeando na terra e no ceu nesse automovel");
            System.out.println("Sou um Carro Voador de passeio, passeio no ceu e na terra: "+ passeio);
        }else{
            System.out.println("Não sou um Carro Voador de passeio, passeio: "+ passeio);
        }
        //throw new UnsupportedOperationException("Unimplemented method 'passear'");
    }
    
}
