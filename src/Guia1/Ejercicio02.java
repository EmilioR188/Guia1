package Guia1;

// Escribir un metodo llamado posicionMayor que toma un arreglo de enteros con al
// menos un elemento y devuelva la posición del mayor elemento del arreglo.

public class Ejercicio02 {
    public static int posicionMayor(int[] a){
        int indiceMayor = 0;
        for (int i = 1; i<a.length; ++i){
            if (a[i] > a[indiceMayor]){
                indiceMayor = i;
            }
        }
        return indiceMayor;
    }
}
