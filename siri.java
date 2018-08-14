/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int n,s;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		s=n%7;
		if(s==0)
		{
			System.out.print("yes");
		}
		else
		{
			System.out.print("no");
		}// your code goes here
	}
}
