package mentor;

import java.util.ArrayList;

class Lists 
{
	public static void main ( String[] args )
	{

        ArrayList<String> list = new ArrayList<String>() ;

        list.add( "Alpha" ) ;
        list.add( "Delta" ) ;
	list.add( "Charlie" ) ;
	System.out.println( "List: " + list ) ;

	System.out.println( "Replacing: " + list.get(1) + "\n" ) ;
	list.set( 1, "Bravo" ) ;

	list.forEach( (x) -> System.out.println("Item: " + x) ) ;

	} 
}