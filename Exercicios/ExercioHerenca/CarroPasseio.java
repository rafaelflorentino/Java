package ExercioHerenca;

interface  CarroPasseio {
    public boolean passeio = true;

    public void passear(boolean passeio); // Assinatura do método, para obrigar a classe a ter esse metodo.
    
     // Em interface só posso ter a assinatura de metodos, não posso cria metodos novos aqui dentro
     
    /*
    public void passear(){
        System.out.println("Estou passeando nesse automovel");
        System.out.println("Sou um carro de passeio: "+ passeio);
    } */
}
