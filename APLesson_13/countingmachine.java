import java.util.ArrayList;
import java.util.Scanner;
public class countingmachine
{   
    public static void main(String[]args)
	{
		double total = 0;
	    ArrayList<Money> inventory = new ArrayList<Money>();
	    
	
	Scanner kb = new Scanner(System.in);
	System.out.println("please enter your bills and coins");
	String cash = kb.nextLine();
	Scanner scan = new Scanner(cash);
	
	while(scan.hasNext())
	{
		String x = scan.next();
		
		for(money b : inventory)
		{
			if(b.scan().(x) || b.getName().equals(x))
			{
				b.setCount(b.getCount()+1);
			}
		}
	}
	 for(money x : inventory)
	 {
		 total += x.getValue() * x.getCount();
	 }
	 System.out.println(total);
	}
	
}