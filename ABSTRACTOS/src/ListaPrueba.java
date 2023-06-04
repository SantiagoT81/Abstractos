import Implementaciones.ListaD;
import TDA_Dinamica.ListaDinamica;

public class ListaPrueba {

    public static void main(String[] args) {
        ListaDinamica lista = new ListaD();
        lista.inicializarLista();
        lista.append(5);
        lista.append(3);
        lista.append(25);
        lista.append(25);
        lista.append(25);
        lista.insert(100,0);
        System.out.println(lista.length());
    }
}
