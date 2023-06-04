package Implementaciones;

import TDA.Cola;
public class ColaA implements Cola {
    int[] arr;
    int inx;
    public void inicializarCola() {
        arr = new int[10];
        inx = 0;
    }

    public void acolar(int valor) {
        //-1 porque el array comienza en 0 y el tamaño de los elementos no lo tiene en cuenta
        for(int i = inx - 1; i >= 0; i--){
            arr[i + 1] = arr[i];
        }
        arr[0] = valor;
        inx ++;
    }


    public void desacolar() {
        inx--;
    }

    public boolean colaVacia() {
        return(inx == 0);
    }

    public int primero() {
        return arr[inx - 1];
    }
}
