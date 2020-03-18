package edu.ujcv.progra1;

import java.util.*;


// https://www.w3resource.com/java-exercises/array/index.php

public class Main {

//    public static void main(String[] args) {
//	// write your code here
//
//        // Busquedas
//
//        ArregloDinamico<Integer> miArreglo = new ArregloDinamico<>();
//
//
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("se le pediran 10 enteros");
//
//        for (int i = 0; i < 5; i++) {
//            System.out.println("ingrese un Entero");
//
//            if(sc.hasNextInt()) {
//                miArreglo.aggregar(sc.nextInt());
//            }else {sc.next();}
//        }
//
//        System.out.println("ingrese un elemento a buscar");
//        int e = sc.nextInt();
//
//        e = sequentialSearch(miArreglo,e);
//
//        if (e == -1){
//            System.out.println("no existe el emento");
//        }else{
//            System.out.println(String.format("el numero %d se encontro en el indice %d",e,e));
//        }
//
//        Stack<Integer> stack = new Stack<>();
//        stack.push(5);
//        stack.peek();
//        stack.pop();
//    }

    // comportamiento lineal
    public static <E>int sequentialSearch(ArregloDinamico arr, E e){
        for (int i = 0; i < arr.getSize(); i++) {
            if(e == arr.obtener(i)){
                return i;
            }
        }
        return -1;
    }


    // asume que arr ya esta ordenado.
    // comportamiento log(n)
    public static int binSearch(int[] arr, int e){
        int first = 0;
        int last = arr.length -1;
        while(first <  last){
            int mid = (last + first)/2;
            if(e == arr[mid]){
                return mid;
            }
            if(e < arr[mid]){
                last = mid -1;
            }else {
                first = mid + 1;
            }
        }
        return -1;

    }


//    public static int[] mergeSort(int[] arr){
//        if(arr.length <= 1){
//            return arr;
//        }
//        int[] inf = new int[arr.length/2];
//        int[] sup = new int[arr.length - inf.length];
//
//        System.arraycopy(arr,0,inf,0,inf.length);
//        System.arraycopy(arr,inf.length,sup,0,sup.length);
//
//        return merge(mergeSort(inf),mergeSort(sup));
//
//    }

//    private static int[] merge(int[] a, int[] b) {
//        int[] c = new int[a.length + b.length];
//        int i = 0;
//        int j = 0;
//        int k = 0;
//        while (i < a.length && j < b.length){
//            if (a[i] < b[j]) {
//                c[k++] = a[i++];
//            }else {
//                c[k++] = b[j++];
//            }
//        }
//        if(i < a.length){
//            System.arraycopy(a,i,c,k,c.length - k);
//        }else{
//            System.arraycopy(b,j,c,k,c.length - k);
//        }
//        return  c;
//    }


    public static void main(String[] args) {

        Hashtable<String,Object> d1 = new Hashtable<>();
        HashMap<String,Object> d2 = new HashMap<>();
        Diccionario d = new Diccionario();

        d.Put("hola", "mundo");

        d1.put("hola", "mundo");

        d2.put("hola", "mundo");


        d.Put("test","mundo");

        d1.put("test", "mundo");

        d2.put("test", "mundo");

        System.out.println(d.get("test"));








    }

    public static void merge(int A[],int izq, int m, int der){
        int i, j, k;
        int [] B = new int[A.length]; //array auxiliar
        for (i=izq; i<=der; i++) //copia ambas mitades en el array auxiliar
            B[i]=A[i];

        i=izq; j=m+1; k=izq;
        while (i<=m && j<=der) //copia el siguiente elemento más grande
            if (B[i]<=B[j])
                A[k++]=B[i++];
            else
                A[k++]=B[j++];
        while (i<=m) //copia los elementos que quedan de la
            A[k++]=B[i++]; //primera mitad (si los hay)
    }

}
