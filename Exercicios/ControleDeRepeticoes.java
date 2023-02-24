/* 
  Objetivo: Crie um programa em java que utilize controles de repetição e imprima mensagens na tela.
  Entrada: Sem entrada.
  Saida: Mensagens.
  Autor: Rafael Florentino.
*/
public class ControleDeRepeticoes {
    public static void main(String[] args) {
        java.util.ArrayList<String> mesesFuturos = new java.util.ArrayList<String>();
        int mes = 3;
        switch (mes) {
            case 1:
                mesesFuturos.add("Janeiro");
            case 2:
                mesesFuturos.add("Fevereiro");
            case 3:
                mesesFuturos.add("Março"); // Sem o break irá entrar em todos os cases apartir do 3 que foi passado.
            case 4:
                mesesFuturos.add("Abril");
            case 5:
                mesesFuturos.add("Maio");
                break;
            default:
                break;
        }
        System.out.println(mesesFuturos); // [Março, Abril, Maio]
        System.out.println(" ");

        // Loop infinito for ( ; ; ) { instruções }

        // Break
        int[] arrayNumeros = { 32, 87, 3, 589, 12, 1076, 2000, 8, 622, 127 };
        int buscaPor = 12;
        int i;
        boolean encontrou = false;
        for (i = 0; i < arrayNumeros.length; i++) {
            if (arrayNumeros[i] == buscaPor) {
                encontrou = true;
                break; // Quando acahar o número 12 que foi passado vai sair do loop
            }
        }
        System.out.println("Encontrou o número 12: " + encontrou);
        System.out.println(" ");

        /* Criando rótulo para o for */
        int[][] arrayNum = { { 32, 87, 3, 589 }, { 12, 1076, 2000, 8 }, { 622,
                127, 77, 955 } };
        int buscaPor2 = 77;
        int j = 0;
        boolean encontrou2 = false;
        busca: for (i = 0; i < arrayNum.length; i++) { // rótulo busca para diferenciar o for
            for (j = 0; j < arrayNum[i].length; j++) {
                if (arrayNum[i][j] == buscaPor2) {
                    encontrou2 = true;
                    break busca;
                }
            }
        }
        System.out.println("Encontrou o número 77: " + encontrou2);
        System.out.println(" ");

        /* Usando o continue para realizar a busca */
        String busqueMe = "Busque por uma substring em mim"; 
        String substring = "sub";
        boolean encontrou3 = false;
        int max = busqueMe.length() - substring.length();
        teste: for (i = 0; i <= max; i++) {
            int n = substring.length();
            j = i;
            int k = 0;
            while (n-- != 0) {
                if (busqueMe.charAt(j++) != substring.charAt(k++)) {
                    continue teste;
                }
            }
            encontrou3 = true;
            break teste;
        }
        System.out.println(encontrou3 ? "Encontrou" : "Não encontrou");
    }
}
