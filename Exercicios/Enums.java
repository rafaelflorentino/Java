/* 
  Objetivo: Crie um programa em java que mutilize neum
  Entrada: Sem Entrada.
  Saida: Dia da semana.
  Autor: Rafael Florentino.
*/
public class Enums {

    public enum Dia {
        DOMINGO, SEGUNDA, TERCA, QUARTA,
        QUINTA, SEXTA, SABADO
    }

    public enum Direcoes {
        NORTE, SUL, LESTE, OESTE
    }

    public static void main(String[] args) {
        // Dias da semana
        Dia d = Dia.DOMINGO;
        Dia s = Dia.SEGUNDA;
        if (d == Dia.DOMINGO) {
            System.out.println("É domingo!");
        }
        if (s == Dia.SEGUNDA) {
            System.out.println("É Segunda!");
        }

        // Direções
        Direcoes n = Direcoes.NORTE;
        System.out.println(n);

    }

}
