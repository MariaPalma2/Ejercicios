package temauno.ejercicios;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

/**
 * Clase para realizar el exámen
 * de programación
 * @author José Julio
 * @version 1.0
 */
public class ExamenTemaUno {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		final int NUMERO_DERECHA = 393;
		final int NUMERO_CAPICUA_4_CIFRAS = 2882;
		// 6. Comenta y documenta todo el código resultante de
		// responder a las siguientes preguntas (1 punto, i)

		// 7. Sumar el dígito más a la derecha de un número entero
		// al propio valor de dicho número. Por ejemplo, si el número
		// contiene el valor 463 después de la operación contendrá el
		// valor 466 ( 463 + 3 )(1,5 puntos: e)
		// Inicializo una variable String en el que le guardo la constante
		// NUMERO_DERECHA de tipo int a String para poder tratar el último
		// número
		String numeroDerechaString = String.valueOf(NUMERO_DERECHA);
		// Guardo en otra variable String el último carácter de la cadena,
		// que equivaldría al último número. Esto lo hago con el método
		// length de String para poder saber la longitud de la cadena - 1
		// y con charAt cojo la posición del último carácter.
		String unString = "Hola Mundo";
		String lastCharacter = String.valueOf(unString.charAt(unString.length() - 1));
		String ultimoNumeroString = String.valueOf(numeroDerechaString.charAt(
				numeroDerechaString.length() - 1));
		// Una vez que tengo el último número, para poder sumarlo, lo paso
		// de nuevo a un int, así que uso el método parseInt de la clase
		// Integer para parsear el último número en String a int
		int ultimoNumero = Integer.parseInt(ultimoNumeroString);
		// Almaceno en una variable int el resultado del número original
		// sumado de su último número
		int resultadoNumeroDerecha = NUMERO_DERECHA + ultimoNumero;
		System.out.println(NUMERO_DERECHA + " + " + ultimoNumero + " = " + 
				resultadoNumeroDerecha);

		// 8. Una variable entera contiene un número de mes.
		// Comprobar si corresponde a un mes de 30 días (2,5 puntos: f).
		int mes = 6;
		// Con el método getValue de la clase Month consigo el mes de quiero
		// referenciar y lo comparo con el mes de la variable int mes
		System.out.println(mes == Month.APRIL.getValue() || mes == Month.JUNE.getValue() ||
				mes == Month.SEPTEMBER.getValue() || mes == Month.NOVEMBER.getValue()
				? "Tiene 30 días"
				: "No tiene 30 días");
		

		// 9. Comprobar si un número entero de cuatro cifras es capicúa.
		// Un número es capicúa si se puede leer igual de derecha a
		// izquierda que de izquierda a derecha (2,5 puntos: h)
		// Inicializo una variable de tipo String en el guardo el valor de
		// la constante NUMERO_CAPICUA_4_CIFRAS pero en String para poder
		// tratar sus números, de manera que los invertiré.
		String numeroCapicua4CifrasString = String.valueOf(NUMERO_CAPICUA_4_CIFRAS);
		// Inicializo cuatro variables de tipo String en el que almaceno cada número
		// de la variable String anterior, de manera individual. Esto lo hago con
		// el método substring, que cojo el carácter desde una posición inicial hasta
		// una posición final
		String primerNumeroCapicua = numeroCapicua4CifrasString.substring(0, 1);
		String segundoNumeroCapicua = numeroCapicua4CifrasString.substring(1, 2);
		String tercerNumeroCapicua = numeroCapicua4CifrasString.substring(2, 3);
		String cuartoNumeroCapicua = numeroCapicua4CifrasString.substring(3, 4);
		// Inicializo una variable String en el que guardo cada carácter del número
		// que quiero averiguar si es capicúa pero de manera inversa, para después
		// comparar esta variable con el String original. Uso el método concat para
		// concatenar las cadenas con el siguiente carácter correspondiente. Por ejemplo,
		// concateno la variable cuartoNumeroCapicua con el tercerNumeroCapicua y así,
		// de manera que lo pongo a la inversa
		String numeroCapicua4CifrasReverso = cuartoNumeroCapicua.concat(tercerNumeroCapicua
				.concat(segundoNumeroCapicua.concat(primerNumeroCapicua)));
		System.out.println(numeroCapicua4CifrasString.equals(numeroCapicua4CifrasReverso)
				? "Es capicúa"
				: "No es capicúa");

		// 10. Utiliza un operador unario sobre el mes de una fecha
		// introducida por consola. Explica el uso de dicho operador
		// en todas sus variantes. Después, muestra el número de días
		// transcurridos desde la fecha introducida y tu fecha de
		// cumpleaños (2,5 puntos: g)
		System.out.println("Introduce una fecha con formato YYYY-MM-DD");
		// Guardo una fecha introducida por consola (String) con el método
		// next de la clase Scanner, y ese tipo String lo parseo a tipo
		// LocalDate con el método estático parse de la clase LocalDate
		// para finalmente, introducirla en el objeto fechaIntroducida.
		LocalDate fechaIntroducida = LocalDate.parse(input.next());
		
		// Almaceno el mes de la fecha en formato numérico en una variable
		// de tipo int
		int mesFecha = fechaIntroducida.getMonthValue();
		// Imprimo por consola el mes de la fecha aumentado en +1 por el
		// operador unario prefijo, por ejemplo, si introduzco una fecha
		// con mes marzo (3), la variable mesFecha valdrá 3 y al utilizar
		// el operador unario prefijo, primero aumentará su valor (4) y
		// desupués lo imprimirá por pantalla, por lo que sumará 4 meses
		// saldrá julio. Para aumentar el mes, usaré el método plusMonths
		System.out.println("El mes de la fecha a aumentado " + (mesFecha + 1) +
				" mes/meses: " + fechaIntroducida.plusMonths(++mesFecha));
		// Ahora imprimiré la fecha pero restándole uno con el operador
		// prefijo de nuevo, así que si la variable mesFecha vale 4,
		// restará 1 mes, por lo que mesFecha vale 3 y se restarían 3 meses,
		// por lo que el mes que saldría sería diciembre del año pasado.
		// Para restar meses, uso el método minusMonths.
		System.out.println("El mes de la fecha a disminuido " + (mesFecha + 1) +
				" mes/meses: " + fechaIntroducida.minusMonths(--mesFecha));
		
		// Almaceno en un objeto de tipo LocalDate mi fecha de nacimiento
		// con el método estático of de la clase LocalDate
		LocalDate fechaCumpleanios = LocalDate.of(2022, 4, 2);
		// Inicializo una variable de tipo 
		long diferenciaFechas = ChronoUnit.DAYS.between(fechaIntroducida, fechaCumpleanios);
		System.out.println("La diferencia entre la fecha introducida y tu"
				+ " fecha de cumpleaños es de: " +
				diferenciaFechas + " días.");
	}
}