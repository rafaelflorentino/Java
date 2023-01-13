public class IfElse {
    public static void main(String[] args) {
        int nota = 99;
        int media = 60;
        int maxFaltas= 5;
        int faltas= 10;
        String resultado;
        int resultadoFinal;

        // Else If 
        if(nota >= media && faltas<= maxFaltas){ // AND && 
            System.out.println("\nAprovado!!!");
        }else if(nota >= 40){
            System.out.println("\nRecuperação...");
        }else{
            System.out.println("\nReprovado.");
        }

        // Operação Ternária
        resultado = (nota >= media ? "Aprovado!" : "Reprovado."); 
        System.out.println("\nResultado Parcial: \n"+ resultado);

        resultadoFinal=(nota >= media ? 1 : 0);
        System.out.println("\nResultado Final");
        System.out.println(resultadoFinal ==1?"Aprovado!":"Reprovado.");

        System.out.println("\nFim do Programa.\n");
    }
}
