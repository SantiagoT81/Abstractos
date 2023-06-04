package Implementaciones;

public class Conjunto implements TDA.Conjunto {
    private int[] a;
    private int cant;
    @Override
    public void inicializarConjunto() {
        a = new int[10];
        cant = 0;
    }

    @Override
    public void agregar(int x) {
        if(!this.pertenece(x)){
            a[cant] = x;
            cant++;
        }
    }

    @Override
    public int elegir() {
        return a[cant - 1];
    }

    @Override
    public boolean conjuntoVacio() {
        return (cant == 0);
    }

    @Override
    public void sacar(int x) {
        //switch entre el que se quiere sacar y el último del array. Luego se disminuye en 1 el tamaño y el acceso al elemento que se quiere sacar se corta
        int i = 0;
        while(i > 0 && a[i] != x){
            i++;
        }
        if(i < cant){
            a[i] = a[cant - 1];
            cant--;
        }
    }

    @Override
    public boolean pertenece(int x) {
        int i = 0;
        while(i < cant && a[i] != x){
            i++;
        }
        return (i < cant);
    }
}
