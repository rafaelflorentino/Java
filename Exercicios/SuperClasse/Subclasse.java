package SuperClasse;

public class Subclasse extends Superclasse {

    public Subclasse() {
        super();
        System.out.println("Construtor Subclasse");
    }
        
    @Override
    public void f1() {
        System.out.println("Subclasse f1");
        super.f1(); // Invoca o método f1() da classe pai (Super classe) 
    }
}
