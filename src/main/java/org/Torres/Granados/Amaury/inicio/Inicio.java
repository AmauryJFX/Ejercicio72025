package org.Torres.Granados.Amaury.inicio;

import org.Torres.Granados.Amaury.util.ReadUtil;
import org.Torres.Granados.Amaury.vista.Consola;
import org.Torres.Granados.Amaury.vista.Menu;
import org.Torres.Granados.Amaury.vista.Ventana;
import org.gerdoc.vista.Ejecutable;

public class Inicio {

    public Inicio() {
    }

    public static void main(String[] args) {

        boolean flag = true;
        int opcion;
        Ejecutable ejecutable;
        System.out.println("Hola Amaury 2");
        while( flag ) {

            ejecutable = null;
            Menu.principal2( );
            opcion = ReadUtil.getInstance( ).leerInt( );

            switch( opcion ) {

                case 1:
                    ejecutable = (Ejecutable) Consola.getInstance( );
                    break;

                case 2:
                    ejecutable = (Ejecutable) Ventana.getInstance( );
                    break;

                case 3:
                    flag = false;
                    break;

                default:
                    Menu.opcionInvalida( );
            }

            if( ejecutable != null ) {

                ejecutable.run( );
            }
        }
    }

}