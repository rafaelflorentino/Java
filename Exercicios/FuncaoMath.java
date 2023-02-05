public class FuncaoMath {
    public static void main(String[] args) {

        // Retorna o Menor número
        System.out.println("Menor Número: "+Math.min(15,5));

        // Retorna o Maior número
        System.out.println("Maior Número: "+Math.max(15,5));

        // Retorna a raiz Quadrada
        System.out.println("Raiz Quadrada: "+Math.sqrt(64));

        // Retorna o Valor Absoluto
        System.out.println("Valor Absoluto: "+Math.abs(-16)); 

        // Retorna a Ptencia
        System.out.println("Potência: "+Math.pow(3,2));  
        
        // Retorna o valor floor retorna so a parte inteira do valor
        System.out.println("Retorna só a parte Inteira: "+Math.floor(4.8));          
        
        // Retorna um número aleatório
        System.out.println("Aleatórios entre 0.00 e 0.999: "+Math.random());// 0.0 e 0.999
        System.out.println("Aleatórios entre 0 e 10: "+Math.random()*11); // Números entre 0 e 10   
        System.out.println("Aleatórios entre 0 e 100: "+(int)(Math.random()*101));// Números inteiros entre 0 e 100     
    }
}
