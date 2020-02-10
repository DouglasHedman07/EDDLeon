package edu.ujcv.progra1;

import java.util.List;

public class ListaEnlazada<T> {
    private Nodo<T> head;

    private int size;


    ListaEnlazada(){
        size = 0;
        head = null;
    }


    public void aggregar(T e){
        head = new Nodo<>(e,head);
        size++;
    }

    public void aggregarFinal(T e){
        if(head != null) {
            Nodo temp = head;
            while (temp.getNext()!= null){
                temp = temp.getNext();
            }
            temp.setNext(new Nodo(e,null));
            size ++;
        }else {
            aggregar(e);
        }
    }
    public void aggerarEnIndice(int index,T e){
        //TODO : implementar.
    }

    public T obtener(int index){
        Nodo temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.getNext();
        }
        return (T)temp.getDato();
    }

    public T remover(){
        return null;
    }

    public T removerFinal(){
        //TODO : implementar.
        return null;
    }

    public T removerEnIndice(int indice){
        //TODO : implementar.
        return null;
    }

    public int getSize(){
        return size;
    }


}
