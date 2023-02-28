package Polimorfismo;

public class Cao extends Animal {
    @Override // Sobrescreve e especializa o método fazSom de Animal
    public void fazSom() { 
        System.out.println("Au Au");
    }
}