package javaPrograms;

import java.util.*;
public class RecursionFactorial
{
     
    static Scanner sc=new Scanner(System.in);
    static int sum=1;
    static int fact(int n)
    {
        if(n==1 || n==0) {
            System.out.println(n);
        return 1;
        }
        
        int k= fact(n-1);       // OR simply write --> return n*fact(n-1);
        int t=n*k;
        System.out.println(n+"  "+k+"  "+t+"  n"); // I written these lines to understand recursive process
        return t;
    }
	public static void main(String[] args) {
		System.out.println("Hello World");
		int n=sc.nextInt();
		System.out.println(fact(n));
	}
}
