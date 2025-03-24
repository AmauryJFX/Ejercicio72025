package org.Torres.Granados.Amaury.vista;

import org.Torres.Granados.Amaury.model.figura1.Cuadrado;
import org.Torres.Granados.Amaury.util.ReadUtil;
import org.gerdoc.historial.Historiales;
import org.gerdoc.model.figura.figura.Figura;
import org.gerdoc.vista.Ejecutable;

import javax.swing.*;

public class Ventana extends JFrame implements Ejecutable
{
    private static Ventana ventana;
    private JLabel jLabel;
    private JTextField jTextField;
    private JButton jButton;

    private Ventana( )
    {
        super( "Ventana de figuras" );
        init( );
    }

    private void init()
    {
        jLabel = new JLabel( "Welcome" );
        jLabel.setBounds( 10,10, 100 , 20);
        jTextField = new JTextField( );
        jTextField.setBounds( 110, 10 , 100, 20 );
        jButton = new JButton( "Calcular" );
        jButton.setBounds( 10, 40, 70, 20 );
        jButton.addActionListener( p -> {
            Figura figura = new Cuadrado( );
            ((Cuadrado)figura).setLado( ReadUtil.string2Integer( jTextField.getText() ) );
            System.out.println( figura.area( ) );
            System.out.println( figura.perimetro( ) );
        } );
        getContentPane().setLayout( null );
        getContentPane().add( jLabel );
        getContentPane().add( jTextField );
        getContentPane().add( jButton );
        setDefaultCloseOperation( DISPOSE_ON_CLOSE );
    }

    public static Ventana getInstance( )
    {
        if( ventana == null )
        {
            ventana = new Ventana( );
        }
        return ventana;
    }

    @Override
    public void run()
    {
        setBounds( 100 , 100, 400, 300 );
        setVisible( true );
    }

    @Override
    public void addHistoriales(Historiales historiales) {

    }
}
