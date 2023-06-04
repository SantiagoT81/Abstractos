package TDA_Dinamica;

public interface ArbolBinario {
    int raiz();
    ArbolBinario hijoIzq();
    ArbolBinario hijoDer();
    boolean arbolVacio();
    void inicializarArbol();
    void agregarElem(int x);
    void eliminarElem(int x);
}
