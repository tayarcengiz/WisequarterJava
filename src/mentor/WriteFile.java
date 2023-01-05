package mentor;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

class WriteFile
{
	public static void main( String[] args )
	{
		try
		{	
			FileWriter file = new FileWriter( "Tam.txt" );

			BufferedWriter buffer = new BufferedWriter( file );

			buffer.write("The wind blew as if it had blown its last");
				buffer.newLine();
			buffer.write("The rattling showers rose on its blast");
				buffer.newLine();
			buffer.write("The speedy gleams the darkness swallowed");
				buffer.newLine();
			buffer.write("Loud, deep and long the thunder bellowed");
				buffer.newLine();
			buffer.write("That night a child might understand");
				buffer.newLine();
			buffer.write("The devil had business on his hand.");

			buffer.close();
		}
		catch( IOException e )
		{
			System.out.println( "A write error has occurred." );
		}
	}
}
