package Implementaciones;

import TDA_Dinamica.ListaDinamica;

public class ListaD implements ListaDinamica {
    public static class Nodo {
        int valor;
        Nodo sig;
    }
    int tamanio;
    Nodo primero;
    Nodo ultimo;
    @Override
    public void append(int x) {
        Nodo nuevo = new Nodo();
        nuevo.valor = x;
        nuevo.sig = null;
        if(primero == null){
            primero = nuevo;
            ultimo = nuevo;
        }
        if(ultimo != null){
            ultimo.sig = nuevo;
            ultimo = nuevo;
        }
        tamanio++;


    }

    @Override
    public int pop() {
        Nodo aux = new Nodo();
        aux = primero;
        int value = 0;
        while(aux.sig.sig != null){
            aux = aux.sig;
        }
        value = aux.sig.valor;
        aux.sig = null;
        tamanio--;
        return value;
    }

    @Override
    public int length() {
        return tamanio - 1;
    }

    @Override
    public int get(int indice) {
        Nodo aux = new Nodo();
        aux = primero;
        for(int j = 0; j != indice; j++){
            aux = aux.sig;
        }
        return aux.valor;
    }

    @Override
    public int indexOf(int x) {
        Nodo aux = new Nodo();
        aux = primero;
        for(int i = 0; i < tamanio; i++){
            if(aux.valor == x){
                return i;
            }
            aux = aux.sig;
        }
        return 0;
    }

    @Override
    public void insert(int x, int pos) {
        Nodo aux = new Nodo();
        aux = primero;
        Nodo insertado = new Nodo();
        insertado.valor = x;
        for(int k = 0; k != pos; k++){
            aux = aux.sig;
        }
        if(pos == 0){
            insertado.sig = primero;
            primero = insertado;
        }
        else{
            insertado.sig = aux.sig;
            aux.sig = insertado;
        }
        tamanio++;
    }

    @Override
    public void inicializarLista() {
        primero = null;
        ultimo = null;
        tamanio = 0;

    }
}
