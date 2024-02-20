package org.example;

import java.util.Scanner;

public class Punto1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer la cantidad de arreglo y el valor de S
        System.out.println("Ingrese el tamaño del arreglo:");
        int n = scanner.nextInt();
        System.out.println("Ingrese el valor de S:");
        int s = scanner.nextInt();

        // Leer los números del arreglo
        int[] arreglo = new int[n];
        System.out.println("Ingrese los números:");
        for (int i = 0; i < n; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            arreglo[i] = scanner.nextInt();
        }

        // Cambiar manualmente las posiciones del vector
        Posicion(arreglo);

        // Eliminar los datos del vector si contienen el número s
        Digitos(arreglo, s);

        // Eliminar los ceros del arreglo
        arreglo = Cero(arreglo);

        // Imprimir el resultado
        System.out.println("Resultado:");
        for (int num : arreglo) {
            System.out.print(num + " ");
        }
    }

    // Función para cambiar manualmente las posiciones de un vector
    public static void Posicion(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }
    }

    // Función para eliminar los datos del vector si contienen el número s y si son mayores a s
    public static void Digitos(int[] arr, int s) {
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            int temp = 0;
            int multiplier = 1;
            int prevDigit = -1; // Almacenar el dígito anterior
            while (num > 0) {
                int digit = num % 10;
                num /= 10;
                if (digit == s || digit > s) {
                    continue;
                }
                // Verificar si el dígito anterior era mayor que s
                if (prevDigit > s) {
                    temp += digit * multiplier;
                    multiplier *= 10;
                } else {
                    temp += digit * multiplier;
                    multiplier *= 10;
                }
                prevDigit = digit; // Actualizar el dígito anterior
            }
            arr[i] = temp;
        }
    }

    // Función para eliminar los ceros del arreglo
    public static int[] Cero(int[] arr) {
        int contCero = 0;
        for (int num : arr) {
            if (num != 0) {
                contCero++;
            }
        }
        int[] result = new int[contCero];
        int index = 0;
        for (int num : arr) {
            if (num != 0) {
                result[index++] = num;
            }
        }
        return result;
    }
}
