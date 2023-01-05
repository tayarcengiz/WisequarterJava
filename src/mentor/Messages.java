package mentor;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Messages extends JFrame implements ActionListener
{
	JPanel pnl = new JPanel() ;

	JButton btn1 = new JButton( "Show Information Message" ) ;	
	JButton btn2 = new JButton( "Show Warning Message" ) ;
	JButton btn3 = new JButton( "Show Error Message" ) ;

	public Messages()
	{
		super( "Swing Window" );
		setSize( 500,200 );
		setDefaultCloseOperation( EXIT_ON_CLOSE );
		add(pnl);

		pnl.add( btn1 ) ;			
		pnl.add( btn2 ) ;
		pnl.add( btn3 ) ;
		
		btn1.addActionListener(this);		
		btn2.addActionListener(this);
		btn3.addActionListener(this);
	
		setVisible( true );
	}

	public void actionPerformed( ActionEvent event )
	{
		if( event.getSource() == btn1) 
		JOptionPane.showMessageDialog( this,"Information...","Message Dialog",JOptionPane.INFORMATION_MESSAGE );	
		
		if( event.getSource() == btn2)
		JOptionPane.showMessageDialog( this,"Warning...","Message Dialog",JOptionPane.WARNING_MESSAGE);	
		
		if( event.getSource() == btn3)
		JOptionPane.showMessageDialog( this,"Error...","Message Dialog",JOptionPane.ERROR_MESSAGE);	
	}

	public static void main( String[] args )
	{
		Messages gui = new Messages();
	}
}
