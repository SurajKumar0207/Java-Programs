package javaPrograms;

//{[]()}({){}{][) => {[]()}{}
import java.util.*;
public class SubValidParenthesis
{
	
	public static void main(String[]args) {
	    Scanner sc=new Scanner(System.in);
	    String s=sc.next();
	    System.out.println(parenthesis(s));
	}
	
	static String parenthesis(String s) {
	    int len=s.length();
	    String ss=""; String s3="";
	    Stack<Character> st=new Stack<>();
	    for(int i=0;i<len;i++) {
	        char ch=s.charAt(i);
	        if(st.isEmpty() && (ch==']' || ch=='}' || ch==')'))
	            continue;
	        else if(ch=='{' || ch=='[' || ch=='(') {
	            st.push(ch);
	            ss+=ch;
	            continue;                                   //{[]()}({){}{][) => {[]()}{}
	        }
	        else if(ch=='}' || ch==']' || ch==')') {
	            st.pop();
	            ss+=ch;
	            if(st.isEmpty() || i==len-1) {
	                //System.out.println("SubPar => "+ss);
	                s3+=subParenthesis(ss);
	                ss="";
	            }
	        }
	    }
	    return s3;
	}
	static String subParenthesis(String ss) {
	     int len=ss.length();
	     String s1="", s2="", s3="";
	     Stack<Character> st=new Stack<>();
	     int c=0;
	     for(int i=0;i<len;i++) {
	        char ch=ss.charAt(i);
	        if(ch=='{' || ch=='[' || ch=='(') {
	            c=0;                                     
	            st.push(ch);                              
	        }
	        else if(ch=='}' || ch==']' || ch==')') {     
	            char pop=st.pop();
	            //System.out.println(pop+" "+ch);
	            c++;
	            if(pop=='{' && ch=='}') {
	                s1=pop+s1;
	                s2=s2+ch;
	                if(c>1) {
	                    s3=s1+s3+s2;
	                }
	                else {
	                    s3+=s1+s2;
	                }
	                s1=s2="";
	            }
	            else if(pop=='[' && ch==']') {
	                s1=pop+s1;
	                s2=s2+ch;
	                if(c>1) {
	                    s3=s1+s3+s2;
	                }
	                else {
	                    s3+=s1+s2;
	                }
	                s1=s2="";
	            }
	            else if(pop=='(' && ch==')') {
	                s1=pop+s1;
	                s2=s2+ch;
	                if(c>1) {
	                    s3=s1+s3+s2;
	                }
	                else {
	                    s3+=s1+s2;
	                }
	                s1=s2="";
	            }
	        } 
	     }
	     return s3;
	}
	
}