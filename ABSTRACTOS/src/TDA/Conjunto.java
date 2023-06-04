package TDA;

public interface Conjunto {
    void inicializarConjunto();
    void agregar(int x);
    int elegir();
    boolean conjuntoVacio();
    void sacar(int x);
    boolean pertenece(int x);
}
