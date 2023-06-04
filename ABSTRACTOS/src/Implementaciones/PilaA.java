package Implementaciones;


import TDA.Pila;

public class PilaA implements Pila {
    int[] arr;
    int inx; //cantidad de elementos
    public void inicializarPila() {
        arr = new int[10];
        inx = 0;
    }

    public void apilar(int valor) {
        arr[inx] = valor;
        inx ++;
    }


    public void desapilar() {
        inx --;
    }

    public boolean pilaVacia() {
        return (inx == 0);
    }

    public int tope() {
        return (arr[inx - 1]);
    }
}
