package javaPrograms;

import java.util.Scanner;
public class RecursionFibonacci
{
    static Scanner sc= new Scanner(System.in);
    static void fibo(int a,int b,int n,int count)
    {
        if(count==n)
        {
            //System.out.print(a);
            return;
        }
        count++;
        System.out.print(a+"  ");
        //int c=a+b;
        a=a+b-(b=a);  // OR a=a+b;  b=a-b;
        b=a+b;
        fibo(a,b,n,count);
    }
	public static void main(String[] args) {
		System.out.println("Hello World");
		fibo(0,1,sc.nextInt(),0);
	}
}