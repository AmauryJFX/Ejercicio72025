package org.Angeles.Paz.Angel.model.figura1;

import org.Angeles.Paz.Angel.util.ReadUtil;
import org.Angeles.Paz.Angel.vista.Menu;
import org.gerdoc.model.figura.figura.Figura;

/**
 *
 */
public class Cuadrado extends Figura
{

    private double lado;

    public Cuadrado()
    {
    }

    public Cuadrado(double lado)
    {
        this.lado = lado;
    }

    @Override
    public double area()
    {
        return lado*lado;
    }

    @Override
    public double perimetro()
    {
        return lado*4;
    }

    @Override
    public void leerDatos()
    {
        Menu.menuCuadrado( );
        lado = ReadUtil.getInstance().leerInt( );
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
}