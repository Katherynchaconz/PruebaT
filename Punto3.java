package org.example;


import java.util.Arrays;
import java.util.Scanner;

import static org.example.Punto2.ordenarArreglo;

public class Punto3 {

    public static void main(String[] args) {//Ingreso de Monedas
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de monedas a ingresar:");
        int cantidad = scanner.nextInt();
        int[] monedas = new int[cantidad];//Declara el arreglo monedas y dice la cantidad a ingresar o el tamaño del arreglo.
        System.out.println("Ingrese las monedas:");
        for (int i = 0; i < cantidad; i++) {//Llena el arreglo hasta el tamaño.
            System.out.print("Moneda " + (i + 1) + ": ");//Muestra en pantalla el numero de la moneda a ingresar.
            monedas[i] = scanner.nextInt();//Ingresa moneda e informa el indice.
        }
         int cambio = calcularCambio(monedas);//Usa la funcion calcularCambio para informar el cambio que no se puede dar.
        System.out.println("No se puede dar cambio para: " + cambio+ "$");
    }

    public static int calcularCambio(int[] monedas) {
        ordenarArreglo(monedas); // Ordenar el arreglo de monedas

        int cambio = 1; // El cambio minimo que no puedo dar es 1
        int i = 0;//Inicializo en 0 para leer el arreglo

        while (i < monedas.length && monedas[i] <= cambio) {//Mientras que el vector tenga datos y la moneda sea menor a cambio suma.
            cambio += monedas[i]; // Sumar la moneda al cambio actual si es posible
            i++;
        }

        return cambio; // Devolver el cambio.
    }
}