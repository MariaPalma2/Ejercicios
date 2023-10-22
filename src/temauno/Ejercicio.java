package temauno.ejercicios;

import java.util.Scanner;

public class Ejercicio {
    public static void main(String[] args) {
        // 1) Declara dos variables numéricas (con el valor que desees), muestra por consola la suma, resta, multiplicación, división y módulo (resto de la división).

        int a;
        int b;
        a=5;
        b=2;
        System.out.println(a+b);

        System.out.println(a-b);

        System.out.println(a*b);

        System.out.println(a/b);

        System.out.println(a%b);

        //3) Declara un String que contenga tu nombre, después muestra un mensaje de bienvenida por consola.
        // Por ejemplo: si introduzco «Fernando», me aparezca «Bienvenido Fernando».
        String n="Bienvenido ";
        //System.out.println(n);

        Scanner scan = new Scanner(System.in);
        //System.out.println("Introduce un nombre");
        // String nombre = scan.next();
        // System.out.println(n + nombre);

        String nombre = scan.next();
        System.out.println("Bienvenido " + nombre);


    }
}