import java.util.Scanner;


class Codechef
{
	public static void main (String[] args)
	{
		// your code goes here
		Scanner read = new Scanner(System.in);
		int z = read.nextInt();
		int x = read.nextInt();
		int c = read.nextInt();
        if (c>x || c>z){
            System.out.println("PASS");
        }
        else{
            System.out.println("FAIL");
        }
	}
}

