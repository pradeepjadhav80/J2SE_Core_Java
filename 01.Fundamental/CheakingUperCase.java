import java.util.*;


public class CheakingUperCase
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the Character : ");
		char ch = sc.next().charAt(0);

		if(Character.isUpperCase(ch))
		{
			System.out.println("Uper case !!");
		}
		else if(Character.isLowerCase(ch))
		{
			System.out.println("Lower Case !!");
		}
		else if(Character.isDigit(ch))
		{
			System.out.println("Digit !!");
		}
		else 
		{
			System.out.println("special character !!");
		}
	}
}