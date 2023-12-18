package javaPrograms;

    //  KITE SHAPED PATTERN
import java.util.*;
public class KitePattern
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		        // HEAD
		for(int i=0;i<n;i++)
		{
		    for(int j=0;j<n;j++)
		    {
		      if(n-i-1==j || j==n-1 || i==n-1)
		      System.out.print("* ");
		      else
		      System.out.print("  ");
		    }
		    for(int j=1;j<n;j++)
		    {
		      if(i==j || i==n-1)
		      System.out.print("* ");
		      else 
		      System.out.print("  ");
		    }
		    System.out.println();
		}
		     // BODY
		for(int i=1;i<n;i++)
		{
		    for(int j=0;j<n;j++)
		    {
		      if(i==j)
		      System.out.print("* ");
		      else
		      System.out.print("  ");
		    }
		    for(int j=2;j<n;j++)
		    {
		        if(j==n-i)
		        System.out.print("* ");
		        else
		        System.out.print("  ");
		    }
		    System.out.println();
		}
        // Tail
		for(int i=0;i<n/2;i++)
		{
		    for(int j=0;j<n;j++)
		    {
		        if(j>=n-i-2)
		        System.out.print("* ");
		        else
		        System.out.print("  ");
		    }
		    for(int j=0;j<n;j++)
		    {
		        if(j<=i)
		        System.out.print("* ");
		        if(i==n/2-2 && j==n-1)
		        System.out.print("  -----ART BY MYSELF-----");
		    }
		    System.out.println();
		}
	}
}