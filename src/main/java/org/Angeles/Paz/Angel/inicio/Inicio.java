package org.Angeles.Paz.Angel.inicio;

import org.Angeles.Paz.Angel.util.ReadUtil;
import org.Angeles.Paz.Angel.vista.Consola;
import org.Angeles.Paz.Angel.vista.Menu;
import org.Angeles.Paz.Angel.vista.Ventana;
import org.gerdoc.vista.Ejecutable;

public class Inicio {

    public Inicio() {
    }

    public static void main(String[] args) {

        boolean flag = true;
        int opcion;
        Ejecutable ejecutable;
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