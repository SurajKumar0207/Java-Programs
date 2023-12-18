package javaPrograms;

import java.util.*;
public class NonFibonacciPattern
{
    // Non-fibonacci values in Right angle triangle pattern
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of pattern :");
		int n=sc.nextInt();
		int count=0;
		for(int i=1;i<=n;i++)
		{
		    count+=i;
		}
		int arr[]=new int[count];
		int size=0;
		int a=3,b=5;
		l:
		for(int i=0; ;i++)
		{
		    int fib=a;
		    fib++;
		    while(fib<b)
		    {
		        if(size==count)
		        break l;
		        arr[size]=fib;
		        fib++;
		        size++;
		    }
		    int c=a+b;
		    a=b;
		    b=c;
		}
		size=0;
		for(int i=1;i<=n;i++)
		{
		    for(int j=1;j<=i;j++)
		    {
		        System.out.print(arr[size]+" ");
		        size++;
		    }
		    System.out.println();
		}
	}
}
