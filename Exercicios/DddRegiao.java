/* 
  Objetivo: Elabore um programa que indique o nome da capital do centro-oeste brasileiro que possui o DDD informado pelo
  usuário (61-Brasília, 62-Goiânia, 65-Cuiabá e 67-Campo Grande). Caso o DDD seja válido (maior que 10), mas não 
  esteja entre estes, deverá ser informado ao usuário: DDD não corresponde a uma capital do centro-oeste brasileiro.
  Entrada: DDD.
  Saida: Cidade que pertence o DDD.
  Autor: Rafael Florentino.
*/
import java.util.Scanner;

public class DddRegiao {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int DDD;

        System.out.println("Digite um DDD (maior que 10): ");
        DDD = entrada.nextInt();
        while (DDD < 10) {
            System.out.println("DDD invalido ");
            System.out.println("Entre com um DDD valido  (maior que 10): ");
            DDD = entrada.nextInt();
        }
        switch (DDD) {
            case 61:
                System.out.println("Capital: Brasília");
                break;
            case 62:
                System.out.println("Goiânia");
                break;
            case 65:
                System.out.println("Cuiabá");
                break;
            case 67:
                System.out.println("Campo Grande");
                break;
            default:
                System.out.println("DDD não corresponde a uma capital do centro-oeste brasileiro. ");
        }
        entrada.close();
    }
}
