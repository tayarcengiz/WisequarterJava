package mentor;

class Else
{
	public static void main( String[] args )
	{
		int hrs = 11;

		if ( hrs < 13 )
		{
			System.out.println( "Good morning: " + hrs );	
		}
		else if ( hrs < 18 )
		{
			System.out.println( "Good afternoon: " + hrs );	
		}
		else System.out.println( "Good evening: " + hrs );
	}
}
