package mentor;

class SubClass extends SuperClass
{
	public static void main(String[] args)
	{
		hello();
		SuperClass.hello();
		
		// Commented-out the line below...
		// echo( args[0]);
		
		try
		{
			echo( args[0]);
		}
		catch(Exception e)
		{
			System.out.println( "Argument required" );
		} 
		
	}

	public static void hello()
	{
		System.out.println( "Hello from the Sub Class" );
	}
}
