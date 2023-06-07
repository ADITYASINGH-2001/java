import java.util.Scanner;


class Codechef
{
	public static void main (String[] args)
	{
		// your code goes here
		Scanner read = new Scanner(System.in);
		int x = read.nextInt();
		if(x <70){
		    System.out.println("Order Confirmed");
		}
		else{
		    System.out.println("Order Limit reached");
		}
		System.out.print("Thank YOU!");

	}
}