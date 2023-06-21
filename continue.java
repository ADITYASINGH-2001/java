import java.util.Scanner;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner read = new Scanner(System.in);
		int n= read.nextInt();
		for(int i = 0; i <= 20; i++){
		    if(i == n){
		        continue;
		    }
		    System.out.println(i);
		}
	}
}