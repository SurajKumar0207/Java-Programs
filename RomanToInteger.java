package javaPrograms;
import java.util.*;
public class RomanToInteger
{
    // Converting Roman to Integer  Input= uppercase String  &  Output=Integer

    public static int roman(String s) {
        int sum=0;
        for(int i=0;i<s.length();i++) {
            char c=s.charAt(i);
            if(c=='I') {
                sum++;
            }
            else if(c=='V') {
                if(i==0)
                    sum+=5;
                else if(s.charAt(i-1)!='I')
                    sum+=5;
                else
                    sum+=3;
            }
            else if(c=='X') {
                if(i==0)
                    sum+=10;
                else if(s.charAt(i-1)!='I')
                    sum+=10;
                else
                    sum+=8;
            }
            else if(c=='L') {
                if(i==0)
                    sum+=50;
                else if(s.charAt(i-1)!='X')
                    sum+=50;
                else
                    sum+=30;
            }
            else if(c=='C') {
                if(i==0)
                    sum+=100;
                else if(s.charAt(i-1)!='L')
                    sum+=100;
                else
                    sum+=80;
            }
            else if(c=='D') {
                if(i==0)
                    sum+=500;
                else if(s.charAt(i-1)!='X')
                    sum+=500;
                else
                    sum+=300;
            }
        }
        return sum;
    }
	public static void main(String[] args) {
        System.out.println("Enter Roman Value in UpperCase : ");
	    Scanner sc=new Scanner(System.in);
	    String s=sc.next();
	    System.out.println("Roman to Integer : "+roman(s));
	}
}
