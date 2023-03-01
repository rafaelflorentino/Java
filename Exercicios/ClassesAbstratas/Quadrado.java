package ClassesAbstratas;

public class Quadrado extends Figura {
    @Override // É obrigado a criar e sobrescrever esse método da classe abstract Figura
    public void desenhar() {
        System.out.println("---");
    }
}