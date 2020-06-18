import java.util.*;
public class Main
{
  
	public static void main(String[] args) {
	    
	    Scanner sc=new Scanner(System.in);
		System.out.print(" Please give a number as 1st variable:");
		int a = sc.nextInt();
		System.out.print(" Please give a number as 2nd variable:");
		int b = sc.nextInt();
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println(" after swapping :");
		System.out.print(" The value of the 1st variable: "+a+"\n");
		System.out.print(" The value of the 2nd variable: "+b+"\n");

	}
}
