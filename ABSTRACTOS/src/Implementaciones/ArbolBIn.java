package Implementaciones;

import TDA_Dinamica.ArbolBinario;

public class ArbolBIn implements ArbolBinario {
    NodoABB raiz;
    private int mayor(ArbolBinario a){
        if(a.hijoDer().arbolVacio()){
            return a.raiz();
        }else{
            return mayor(a.hijoDer());
        }
    }
    private int menor(ArbolBinario a){
        if(a.hijoIzq().arbolVacio()){
            return a.raiz();
        }else{
            return menor(a.hijoIzq());
        }
    }
    @Override
    public int raiz() {
        return raiz.dato;
    }

    @Override
    public ArbolBinario hijoIzq() {
        return raiz.hijoIzq;
    }

    @Override
    public ArbolBinario hijoDer() {
        return raiz.hijoDer;
    }

    @Override
    public boolean arbolVacio() {
        return (raiz == null);
    }

    @Override
    public void inicializarArbol() {
        raiz = null;
    }

    @Override
    public void agregarElem(int x) {
        if(raiz == null){
            raiz = new NodoABB();
            raiz.dato = x;
            //se agrega otra estructura ABB a ambos nodos (árboles vacíos)
            raiz.hijoIzq = new ArbolBIn();
            raiz.hijoIzq.inicializarArbol();
            raiz.hijoDer = new ArbolBIn();
            raiz.hijoDer.inicializarArbol();
        } else{
            if(raiz.dato > x){
                raiz.hijoIzq.agregarElem(x);
            }else{
                raiz.hijoDer.agregarElem(x);
            }
        }
    }

    @Override
    public void eliminarElem(int x) {
        if(raiz != null){
            if(raiz.dato == x && raiz.hijoIzq.arbolVacio() && raiz.hijoDer.arbolVacio()){
                raiz = null;
            } else if(raiz.dato == x && !raiz.hijoIzq.arbolVacio()){
                raiz.dato = this.mayor(raiz.hijoIzq);
                raiz.hijoIzq.eliminarElem(raiz.dato);
            } else if(raiz.dato == x && raiz.hijoIzq.arbolVacio()){
                raiz.dato = this.menor(raiz.hijoDer);
                raiz.hijoDer.eliminarElem(raiz.dato);
            }else if(raiz.dato < x){
                raiz.hijoDer.eliminarElem(x);
            }else {
                raiz.hijoIzq.eliminarElem(x);
            }
        }
    }
}
