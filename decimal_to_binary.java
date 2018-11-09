import java.util.*;
import java.lang.*;
import java.io.*;

class Decima_to_binary
{
	public static void main (String[] args) throws java.lang.Exception
	{
	
		Scanner sc = new Scanner(System.in);
		int i=0,a,b=0,no;
		System.out.println("Enter the number : ");
		no = sc.nextInt();
		while(no>0)
		{
			a = no%2;
			no = no/2;
			b = b +a*(int)Math.pow(10,i);
			i++;
		
		}
		System.out.println(b);
	}
}
