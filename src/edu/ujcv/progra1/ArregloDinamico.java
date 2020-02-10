package edu.ujcv.progra1;

public class ArregloDinamico<T> {
    private T[] datos; // int[]
    private int size;

    ArregloDinamico(){
        datos = (T[])new Object[45];  // new int[45]
        size = 0;
    }
    ArregloDinamico(T[] otroArreglo){
        datos = (T[])new Object[otroArreglo.length];
        size = otroArreglo.length;
        System.arraycopy(otroArreglo,0,datos,0,size);
    }

    // acotar metodo opcional.

    public void aggregar(T e){
        if(size >= datos.length){
            crecer();
        }
        datos[size++] = e;
    }

    public void aggregarPrimero(T e){
        //TODO : implementar.
    }
    public void aggerarEnIndice(int index,T e){
        //TODO : implementar.
    }

    public T obtener(int index){
        if(index > size){
            throw new IndexOutOfBoundsException(index);
        }
        return datos[index];
    }

    public T remover(){
        return datos[--size];
    }

    public T removerPrimero(){
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

    private void crecer() {
        T[] temp = (T[])new Object[datos.length*2]; // new int[datos.length]
        System.arraycopy(datos,0,temp,0,datos.length);
        datos = temp;
    }





}
