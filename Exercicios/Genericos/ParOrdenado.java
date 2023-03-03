package Genericos;

public class ParOrdenado<K, V> implements Par<K, V> {
    private K chave;
    private V valor;

    public ParOrdenado(K chave, V valor) {
        this.chave = chave;
        this.valor = valor;
    }

    @Override
    public K getChave() {
        return chave;
    }

    @Override
    public V getValor() {
        return valor;
    }

}
