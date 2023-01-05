package mentor;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Lotto extends JFrame implements ActionListener
{
	// Components.
	ClassLoader ldr = this.getClass().getClassLoader();
	java.net.URL iconURL = ldr.getResource("Lotto.png");
	ImageIcon icon 	= new ImageIcon( iconURL );		
	JLabel img  	= new JLabel(icon);	
	JTextField txt 	= new JTextField( "", 18 );
	JButton btn 	= new JButton( "Get My Lucky Numbers" );
	JPanel pnl  	= new JPanel();

	// Constructor.
	public Lotto()
	{
		super( "Lotto App" ); 
		setSize( 260,210 );
		setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );		
		pnl.add( img ); 
		pnl.add( txt ); 
		pnl.add( btn );
		btn.addActionListener( this );
		add( pnl ); 
		setVisible( true );
	}

	// Event-handler.
	public void actionPerformed( ActionEvent event )
	{
		if( event.getSource() == btn )
		{
			// Declare working variables.
			int[] nums = new int[60];
			String str = "";

			// Fill elements 1-59 with integers 1-59.
			for( int i = 1; i < 60; i++ ) { nums[i] = i; }
		
			// Shuffle the values in elements 1-59.
			for( int i = 1; i < 60; i++ )
			{
				int r = (int) ( Math.random() * 59 ) + 1;
				int t=nums[i]; nums[i]=nums[r]; nums[r]=t;
			}

			// Display the values in elements one to six.
			for ( int i = 1; i < 7; i++ )
			{
				str += "  " + Integer.toString(nums[ i ]) + "  ";

			}
			txt.setText( str );
		}
	}

	// Entry point.
	public static void main ( String[] args )
	{
		Lotto lotto = new Lotto();
	} 
}

