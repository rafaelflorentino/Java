package ClassesAbstratas;

public abstract class Figura { // Classe Abstract não intancia so pode ser extendid
    public abstract void desenhar(); // public abstract void desenhar() Obriga classes extendidas a criar e sobrescrever esse método
    public void agir(){
        System.out.println("Posso ter métodos normais, também");
    }

    }