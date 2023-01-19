/* 
  Objetivo: Crie um programa em java que crie uma classe jogador, istancie, adicione e remova vidas;
  Entrada: Sem entrada.
  Saida: Dados Jogadores.
  Autor: Rafael Florentino.
*/
package ExercicioJogadores;

public class Main{
    public static void main(String[] args) {
        int numero = 0; // Tipo: int; Nome: numero; Valor:1

        //Objeto static(alerta em jogador) consigo acessar sem precisar instanciar um novo jogador.
        System.out.printf("\nAlerta: %s\n",Jogador.alerta ? "Sim" : "Não");

        // Tipo: Jogador; Nome: jogador1; Valor: new Jogador();
        Jogador jogador1 = new Jogador(numero++); /* new instancia um objeto do tipo jogador(classe) e cria um novo jogador
                           * new reserva, aloca memória heap(dinâmica) do tamnaho de Jogador*/
        Jogador jogador2 = new Jogador(numero++);
        Jogador jogador3 = new Jogador(numero++);// Pós
        Jogador jogador4 = new Jogador(++numero);// Pré incremento

        jogador1.num = 10;
        System.out.printf("\nJogador 1 Numero: "+jogador1.num);

        jogador2.num = 11;
        System.out.printf("\nJogador 2 Numero: "+jogador2.num);

        jogador3.num = 9;
        System.out.printf("\nJogador 3 Numero: "+jogador3.num);

        jogador4.num = 1;
        System.out.printf("\nJogador 4 Numero: "+jogador4.num);

        jogador4.addVidas(); // adiciona uma vida
        System.out.printf("\nNumero de vidas do jogador e: "+jogador4.getVidas());

        jogador4.LostVidas(); // remove uma vida
        jogador4.LostVidas();

        System.out.printf("\nNumero de vidas do jogador e: "+jogador4.getVidas());
        jogador4.LostVidas();
        jogador4.addVidas(); 

        Jogador.alerta=true; // Metodo static em jogador
        Jogador.pontos();// Metodo static em jogador
        Jogador.pontos();
        
        jogador1.info();
        jogador2.info();
        jogador3.info();
        jogador4.info();        
    }
}
