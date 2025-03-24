package org.Torres.Granados.Amaury.model.figura1;

import org.Torres.Granados.Amaury.util.ReadUtil;
import org.Torres.Granados.Amaury.vista.Menu;
import org.gerdoc.model.figura.figura.Figura;

public class Paralelogramo extends Figura {

    private double base;
    private double altura;

    public Paralelogramo(double basePara, double alturaPara, double anguloPara) {
    }

    public Paralelogramo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double area() {
        return base * altura;
    }

    @Override
    public double perimetro() {

        double lado = Math.sqrt(Math.pow(altura, 2) + Math.pow(base / 2, 2));
        return 2 * (base + lado);
    }

    @Override
    public void leerDatos() {
        Menu.menuParalelogramo();
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

