package javaPrograms;

import java.util.*;
public class RotationSortArray
{
    // Check Whether it is possible to Sort the Array by Rotation.

    public static void sortArray(int a[]) {
        int count=0;
        int n=a.length;
        for(int i=0;i<n;i++) {
            int j;
            for(j=0;j<n-1;j++) {
                if(a[j]>a[j+1])
                {
                    count++;
                    break;   
                }
            }
            if(j==n-1) {
                break;
            }
            int temp=a[0];
            for(int k=0;k<n-1;k++) {
                a[k]=a[k+1];
            }
            a[n-1]=temp;
            //System.out.println(Arrays.toString(a)+" "+count);
        }
        if(count==0)
        System.out.println("Array is already sorted");
        else if(count>=n)
        System.out.println("It is Not possible");
        else
        System.out.println("Array is sorted & rotations : "+count+" -- "+Arrays.toString(a));
        //System.out.println(Arrays.toString(a)+" "+count);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Give array size : ");
        int n=sc.nextInt();
        int a[]=new int[n];
        //int a[]={2,3,4,5,1};
        System.out.println("Enter array elements");
        for(int i=0;i<n;i++) {
            a[i]=sc.nextInt();
        }
        sortArray(a);
        sc.close();
    }
}