package GDB;

import java.util.*;
public class SubValidParenthesis
{
	//{[])()
	static String sn="";
	static int cou=0;
	static List<Character> li=new ArrayList<>();
	static List<String> lis=new ArrayList<>();
	public static void reducedParenthesis(String s)
	{
	    int len=s.length();
	   
        sn=check(s,len);
        if(sn.isEmpty())
            return;
        else
            lis.add(sn);
	    sn="";
	    li.clear();
	}
	public static String check(String s,int len) {
	    int rot=len;
	    String f=""; String l="";
	    for(int i=0;i<len/2;i++) {
	        char c= s.charAt(i);  char ch=s.charAt(rot-i-1) ;
	        if(c=='[' && (ch==']')) {
	            f=f+c;
	            l=ch+l;
	        }
	        else if(c=='(' && (ch==')')) {
	            f=f+c;
	            l=ch+l;
	        }
	        else if(c=='{' &&  (ch=='}')) {
	            f=f+c;
	            l=ch+l;
	        }
	    }
	    
	    return f+l;
	}
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.print("Give Input : ");
		String s=sc.next();
		for(int i=0;i<s.length();i++)
		{
		    char c=s.charAt(i);
		    if(li.isEmpty() && (c=='}' || c==']' || c==')')) {
		        continue;
		    }
		    else if(c=='[' || c=='{' || c=='(') {
		        li.add(c);
		        sn=sn+c;
		        cou++;
		    }
		    else if(c==']' || c=='}' || c==')') {
		        sn=sn+c;
		        cou--;
		        if(cou==0) {
		            reducedParenthesis(sn);
		        }
		    }
	    }
	    for(String list:lis) {
	        System.out.print(list+" ");
	    }
	}
}