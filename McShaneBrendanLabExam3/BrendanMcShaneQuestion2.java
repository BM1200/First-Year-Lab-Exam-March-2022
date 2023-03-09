//00410478
//Brendan McShane
public class BrendanMcShaneQuestion2
{
	//Main method
	public static void main(String[] args)
	{
		//three arguments
		weekly("Alice", "Smith", 35000);
		System.out.println();
		weekly("Bob", "Jones", 20000);
		System.out.println();
		weekly("Charlie", "Smith", 28000);
	}

	//static method
	public static void weekly(String first, String last, double num)
	{
		System.out.println("The weekly wage of " + first + " " + last +  " is " + (num/52));

		//if else statement
		if(num < 25000)
		{
			System.out.println(first + " is in tax band C");
		}
		else if(num >= 25000 && num < 30000)
		{
			System.out.println(first + " is in tax band B");
		}
		else
		{
			System.out.println(first + " is in tax band A");
		}
	}
}