package temauno.ejercicios;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Refuerzo {
    public static void main(String[] args) {
       // Escribe un programa java que se llame ParImpar y declare una variable A de
        //tipo entero y asígnale un valor. A continuación muestra un mensaje indicando si A es par o impar.
        //Utiliza el operador condicional ( ? : ) dentro del println para resolverlo.

        //Si por ejemplo A = 14 la salida será
        //14 es par
        //Si fuese por ejemplo A = 15 la salida será:
        //15 es impar

        //int a = 10;
        //String par= a%2==0 ? "es par" : "es impar";
        //System.out.println(par);

        //Escribe en Java el código que consideres oportuno para representar lo siguiente:
       // int a = 2, b = 7, c = 3;
       //double mas= (-b+Math.sqrt(Math.pow(b,2)-4*a*c))/(2*a);
       //double menos=(-b+Math.sqrt(Math.pow(b, 2)-4*a*c))/(2*a);
        //System.out.println(mas);
        //System.out.println(menos);

        //Programa que lea la longitud de los catetos de un triángulo rectángulo y calcule la longitud de la
        // hipotenusa según el teorema de Pitágoras.


        //teorema de Pitagoras h²=a²+b²
        //Scanner sc= new Scanner(System.in);
        //int a= sc.nextInt();
        //int b= sc.nextInt();
        //double h=  Math.pow(a, 2)+ Math.pow(b, 2);
        //h = Math.pow(h, 2);
        //System.out.println("El teorema de Pitagoras es " + h);

        //Programa que lea dos caracteres y compruebe si son dos letras minúsculas.


        //Scanner sc= new Scanner(System.in);
        //System.out.println("Introduce caracter uno");
       //char caracterUno = sc.next().charAt(0);
        //System.out.println("Introduzca caracter dos");
       //char caracterDos = sc.next().charAt(0);
       //String minusculaUno= caracterUno <='z'? "es minuscula": "es mayuscula";
       //String minusculaDos= caracterDos <='z'? "es minuscula": "es mayuscula";
        //System.out.println(minusculaUno);
        //System.out.println(minusculaDos);

        //Programa que lea tres números enteros H, M, S que contienen hora, minutos y segundos respectivamente,
        // y comprueba si la hora que indican es una hora válida.

        //Scanner sc=new Scanner(System.in);
        //System.out.println("Introduce una hora");
        //int H = sc.nextInt();
        //int M= sc.nextInt();
        //int S= sc.nextInt();
        //String hora= H<24 ? "La hora es correcta":"La hora es incorrecta"; // 0-23
        //String segundos=S<= 60? "Los segundos son correctos":"Los segundos son incorrectos";
        //String minutos=M<=60?"Los minutos son correctos":"Los minutos son incorrectos";
        //System.out.println(hora);
        //System.out.println(segundos);
        //System.out.println(minutos);

        //1. Pasar de decimal a binario
        //2. Pasar de binario a decimal

       // System.out.println(Integer.toBinaryString(34));
        //System.out.println(Integer.valueOf("100010", 2));

       // Programa que lea un carácter por teclado y compruebe si es una letra mayúscula.
       // Scanner sc=new Scanner(System.in);
        //System.out.println("Introduce un caracter");
        //char caracter = sc.next().charAt(0);
        //String mayuscula= caracter >= 'a' && caracter <= 'z' ? "es minuscula":"es mayuscula";
        //System.out.println(mayuscula);

        //Desarrolla un programa Java que pida una fecha por consola y calcule lo siguiente:

        //Número de días para el fin de año
        Scanner sc=new Scanner(System.in);
        //System.out.println("Introduce fecha");
        LocalDate dias= LocalDate.parse(sc.nextLine()); // <--
        LocalDate finAnio= LocalDate.of(dias.getYear(), 12, 31);
        //System.out.println(ChronoUnit.DAYS.between(dias, finAnio));


        //Nombre del mes
        DateTimeFormatter anio=DateTimeFormatter.ofPattern("'El mes es' MMMM");
        System.out.println(dias.format(anio));

        //Nombre del día de la semana
        //Siglo al que pertenece
        //Tiempo transcurrido desde el 1 de Enero de 1970, en días, meses y años
        //Comprobar si el año de la fecha es bisiesto

       // Escribe un programa Java que resuelva las expresiones equivalentes para cada uno de
        // los siguientes enunciados:
        //10. Comprobar si la primera cifra de un número entero N de 3 cifras es impar


        //11. Comprobar si la primera cifra de un número entero N de 4 cifras es par
        //12. Comprobar si una variable A de tipo carácter contiene una letra mayúscula
        //13. Comprobar si una variable A de tipo carácter contiene una letra mayúscula o minúscula
        //14. Comprobar si una variable A de tipo carácter no contiene una letra mayúscula
        //15. Comprobar si una variable A de tipo carácter no contiene una letra mayúscula o minúscula
        //16. Comprobar si el contenido de la variable N termina en 0 ó en 7
        //17. Comprobar si el contenido de la variable precio es igual o mayor que 10€ y menor que 50€
        //18. Sumar el dígito más a la derecha de N al propio valor de N. Por ejemplo, si N contiene el valor 463 después de la operación contendrá el valor 466 ( 463 + 3 )
        //19. Comprobar si un número entero N de cuatro cifras es capicúa. Un número es capicúa si se puede leer igual de derecha a izquierda que de izquierda a derecha.
        //20. Una variable entera M contiene un número de mes. Comprobar si corresponde a un mes de 30 días.
        //21. Quitarle a un número entero N su última cifra. Supondremos que N tiene más de una cifra. Por ejemplo si N contiene el valor 123 después de la operación contendrá el valor 12.
        //22. Quitarle a un número entero N de 5 cifras su primera cifra. Por ejemplo si N contiene el valor 12345, después de la operación contendrá el valor 2345.
        //23. Comprobar si una variable C de tipo char contiene un dígito. (Carácter entre 0 y 9)
        //24. Dada dos variables enteras N y M de cuatro cifras, sumar las cifras de N y guardar la suma en la variable X, sumar las cifras de M y guardar la suma en la variable Y. Finalmente guarda en la variable Z la suma de X e Y.
        //25. Con DN, MN, AN  día, mes y año de nacimiento de una persona y DA, MA, AA día, mes y año actual, escribe la expresión algorítmica que compruebe si tiene 18 años cumplidos.




























    }





}


