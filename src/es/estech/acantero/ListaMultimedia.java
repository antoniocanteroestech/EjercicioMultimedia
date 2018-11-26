package es.estech.acantero;

import java.util.Arrays;

/**
 * int size(): devuelve el número de objetos que hay en la lista.
 * boolean add(Multimedia m): añade el objeto al final de la lista, y devuelve true, en
 * caso de que la lista esté llena, devuelve false.
 * Multimedia get(int position): devuelve el objeto situado en la posición especificada.
 * String toString(): devuelve la información de los objetos que están en la lista.
 */



public class ListaMultimedia {

    private  Multimedia[] lista;
    private int counter;

    public ListaMultimedia(int maxListSize) {
        this.lista = new Multimedia[maxListSize];

    }

    public int size (){
        return counter;
    }

    public boolean add (Multimedia multimedia){
        for (int i = 0; i < this.lista.length; i++) {
            if (this.lista[i] == null) this.lista[i] = multimedia ;
            counter = i + 1;
            return true;
        }
        return false;
    }

    public Multimedia get (int position){
        return this.lista[position];
    }

    @Override
    public String toString() {
        return "ListaMultimedia{" +
                "lista=" + Arrays.toString(lista) +
                '}';
    }
}
