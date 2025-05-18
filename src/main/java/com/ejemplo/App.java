package com.ejemplo;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args) {
        System.out.println("Demostración de la aplicación");
        
        Calculadora calc = new Calculadora();
        System.out.println("Suma de 5 + 3 = " + calc.sumar(5, 3));
        
        Validador val = new Validador();
        System.out.println("¿Es 4 un número par? " + val.esPar(4));
        
        Conversor conv = new Conversor();
        System.out.println("25°C en Fahrenheit es: " + conv.celsiusAFahrenheit(25));
    }
}
