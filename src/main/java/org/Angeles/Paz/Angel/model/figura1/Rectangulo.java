package org.Angeles.Paz.Angel.model.figura1;

import org.Angeles.Paz.Angel.util.ReadUtil;
import org.Angeles.Paz.Angel.vista.Menu;
import org.gerdoc.model.figura.figura.Figura;

public class Rectangulo extends Figura {

    private double base;
    private double altura;

    public Rectangulo() {
    }

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double area() {
        return base * altura;
    }

    @Override
    public double perimetro() {
        return 2 * (base + altura);
    }

    @Override
    public void leerDatos() {
        Menu.menuRectangulo();
        base = ReadUtil.getInstance().leerInt();
        altura = ReadUtil.getInstance().leerInt();
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}

