package edu.ujcv.progra1;

public class Pila<T> {

    ArregloDinamico<T> datos;

    public Pila(){
        datos = new ArregloDinamico<>();
    }

    public void push(T elemnto){
        datos.aggregar(elemnto);
    }

    public void pop(){
        datos.removerEnIndice(datos.getSize()-1);
    }

    public T peek(){
        return datos.obtener(datos.getSize()-1);
    }
}
