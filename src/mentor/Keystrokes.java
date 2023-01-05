package mentor;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

class Keystrokes extends JFrame implements KeyListener 
{
	JPanel pnl = new JPanel();

	JTextField field  = new JTextField( 38 ) ;	
	JTextArea txtArea = new JTextArea( 5, 38 ) ;

	public Keystrokes()
	{
		super( "Swing Window" );
		setSize( 500,200 );
		setDefaultCloseOperation( EXIT_ON_CLOSE );
		add(pnl);
		
		pnl.add( field );	
		pnl.add( txtArea );
		
		field.addKeyListener( this ) ; 
	
		setVisible( true );
	}

	public void keyPressed( KeyEvent event )	
	{
		txtArea.setText("Key Pressed") ;
	}

	public void keyTyped( KeyEvent event )	
	{
		txtArea.append("\nCharacter : " + event.getKeyChar()) ;
	}
	
	public void keyReleased( KeyEvent event )	
	{
		int keyCode = event.getKeyCode();
		txtArea.append( "\nKey Code : " + keyCode );
		txtArea.append( "\nKey Text : " + event.getKeyText(keyCode));
	}


	public static void main ( String[] args )
	{
		Keystrokes gui = new Keystrokes();
	} 
}

