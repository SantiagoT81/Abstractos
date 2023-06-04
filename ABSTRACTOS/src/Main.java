import Implementaciones.PilaA;
import TDA.Pila;

public class Main {
    public static Pila invertirPila(Pila pila1){
        Pila inversa = new PilaA();
        int auxiliar;
        inversa.inicializarPila();
        while(!pila1.pilaVacia()){
            auxiliar = pila1.tope();
            pila1.desapilar();
            inversa.apilar(auxiliar);
        }
        return inversa;
    }

    public static Pila copiarPila(Pila pila1){
        Pila inversa = new PilaA();
        inversa.inicializarPila();
        Pila copia = new PilaA();
        copia.inicializarPila();
        int auxiliar;
        while(!pila1.pilaVacia()){
            auxiliar = pila1.tope();
            pila1.desapilar();
            inversa.apilar(auxiliar);
        }
        while(!inversa.pilaVacia()){
            auxiliar = inversa.tope();
            inversa.desapilar();
            pila1.apilar(auxiliar);
            copia.apilar(auxiliar);
            inversa.desapilar();
        }
        return copia;

    }

    public static Pila invertirOriginal(Pila pila1){
        Pila pilaB = new PilaA();
        Pila pilaC = new PilaA();
        pilaB.inicializarPila();
        pilaC.inicializarPila();
        int auxiliar;
        while(!pila1.pilaVacia()){
            auxiliar = pila1.tope();
            pila1.desapilar();
            pilaB.apilar(auxiliar);
        }
        while(!pilaB.pilaVacia()){
            auxiliar = pilaB.tope();
            pilaB.desapilar();
            pilaC.apilar(auxiliar);
        }
        while(!pilaC.pilaVacia()){
            auxiliar = pilaC.tope();
            pilaC.desapilar();
            pila1.apilar(auxiliar);
        }
        return pila1;
    }

    public static int contarElementosPila(Pila pila){
        int elementos = 0;
        while(!pila.pilaVacia()){
            elementos ++;
            pila.desapilar();
        }
        return elementos;
    }
    public static int sumarElementosPila(Pila pila){
        int suma = 0;
        while(!pila.pilaVacia()){
            suma = suma + pila.tope();
            pila.desapilar();
        }
        return suma;
    }

    public static double promedioPila(Pila pila){
        int suma = 0;
        int elementos = 0;
        while(!pila.pilaVacia()){
            suma = suma + pila.tope();
            pila.desapilar();
            elementos ++;
        }
        return suma / elementos;
    }

    public static void main(String[] args) {
        Pila pilaPrueba = new PilaA();
        pilaPrueba.inicializarPila();
        //LLENADO DE PILA HASTA 10 ELEMENTOS
        int value = 1;
        for(int i = 0; i < 10; i++){
            pilaPrueba.apilar(value);
            value = value * 2;
        }
    }
}