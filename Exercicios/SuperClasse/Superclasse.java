package SuperClasse;

public class Superclasse {

    public Superclasse() {
        System.out.println("Construtor Superclasse");
        }

    public void f1() {
        System.out.println("Superclasse f1");
    }

    final public void f2() { // Com final esse método não poderá ser sobrescrito por outras classes
        System.out.println("Superclasse f2 não pode ser sobrescrita");
    } // Se for uma final classe não pode ter subclasses
}
