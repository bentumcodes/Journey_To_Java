import java.lang.*;
import java.util.*;

public class Caller
{
	public static void main(String args[])
	{
		String name;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your name: ");
		name = sc.nextLine();
		System.out.println("Hey! "+name);
	}
}