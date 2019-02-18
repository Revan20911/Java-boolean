import java.util.*;
public class helloworld
{
	public static void main(String args[]) 
	{
		
	System.out.println("How many machines were purchased? ");
	Scanner sc = new Scanner(System.in);
	int mc = sc.nextInt();
	System.out.println("What is the price per unit? ");
	int p = sc.nextInt();
	
	if( mc >= 10 && mc <=  20 ) {
		System.out.println("Your discounted price is "+"$"+((mc*p)*0.10));
	}
	if (mc >= 21 && mc <= 50 ) {
		System.out.println("Your discounted price is "+"$"+((mc*p)*0.20));
		
	}
	if ( mc >= 51 && mc <= 100) {
		System.out.println("Your discounted price is "+"$"+((mc*p)*0.30));
		
	}
	if ( mc > 100) {
		System.out.println("Your discounted price is "+"$"+((mc*p)*0.40));
	}
	
	
	
	
	
		
		
	
		
	
	}
}
