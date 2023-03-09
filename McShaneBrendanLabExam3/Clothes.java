//00410478
//Brendan McShane

public class Clothes
{
	//declaring variables
	private String garment;
	private String brand;
	private float price;
	private boolean stock;

	//creating constructors
	public Clothes(String garment)
	{
		this.garment = garment;
	}
	public Clothes(String garment, String brand, float price, boolean stock)
	{
		this.garment = garment;
		this.brand = brand;
		this.price = price;
		this.stock = stock;
	}
	public Clothes(float price, boolean stock)
	{
		this.price = price;
		this.stock = stock;
	}
	//no arg constructor
	public Clothes()
	{
	}
	//getters and setters
	public void setGarment(String garment)
	{
		this.garment = garment;
	}
	public String getGarment()
	{
		return garment;
	}
	public void setBrand(String brand)
	{
		this.brand = brand;
	}
	public String getBrand()
	{
		return brand;
	}
	public void setPrice(float price)
	{
		this.price = price;
	}
	public float getPrice()
	{
		return price;
	}
	public void setStock(boolean stock)
	{
		this.stock = stock;
	}
	public boolean getStock()
	{
		return stock;
	}
}