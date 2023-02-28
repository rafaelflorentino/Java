package Polimorfismo;

public class Gato extends Animal {
    @Override // Sobrescreve e especializa o método fazSom de Animal
    public void fazSom() {
        System.out.println("Miau");
    }
}
