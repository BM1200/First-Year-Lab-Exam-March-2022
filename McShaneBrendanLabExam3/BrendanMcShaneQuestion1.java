//00410478
//Brendan McShane

import java.util.Scanner;
import java.io.*;

public class BrendanMcShaneQuestion1
{
	public static void main(String[] args) throws IOException
	{

		String readFile, writeFile, contents;
		Scanner keyboard = new Scanner(System.in);

		File myFile = new File("Tuesday.txt");

		Scanner inputFile = new Scanner(myFile);




		for(int i = 1; i <= 10; i++)
		{
		String str = inputFile.nextLine();
		System.out.println(str);
		i++;
		}
		inputFile.close();

	}
}