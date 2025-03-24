package org.Torres.Granados.Amaury.vista;

import org.Torres.Granados.Amaury.model.figura1.*;
import org.Torres.Granados.Amaury.model.figura2.Escaleno;
import org.Torres.Granados.Amaury.model.figura2.Isosceles;
import org.Torres.Granados.Amaury.util.ReadUtil;
import org.gerdoc.historial.Historiales;
import org.gerdoc.model.figura.figura.Figura;
import org.gerdoc.vista.Ejecutable;
import org.gerdoc.vista.SolicitaDatos;

public class Consola implements Ejecutable {
    private static Consola consola;
    private Historiales historiales;

    private Consola() {
    }

    public static Consola getInstance() {
        if (consola == null) {
            consola = new Consola();
        }
        return consola;
    }
    @Override
    public void run() {
        ejecutar();
    }

    public void ejecutar() {
        boolean flag = true;
        int opcion = 0;
        Figura figura = null;

        while (flag) {
            figura = null;
            Menu.principal();
            opcion = ReadUtil.getInstance().leerInt();
            switch (opcion) {
                case 1:
                    figura = new Cuadrado();
                    break;
                case 2:
                    figura = new Equilatero();
                    break;
                case 3:
                    figura = new Isosceles();
                    break;
                case 4:
                    figura = new Escaleno();
                    break;
                case 5:
                    figura = new Rectangulo();
                    break;
                case 6:
                    double basePara = ReadUtil.getInstance().leerDouble("Ingrese la base del paralelogramo:");
                    double alturaPara = ReadUtil.getInstance().leerDouble("Ingrese la altura del paralelogramo:");
                    double anguloPara = ReadUtil.getInstance().leerDouble("Ingrese el ángulo del paralelogramo:");
                    figura = new Paralelogramo(basePara, alturaPara, anguloPara);
                    break;
                case 7:
                    figura = new Circulo();
                    break;
                case 9:
                    flag = false;
                    break;
                default:
                    Menu.opcionInvalida();
            }
            if (figura != null) {
                if (figura instanceof SolicitaDatos) {
                    ((SolicitaDatos) figura).leerDatos();
                }
                // Agregar la figura al historial
                historiales.addFigura(figura);
                Menu.print(figura);
            }
        }
    }

    public void addHistoriales(Historiales historiales) {
        this.historiales = historiales;
    }
}
