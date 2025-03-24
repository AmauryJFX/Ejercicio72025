package org.Angeles.Paz.Angel.model.figura1;

import org.Angeles.Paz.Angel.util.ReadUtil;
import org.Angeles.Paz.Angel.vista.Menu;
import org.gerdoc.model.figura.figura.Figura;
public abstract class Triangulo extends Figura {

    protected double base;
    protected double altura;

    public Triangulo()
    {
    }

    public Triangulo(double base, double altura)
    {
        this.base = base;
        this.altura = altura;
    }

    public double area()
    {
        return (base*altura)/2;
    }

    public abstract double perimetro();

    public double getBase()
    {
        return base;
    }

    public void setBase(double base)
    {
        this.base = base;
    }

    public double getAltura()
    {
        return altura;
    }

    public void setAltura(double altura)
    {
        this.altura = altura;
    }

    @Override
    public void leerDatos()
    {
        Menu.menuBase();
        base = ReadUtil.getInstance().leerInt( );
        Menu.menuAltura();
        altura = ReadUtil.getInstance().leerInt( );
    }
}