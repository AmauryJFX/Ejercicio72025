package org.gerdoc.historial;
import org.gerdoc.model.figura.figura.Figura;
import java.util.ArrayList;
import java.util.List;

public class Historial implements Historiales
{
    private static Historial historial;
    private List<Figura> list;

    private Historial(){}
    public static Historial getInstance( )
    {
        if( historial == null )
        {
            historial = new Historial( );
        }
        return historial;
    }
    @Override
    public void addFigura( Figura figura)
    {
        if( list == null)
        {
            list = new ArrayList<Figura>();
        }
        list.add( figura );
    }
    @Override
    public void imprimir( )
    {
        if( list == null || list.isEmpty() )
        {
            System.out.println( "Historial vacio");
            return;
        }
        System.out.println( "Inicio del Historial");
        list.forEach( (p ) -> {
            System.out.println( "El área es: " + p.area() );
            System.out.println("El perímetro es: " + p.perimetro() );
        } );
        System.out.println( "Fin del Historial");
    }
}
