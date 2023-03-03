package Genericos;

public class Teste {
    public <K, V> boolean comparar(Par<K, V> p1, Par<K, V> p2) {
        return p1.getChave().equals(p2.getChave()) &&
                p1.getValor().equals(p2.getValor());
    }

    public <N> String formata(N valor) { // Método Genérico
        return "fomato: " + valor;
    }
}
