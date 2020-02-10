package edu.ujcv.progra1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // Busquedas

        ArregloDinamico<Integer> miArreglo = new ArregloDinamico<>();

        Scanner sc = new Scanner(System.in);

        System.out.println("se le pediran 10 enteros");

        for (int i = 0; i < 5; i++) {
            System.out.println("ingrese un Entero");

            if(sc.hasNextInt()) {
                miArreglo.aggregar(sc.nextInt());
            }else {sc.next();}
        }

        System.out.println("ingrese un elemento a buscar");
        int e = sc.nextInt();

        e = sequentialSearch(miArreglo,e);

        if (e == -1){
            System.out.println("no existe el emento");
        }else{
            System.out.println(String.format("el numero %d se encontro en el indice %d",e,e));
        }





    }

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


    public static int[] mergeSort(int[] arr){
        if(arr.length <= 1){
            return arr;
        }
        int[] inf = new int[arr.length/2];
        int[] sup = new int[arr.length - inf.length];

        System.arraycopy(arr,0,inf,0,inf.length);
        System.arraycopy(arr,inf.length,sup,0,sup.length);

        return merge(mergeSort(inf),mergeSort(sup));

    }

    private static int[] merge(int[] a, int[] b) {
        int[] c = new int[a.length + b.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < a.length && j < b.length){
            if (a[i] < b[j]) {
                c[k++] = a[i++];
            }else {
                c[k++] = b[j++];
            }
        }
        if(i < a.length){
            System.arraycopy(a,i,c,k,c.length - k);
        }else{
            System.arraycopy(b,j,c,k,c.length - k);
        }
        return  c;
    }
}
