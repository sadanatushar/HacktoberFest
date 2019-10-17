/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s =new Scanner(System.in);
		int x=s.nextInt();
		float y=s.nextFloat();
		if ((x%5==0)&&(y>(x+0.50)))
		{
		    System.out.println(y-x-0.50);
		}
		else
		{
		    System.out.println(y);
		}
	}
}
