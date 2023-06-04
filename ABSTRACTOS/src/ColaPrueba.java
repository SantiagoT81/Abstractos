import Implementaciones.ColaA;
import TDA.Cola;
import Implementaciones.PilaA;
import TDA.Pila;

public class ColaPrueba {
    public static Cola pasarCola(Cola cola1, Cola cola2) {
        int auxiliar;
        while (!cola1.colaVacia()) {
            auxiliar = cola1.primero();
            cola1.desacolar();
            cola2.acolar(auxiliar);
        }
        return cola2;

    }


    public static Cola invertirColaPila(Cola cola){
        Pila pila = new PilaA();
        pila.inicializarPila();
        int auxiliar;
        while(!cola.colaVacia()){
            auxiliar = cola.primero();
            pila.apilar(auxiliar);
            cola.desacolar();
        }
        while(!pila.pilaVacia()){
            auxiliar = pila.tope();
            cola.acolar(auxiliar);
            pila.desapilar();
        }
        return cola;
    }
    public static Cola copiarCola(Cola cola){
        int valor;
        Cola cola2 = new ColaA();
        Cola cola3 = new ColaA();
        cola2.inicializarCola();
        cola3.inicializarCola();
        while(!cola.colaVacia()){
            valor = cola.primero();
            cola.desacolar();
            cola2.acolar(valor);
            cola3.acolar(valor);
        }
        while(!cola2.colaVacia()){
            valor = cola2.primero();
            cola2.desacolar();
            cola.acolar(valor);
        }
        return cola3;
    }

    public static void invertirCola(Cola cola){
        //Transferido
        Cola colaAuxiliar = new ColaA();
        Cola colaAuxiliar2 = new ColaA();
        colaAuxiliar.inicializarCola();
        colaAuxiliar2.inicializarCola();
        //Contador elementos
        int elementos = 0;
        int valor;
        int contador;
        boolean cambiar = true;
        while(!cola.colaVacia()){
            elementos += 1;
            valor = cola.primero();
            cola.desacolar();
            colaAuxiliar.acolar(valor);
        }
        for(int i = 0; i <= elementos; i++){
            contador = elementos - 1;
            for(int j = 0; j <= contador; j ++){
                contador --;
                valor = colaAuxiliar.primero();
                colaAuxiliar.desacolar();
                colaAuxiliar.acolar(valor);
            }


        }

    }
    public static boolean colaCapicua(Cola cola){
        Cola cola2 = copiarCola(cola);
        while(!cola.colaVacia()){
            if(cola.primero() != cola2.primero()){
                return false;
            }
            cola.desacolar();
        }
        return true;
    }

    public static void main(String[] args) {
        Cola colaPrueba = new ColaA();
        colaPrueba.inicializarCola();
        //Elementos
        for(int i = 0; i < 10; i++){
            colaPrueba.acolar(i * 2);
        }
    }
}
