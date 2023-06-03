import java.util.Scanner;

class Codechef
{
	public static void main (String[] args)
	{
		// your code goes here
		Scanner read = new Scanner(System.in);
		int a = read.nextInt();
		int b = read.nextInt();
        if (a!=b&&a>b){
            System.out.println("Both a and b are distinct integers");
        }
        else{
            System.out.println("Error 404");
        }
	}
}

