package org.Torres.Granados.Amaury.vista;

import org.gerdoc.model.figura.figura.Figura;

public class Menu extends Figura
{
    public static void principal() {
        System.out.println("Welcome a la Consola de Amaury");
        System.out.println("Selecciona una opción");
        System.out.println("1.- Cuadrado");
        System.out.println("2.- Equilátero");
        System.out.println("3.- Isósceles");
        System.out.println("4.- Escaleno");
        System.out.println("5.- Rectángulo");
        System.out.println("6.- Paralelogramo");
        System.out.println("7.- Círculo");
        System.out.println("9.- Salir");
    }

    public static void opcionInvalida() {
        System.out.println("Opción inválida");
    }

    public static void print(Figura figura) {
        System.out.println("El perímetro es: " + figura.perimetro());
        System.out.println("El área es: " + figura.area());
    }

    public static void principal2() {
        System.out.println("Welcome");
        System.out.println("Selecciona una opción");
        System.out.println("1.- Consola");
        System.out.println("2.- Ventana");
        System.out.println("3.- Salir");
    }

    public static void menuCuadrado() {
        System.out.println("Dame un lado");
    }

    public static void menuBase() {
        System.out.println("Dame una base");
    }

    public static void menuAltura() {
        System.out.println("Dame una altura");
    }

    public static void menuLado1() {
        System.out.println("Dame un lado 1");
    }

    public static void menuLado2() {
        System.out.println("Dame un lado 2");
    }

    public static void menuLado3() {
        System.out.println("Dame un lado 3");
    }

    public static void menuRectangulo() {
        System.out.println("Dame la base del rectángulo");
        System.out.println("Dame la altura del rectángulo");
    }

    public static void menuParalelogramo() {
        System.out.println("Dame la base del paralelogramo");
        System.out.println("Dame la altura del paralelogramo");
    }

    public static void menuCirculo() {
        System.out.println("Dame el radio del círculo");
    }

    @Override
    public double area() {
        return 0;
    }

    @Override
    public double perimetro() {
        return 0;
    }

    @Override
    public void leerDatos() {

    }
}
