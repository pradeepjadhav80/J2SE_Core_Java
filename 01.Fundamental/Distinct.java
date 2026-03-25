import java.io.*;

public class Distinct
{
	public static void main(String args[])
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try 
		{
			System.out.print("Enter the 3-digit number : ");
			int num = Integer.parseInt(br.readLine());

			if (num > 99 && num <1000) 
			{
				int firstDigit = num/100;
				int middelDigit = (num/10)%10;
				int lastDigit = num%10;

				if(firstDigit != middelDigit && middelDigit != lastDigit && lastDigit != firstDigit)
				{
					System.out.println("Number is Distinct !!");
				}
				else 
				{
					System.out.println("Number is Not Distinct !!");
				}	
			}
			else 
			{
				System.out.println("Number is Not 3 Digit !!");
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}