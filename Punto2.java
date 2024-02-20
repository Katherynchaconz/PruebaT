package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Punto2 {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Ingrese el tamaño de s:");
            int s = scanner.nextInt();
            int n = s * 11;  // Duplica el valor de s para obtener n
            System.out.println("Ingrese el tamaño del arreglo:");
            int cantidad = scanner.nextInt();

            int[] arreglo = new int[cantidad]; // Declara el arreglo y su tamaño.
            System.out.println("Ingrese los números:");
            for (int i = 0; i < cantidad; i++) {
                System.out.print("Número " + (i + 1) + ": ");
                arreglo[i] = scanner.nextInt();
            }
            // Calcula los cuadrados y los ordena
            int[] cuadrados = new int[arreglo.length];
            cuadrado(arreglo,cuadrados,n);
            ordenarArreglo(cuadrados);

            // Muestra el arreglo ordenado y los cuadrados
            System.out.println("Arreglo ingresado:");
            for (int i = 0; i < arreglo.length; i++) {
                System.out.print(arreglo[i] + " ");
            }

            System.out.println("Arreglo de cuadrados ordenados:");
            for (int i = 0; i < cuadrados.length; i++) {
                System.out.print(cuadrados[i] + " ");
            }
            System.out.println("Rango de impresión hasta:"+n);
        }

        public static void ordenarArreglo(int[] arreglo) {
            boolean ordenado = false;
            while (!ordenado) {
                ordenado = true;
                for (int i = 0; i < arreglo.length - 1; i++) {
                    if (arreglo[i] > arreglo[i + 1]) {
                        int temp = arreglo[i];
                        arreglo[i] = arreglo[i + 1];
                        arreglo[i + 1] = temp;
                        ordenado = false;
                    }
                }
            }
        }

    public static void cuadrado(int[] arreglo, int[] cuadrados, int n) {
        int i = 0;
        while (i < arreglo.length && arreglo[i] * arreglo[i] < n) {
            cuadrados[i] = arreglo[i] * arreglo[i];
            i++;
        }
    }
    }


