import TDA_Dinamica.ArbolBinario;

public class BinarioBusquedaPrueba {
    public ArbolBinario buscarElemento(ArbolBinario t, int x){
        if(t.arbolVacio()){
            return null;
        }else if (t.raiz() == x){
            return t;
        }else if (t.raiz() > x){
            return this.buscarElemento(t.hijoIzq(), x);
        }else{
            return this.buscarElemento(t.hijoDer(),x);
        }
    }
}
