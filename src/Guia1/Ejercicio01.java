package Guia1;

// Escribir un metodo llamado posicionMenor que toma un arreglo de enteros con al
// menos un elemento y devuelve la posición del menor elemento del arreglo.

public class Ejercicio01 {
    public static int posicionMenor(int[] a){
        int indiceMenor = 0;
        for (int i = 1; i<a.length; ++i){
            if (a[i] < a[indiceMenor]){
                indiceMenor = i;
            }
        }
        return indiceMenor;
    }
}
