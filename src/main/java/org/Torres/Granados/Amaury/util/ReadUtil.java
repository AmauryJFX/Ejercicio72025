package org.Torres.Granados.Amaury.util;

import java.util.Scanner;

public class ReadUtil {
    private Scanner scanner;
    private static ReadUtil readUtil;

    private ReadUtil() {
        scanner = new Scanner(System.in); // Se inicializa en el constructor
    }

    public static ReadUtil getInstance() {
        if (readUtil == null) {
            readUtil = new ReadUtil();
        }
        return readUtil;
    }

    public String leer() {
        return scanner.next();
    }

    public Integer leerInt() {
        while (true) {
            try {
                return Integer.parseInt(leer());
            } catch (NumberFormatException e) {
                System.out.println("No es un entero válido. Inténtalo de nuevo:");
            }
        }
    }

    public static Integer string2Integer(String cadena) {
        try {
            return Integer.parseInt(cadena);
        } catch (NumberFormatException e) {
            System.out.println("No es un entero válido.");
            return null;
        }
    }

    public double leerDouble(String mensaje) {
        System.out.println(mensaje);
        while (true) {
            try {
                return Double.parseDouble(leer());
            } catch (NumberFormatException e) {
                System.out.println("No es un número decimal válido. Inténtalo de nuevo:");
            }
        }
    }
}
