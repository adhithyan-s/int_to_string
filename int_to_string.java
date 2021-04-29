import java.util.*;

public class int_to_string 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the integer : ");
		int n=sc.nextInt();
		String s=String.valueOf(n);
		if(n == Integer.parseInt(s)) System.out.println("Good job!");
		else System.out.println("Wrong answer!");
	}
}
