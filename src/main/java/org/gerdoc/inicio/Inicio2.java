package org.gerdoc.inicio;

import org.gerdoc.historial.Historial;
import org.gerdoc.historial.Historiales;
import org.gerdoc.model.figura.figura.Figura;
import org.gerdoc.util.ReadUtil;
import org.gerdoc.vista.Consola;
import org.gerdoc.vista.Ejecutable;
import org.gerdoc.vista.Menu;
import org.gerdoc.vista.Ventana;


/**
 *
 */
public class Inicio2 extends Figura{


    /**
     * Default constructor
     */
    public Inicio2()
    {
    }

    @Override
    public double area() {
        return 0;
    }

    @Override
    public double perimetro() {
        return 0;
    }

    /**
     * @param args
     */
    public static void main(String[] args)
    {
        boolean flag = true;
        int opcion = 0;
        Ejecutable ejecutable = null;
        Historiales historiales = null;
        historiales = Historial.getInstance( );
        System.out.println("Hola Amaury");
        while( flag )
        {
            ejecutable = null;
            Menu.principal2( );
            opcion = ReadUtil.getInstance( ).leerInt( );
            switch( opcion )
            {
                case 1:
                    ejecutable = Consola.getInstance( );
                    break;
                case 2:
                    ejecutable = Ventana.getInstance( );
                    break;
                case 3:

                    ejecutable = org.Angeles.Paz.Angel.vista.Consola.getInstance( );
                    break;
                case 4:
                    ejecutable = org.Torres.Granados.Amaury.vista.Consola.getInstance( );
                    break;
                case 5:
                    historiales.imprimir();
                    break;
                case 6:
                    flag = false;
                    break;
                default:
                    Menu.opcionInvalida( );
            }
            if( ejecutable != null )
            {
                ejecutable.addHistoriales( historiales );
                ejecutable.run( );
            }
        }



    }

    @Override
    public void leerDatos() {

    }
}