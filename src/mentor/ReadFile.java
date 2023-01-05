package mentor;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class ReadFile
{
	public static void main( String[] args )
	{
		try
		{
			FileReader file = new FileReader( "Oscar.txt" ) ;

			BufferedReader buffer = new BufferedReader( file );

			String line = "" ;

			while( ( line = buffer.readLine() ) != null )
			{
				System.out.println( line ) ;
			}

			buffer.close() ;
		}
		catch( IOException e )
		{
			System.out.println( "A read error has occurred." ) ;
		}
	}
}
