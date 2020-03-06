package edu.ujcv.progra1;

import java.util.ArrayList;
import java.util.Queue;

public class Cola<T> {

    ArrayList<T> datos;

    public Cola(){
        datos  = new ArrayList<>();
    }

    public void Agregar(T e){
        datos.add(e);
    }

    public T remover(){
        return datos.remove(0);
    }

    public T ver(){
        return datos.get(0);
    }
}
