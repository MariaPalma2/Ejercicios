package temauno.ejercicios;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        // 2) Declara 2 variables numéricas (con el valor que desees), he indica cual es mayor de los dos. Si son iguales indicarlo también. Ves cambiando los valores para comprobar que funciona.
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el primer número");
        int a = sc.nextInt();
        System.out.println("Introduce el segundo número");
        int b = sc.nextInt();

        System.out.println(a<b?"a es menor que b": (a > b) ? "a es mayor que b" : "a es igual a b");
    }
}