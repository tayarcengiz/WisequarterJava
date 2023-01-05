package mentor;

import java.text.NumberFormat;
import java.time.format.DateTimeFormatter;


class Formats
{
	public static void main(String[] args) 
	{		
		NumberFormat nf = NumberFormat.getNumberInstance();
		System.out.println( "\nNumber : " + nf.format(123456789) );
		
		NumberFormat cf = NumberFormat.getCurrencyInstance();
		System.out.println( "\nCurrency : " + cf.format(1234.50f) );

		NumberFormat pf = NumberFormat.getPercentInstance();
		System.out.println( "\nPercent : " +  pf.format(0.75f) );

		java.time.LocalDateTime now = java.time.LocalDateTime.now();

		DateTimeFormatter df = DateTimeFormatter.ofPattern("MMM d, yyy") ;
		System.out.println( "\nDate : " + now.format( df ) );

		DateTimeFormatter tf = DateTimeFormatter.ofPattern("h:m a") ;
		System.out.println( "\nTime : " + now.format( tf ) );
	}
}