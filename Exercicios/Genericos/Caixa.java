package Genericos;

public class Caixa { 
    private Object objeto;

    public void set(Object objeto) { // Aceita qualquer objeto
        this.objeto = objeto;
    }

    public Object get() {
        return objeto;
    }
}
