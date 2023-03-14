package ClassesAbstratas;

public abstract class Figura { // Classe Abstract não intancia so pode ser extendid
    public abstract void desenhar(); // public abstract void desenhar() Obriga classes extendidas a criar e sobrescrever esse método
    public void agir(){
        System.out.println("Posso ter métodos normais, também");
    }
    public static void testar(){ // Classe abstrata pode ter metodos es´taicos
        System.out.println("Teste"); // Todos métodos declarados em uma interface são públicos
    }
    }