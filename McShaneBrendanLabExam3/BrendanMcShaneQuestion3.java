//00410478
//Brendan McShane

public class BrendanMcShaneQuestion3
{
	public static void main(String[] args)
	{
		Book b1 = new Book();
		b1.setName("Harry Potter");
		b1.setAuthor("J.K. Rowling");
		b1.setPrice(10.99);
		b1.setPages(250);

		Book b2 = new Book();
		b2.setName("The Catcher in the Rye");
		b2.setAuthor("J.D. Salinger");
		b2.setPrice(8.99);
		b2.setPages(192);

		Book b3 = new Book();
		b3.setName("Wuthering Heights");
		b3.setAuthor("Emily Bronte");
		b3.setPrice(14.99);
		b3.setPages(422);


		//Printing them all out to the system
		System.out.println(b1.getName());
		System.out.println(b1.getAuthor());
		System.out.println(b1.getPrice());
		System.out.println(b1.getPages() + "\n");

		System.out.println(b2.getName());
		System.out.println(b2.getAuthor());
		System.out.println(b2.getPrice());
		System.out.println(b2.getPages() + "\n");

		System.out.println(b3.getName());
		System.out.println(b3.getAuthor());
		System.out.println(b3.getPrice());
		System.out.println(b3.getPages() + "\n");

		//getting reduction for price of books
		System.out.println("Reduced price for quantity of 1 Harry Potter book is " + b1.getReduction());
		System.out.println("Reduced price for quantity of 4 Harry Potter book is " + (b1.getReduction() * 4));


	}
}