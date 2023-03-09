//00410478
//Brendan McShane

import java.util.Scanner;
public class BrendanMcShaneQuestion4
{
	public static void main(String[] args)
	{
		//for c5 where I need to input my own data
		Scanner keyboard = new Scanner(System.in);


		Clothes c1 = new Clothes("Trousers");
		Clothes c2 = new Clothes("Shirt", "Calvin Klein", 34.99f, true);
		Clothes c3 = new Clothes(32.99f, false);
		Clothes c4 = new Clothes();

		System.out.println("Enter details for object 5");

		//asking for details and saving them as variables
		System.out.println("Enter garment type :");
		String g = keyboard.nextLine();

		System.out.println("Enter brand: ");
		String b = keyboard.nextLine();

		System.out.println("Enter item price: ");
		float p = keyboard.nextFloat();

		System.out.println("Is item available?");
		boolean s = keyboard.nextBoolean();

		Clothes c5 = new Clothes(g, b, p, s);

		//printing everything out to the system
		System.out.println();
		System.out.println("Object 1");
		System.out.println("GARMENT: " + c1.getGarment());
		System.out.println("BRAND: " + c1.getBrand());
		System.out.println("PRICE: " + c1.getPrice());
		System.out.println("STOCK: " + c1.getStock());
		System.out.println();

		System.out.println("Object 2");
		System.out.println("GARMENT: " + c2.getGarment());
		System.out.println("BRAND: " + c2.getBrand());
		System.out.println("PRICE: " + c2.getPrice());
		System.out.println("STOCK: " + c2.getStock());
		System.out.println();

		System.out.println("Object 3");
		System.out.println("GARMENT: " + c3.getGarment());
		System.out.println("BRAND: " + c3.getBrand());
		System.out.println("PRICE: " + c3.getPrice());
		System.out.println("STOCK: " + c3.getStock());
		System.out.println();

		System.out.println("Object 4");
		System.out.println("GARMENT: " + c4.getGarment());
		System.out.println("BRAND: " + c4.getBrand());
		System.out.println("PRICE: " + c4.getPrice());
		System.out.println("STOCK: " + c4.getStock());
		System.out.println();

		System.out.println("Object 5");
		System.out.println("GARMENT: " + c5.getGarment());
		System.out.println("BRAND: " + c5.getBrand());
		System.out.println("PRICE: " + c5.getPrice());
		System.out.println("STOCK: " + c5.getStock());
		System.out.println();
	}
}