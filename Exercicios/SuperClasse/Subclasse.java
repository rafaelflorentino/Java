package SuperClasse;

public class Subclasse extends Superclasse {
    @Override
    public void f1() {
        System.out.println("Subclasse f1");
        super.f1();
    }
}
