package mentor;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Request extends JFrame implements ActionListener
{
	JPanel pnl = new JPanel() ;

	JTextField field = new JTextField( 38 ) ;
	JButton btn1 = new JButton( "Request Decision" ) ;	
	JButton btn2 = new JButton( "Request Input" ) ;

	public Request()
	{
		super( "Swing Window" );
		setSize( 500,200 );
		setDefaultCloseOperation( EXIT_ON_CLOSE );
		add(pnl);
		
		pnl.add( field );
		pnl.add( btn1 ) ;			
		pnl.add( btn2 ) ;

		btn1.addActionListener(this);		
		btn2.addActionListener(this);

		setVisible( true );
	}

	public void actionPerformed( ActionEvent event )
	{
		if( event.getSource() == btn1 ) 
		{
			int n = JOptionPane.showConfirmDialog( this,"Do you agree?","Confirmation Dialog",JOptionPane.YES_NO_CANCEL_OPTION);	
			
			switch( n )
			{
				case 0 : field.setText("Agreed"); break;	
				case 1 : field.setText("Disagreed"); break;
				case 2 : field.setText("Cancelled"); break;
			}
		}		
		
		if( event.getSource() == btn2 )
		{
			field.setText(JOptionPane.showInputDialog( this,"Enter your comment","Input Dialog",JOptionPane.PLAIN_MESSAGE) ); 
		}
	}

	public static void main( String[] args )
	{
		Request gui = new Request();
	}
}

