package GDB;

import java.util.*;
public class NearestFibonacci
{
	// Nearest fibonacci of each element in a Array

    public static void nearFibo(int[] arr) {
        int a=0,b=1,c;
		for(int i=0;i<arr.length;i++) {
		    int abc=arr[i];
		    if(abc==0) {
		        System.out.println(arr[i]+" : "+1);
		        continue;
		    }
		    if(abc==1) {
		        System.out.println(arr[i]+" : "+0+" "+2);
		        continue;
		    }
		    while(true) {
		        c=a+b;
		        if(abc>a && abc<c) {
		            if(abc==b) {
		                if(abc-a < c-abc)
		                    System.out.println(arr[i]+" : "+a);
		                else if(abc-a > c-abc)
		                    System.out.println(arr[i]+" : "+c);
		                else
		                    System.out.println(arr[i]+" : "+a+" "+c);
		            }
		            else if(abc<b) {
		                if(abc-a < b-abc)
		                    System.out.println(arr[i]+" : "+a);
		                else if(abc-a > b-abc)
		                    System.out.println(arr[i]+" : "+b);
		                else
		                    System.out.println(arr[i]+" : "+a+" "+b);
		            }
		            else {
		                if(abc-b < c-abc)
		                    System.out.println(arr[i]+" : "+b);
		                else if(abc-b > c-abc)
		                    System.out.println(arr[i]+" : "+c);
		                else
		                    System.out.println(arr[i]+" : "+b+" "+c);
		            }
		            break;
		        }
		        a=b;
		        b=c;
		    }
		}

    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter Array Size : ");
		int n=sc.nextInt();
		int arr[]=new int[n];
        System.out.println("Enter Array Elements : ");
		for(int i=0;i<n;i++) {
		    arr[i]=sc.nextInt();
		}
        nearFibo(arr);
		
	}
}
