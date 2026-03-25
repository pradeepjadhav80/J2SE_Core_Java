import java.util.*;
import java.io.*;

public class Equilateral
{
	public static void main(String args[])
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try 
		{
			System.out.print("Enter the First length of the triangle : ");
			double num1 = Double.parseDouble(br.readLine());

			System.out.print("Enter the Second length of the traingle : ");
			double num2 = Double.parseDouble(br.readLine());

			System.out.print("Enter the Third length of the traingle : ");
			double num3 = Double.parseDouble(br.readLine());

			if(num1+num2 > num3 && num2+num3 > num1 && num3+num1 > num2)
			{
				if(num1 == num2 && num2 == num3)
				{
					System.out.println("Equilateral Triangle !!");
				}
				else if(num1 == num2 || num2 == num3 || num3 == num1)
				{
					System.out.println("Isosceles Triangle !!");
				}
				else 
				{
					System.out.println("Scalene Triangle !!");
				}
			}
			else 
			{
				System.out.println("Invalid Triangle !!");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}

