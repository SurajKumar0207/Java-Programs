package javaPrograms;

import java.util.*;
public class TwoDArray
{
    // Print the Highest Scorer Name And Score In Each and Every Match Separately after that Print
    // the Highest Individual Scorer in All Matches.
    // Note : Rows=Matches  and  Columns=Players
    
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter No. of rows : ");
		int m=sc.nextInt();
		System.out.print("Enter No. of columns : ");
		int n=sc.nextInt();
		int [][]arr=new int[m][n];
		System.out.println("Enter 2D Array Elements");
		for(int i=0;i<m;i++) {
		    for(int j=0;j<n;j++) {
		        arr[i][j]=sc.nextInt();
		    }
		}
		int nn=0;
		for(int i=0;i<m;i++)
		{
		    int max=0,num=0;
		    for(int j=0;j<n;j++)
		    {
		        num++;
		        if(arr[i][j]>max) {
		            max=arr[i][j];
		            nn=num;
		        }
		    }
		    System.out.println("Player"+nn+" - "+max);
		}
		int total=0;nn=0;int nnn=0;
		for(int i=0;i<n;i++)
		{
		    nnn++;
		    int sum=0;
		    for(int j=0;j<m;j++)
		    {
		        sum=sum+arr[j][i];
		    }
	        if(sum>total) {
	            total=sum;
	            nn=nnn;
	        }
		}
		System.out.println("Total Highest Scorer is Player"+nn+" - "+total);
	}
}

