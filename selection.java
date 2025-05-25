// En cada pasada del array, se busca el mínimo elemento del resto no ordenado
// y se intercambia con el primero de ese bloque.

import java.util.Arrays;

public class Selection {
    public static void main(String[] args) {
        Integer[] nums = {9, 1, 4, 6, 0};

        selectionSort(nums);

        // Mostrar resultado
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    public static void selectionSort(Comparable[] a) {
        // n es la cantidad de elementos que tiene el array a
        int n = a.length;

        // Recorre el array desde el principio hasta el final
        for (int i = 0; i < n; i++) {
            System.out.println("Iteración " + i + ": " + Arrays.toString(a));

            // el minimo esta en la posicion actual
            int min = i;

            // busca el índice del valor más chico entre los que siguen
            for (int j = i + 1; j < n; j++) {

                // si a[j] es menor que a[min], actualiza el mínimo
                if (a[j].compareTo(a[min]) < 0) {
                    min = j;
                }
            }

            // Intercambia los valores de las posiciones i y j del array.
            Comparable temp = a[i];
            a[i] = a[min];
            a[min] = temp;
        }
    }
}

