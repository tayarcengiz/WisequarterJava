package mentor;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Actions extends JFrame implements ActionListener
{
	JPanel pnl = new JPanel() ;

	JButton btn1 = new JButton( "Button 1" ) ;
	JButton btn2 = new JButton( "Button 2" ) ;
	JTextArea txtArea = new JTextArea( 5 , 38 ) ;

	public Actions()
	{
		super("Swing Window");
		setSize( 500,200 );
		setDefaultCloseOperation( EXIT_ON_CLOSE );
		add(pnl);

		pnl.add( btn1 ) ;
		pnl.add( btn2 ) ;
		pnl.add( txtArea ) ;
		
		btn2.setEnabled( false ) ;
		txtArea.setText( "Button 2 is Disabled" ) ;

		btn1.addActionListener(this);
		btn2.addActionListener(this);
		
		setVisible( true );
	}

	public void actionPerformed( ActionEvent event )
	{
		txtArea.setText( event.getActionCommand() + " Clicked and Disabled" ) ;
		
		if( event.getSource() == btn1) 
		{
			btn2.setEnabled( true ); 
			btn1.setEnabled( false ) ;
		}		
		
		if( event.getSource() == btn2)
		{
			btn1.setEnabled( true );
			btn2.setEnabled( false ) ;
		}	
	}

	public static void main( String[] args )
	{
		Actions gui = new Actions();
	}
}
