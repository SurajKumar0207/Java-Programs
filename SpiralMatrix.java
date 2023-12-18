package javaPrograms;

public class SpiralMatrix
{
    // 2D Array
    static java.util.Scanner sc=new java.util.Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Hello World");
		int n=sc.nextInt();
		int r1=0;
		int c1=0;  // OR =r1
		int r2=n-1;
		int c2=n-1;  // OR =r2
		int c=0;
		int a[][]=new int[n][n];
		//while(r1<=r2 && c1<=c2)
		        // OR (n>1) 
		while(n>1)
		{
		    
    		for(int i=r1;i<=c2;i++)
    		{
    		    c++;
    		    a[r1][i]=c;
    		}
    		r1++;
    		for(int i=r1;i<=c2;i++)
    		{
    		    c++;
    		    a[i][c2]=c;
    		}
    		c2--;
    		for(int i=c2;i>=c1;i--)
    		{
    		    c++;
    		    a[r2][i]=c;
    		}
    		r2--;
    		for(int i=r2;i>=r1;i--)
    		{
    		    c++;
    		    a[i][c1]=c;
    		}
    		c1++;
    		n--;
		}
		for(int k[]:a)
		{
		    for( int h:k)
		    {
		        if(h<10)
		        System.out.print(0);
		        System.out.print(h+" ");
		    }
		    System.out.println();
		}
	}
}