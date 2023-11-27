package javaPrograms;
import java.util.*;
public class Long2SubString
{
    // Longest SubString comparing between Two Variables

    public static void longSubString(String s,String ss) {
        String sub="";  int max=0;
		int sl=s.length();  int ssl=ss.length();
		for(int i=0;i<ssl;i++) {
		    if(s.contains(ss.substring(i,i+1))) {
		        int len=ssl;
		        for(int j=i;j<len;  ) {
    		        String news=ss.substring(j,len);
    		        if(s.contains(news)) {
    		            if(news.length()>max) {
    		                sub=news;
    		                max=sub.length();
    		            }
    		        }
    		        len--;
    		        if(len<=j)
    		            break;
    		    }
		        
		    }
		    
		}
		System.out.println("SubString : "+sub+" and its length : "+max);	
    }
    
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String ss=sc.next();
		longSubString(s, ss);
		sc.close();
	}
}
