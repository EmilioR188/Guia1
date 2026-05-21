package Guia1;

// Escribir un metodo llamado productoBooleanos que toma un arreglo de  booleanos y devuelve un entero
// que resulta de multiplicar la cantidad de elementos del arreglo  que en una posición
// par del arreglo son verdaderos por la cantidad de elementos del arreglo  que en una posición impar son falsos.

public class Ejercicio03 {
    public static int productoBooleanos(boolean[] a){
        int parPositivo = 0;
        int imparNegativo = 0;
        for (int i = 0; i<a.length; ++i){
            if (esPar(i) && a[i]){
                parPositivo++;
            } else {
                if (!esPar(i) && !a[i]){
                    imparNegativo++;
                }
            }
        }
        return parPositivo * imparNegativo;
    }
    public static boolean esPar(int indice){
        return indice % 2 == 0;
    }
}
