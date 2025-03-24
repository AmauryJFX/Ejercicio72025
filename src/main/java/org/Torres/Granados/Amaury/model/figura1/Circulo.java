package org.Torres.Granados.Amaury.model.figura1;

import org.Torres.Granados.Amaury.util.ReadUtil;
import org.Torres.Granados.Amaury.vista.Menu;
import org.gerdoc.model.figura.figura.Figura;

public class Circulo extends Figura {

    private double radio;

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(radio, 2);
    }

    @Override
    public double perimetro() {
        return 2 * Math.PI * radio;
    }

    @Override
    public void leerDatos() {
        Menu.menuCirculo();
        radio = ReadUtil.getInstance().leerInt();
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
    }
}