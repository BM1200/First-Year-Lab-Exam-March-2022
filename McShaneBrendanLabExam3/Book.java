//G00410478
//Brendan McShane

public class Book
{
	//declaring variables
	private String name;
	private String author;
	private double price;
	private int pages;
	private double reduction;


	//calling all getter and setters I need
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return name;
	}
	public void setAuthor(String author)
	{
		this.author = author;
	}
	public String getAuthor()
	{
		return author;
	}
	public void setPrice(double price)
	{
		this.price = price;
	}
	public double getPrice()
	{
		return price;
	}
	public void setPages(int pages)
	{
		this.pages = pages;
	}
	public int getPages()
	{
		return pages;
	}
	public void setReduction(double reduction)
	{
		this.reduction = reduction;
	}
	public double getReduction()
	{
		return reduction = price *.90;
	}
}