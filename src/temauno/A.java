package temauno.ejercicios;

import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        // Introduce por consola dos números enteros y tienes que imprimir cuál de los dos números es mayor
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println("El número que has introducido es " + (a + 5));
    }
}