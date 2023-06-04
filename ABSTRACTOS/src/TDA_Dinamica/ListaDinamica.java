package TDA_Dinamica;

public interface ListaDinamica {
    void append(int x); // lista inicializada, se inserta un dato.
    int pop(); // lista inicializada, se retorna y borra el último dato.
    int length(); // lista inicializada
    int get(int indice);
    int indexOf(int x);
    void insert(int x, int pos);
    void inicializarLista();
}
