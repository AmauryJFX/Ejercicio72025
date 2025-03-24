package org.gerdoc.model.figura.figura;

import org.gerdoc.vista.SolicitaDatos;

/**
 * 
 */
public abstract class Figura implements SolicitaDatos
{

    /**
     * Default constructor
     */


    public Figura()
    {
    }

    /**
     * @return
     */
    public abstract double area( );

    /**
     * @return
     */
    public abstract double perimetro();
}