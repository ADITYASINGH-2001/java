import java.util.Scanner;


class Codechef
{
	public static void main (String[] args)
	{
		// your code goes here
		Scanner read = new Scanner(System.in);
		int b = read.nextInt();
		int r = read.nextInt();
		if(r > b){
		    System.out.print("Rob scored higher marks than Bob");
		}
		else if(r == b){
		    System.out.print("Bob & Rob both scored the same");
		}
		
	}
}
