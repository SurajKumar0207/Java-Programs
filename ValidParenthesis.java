package javaPrograms;

import java.util.*;
public class ValidParenthesis
{
    // Check whether the given parenthesis is Balanced or Not
    // Input = String Ex: {}()[]
    static Scanner sc=new Scanner(System.in);
    boolean validParenthesis(String s)
    {
        Stack<Character> obj=new Stack<>();
        for(int i=0;i<s.length();i++)
        { 
            char ch=s.charAt(i);
            if(ch=='{' || ch=='[' || ch=='(') {
                obj.push(ch);
                continue;
            } 
            if(obj.isEmpty())
            return false;
                char re;
                switch(ch)
                {
                    case '}':
                      re=obj.pop();
                      if(re=='(' || re=='[')
                      return false;
                    break;
                    case ']':
                      re=obj.pop();
                      if(re=='(' || re=='{')
                      return false;
                      break;
                    case ')':
                      re=obj.pop();
                      if(re=='{'||re=='[')
                      return false;
                      break;
                }
        }
        return obj.isEmpty();
    }
	public static void main(String[] args) {
		ValidParenthesis obj=new ValidParenthesis();
        System.out.print("Give inputs : ");
		if(obj.validParenthesis(sc.next()))
        System.out.println("Balanced");
        else
        System.out.println("Not Balanced");
	}
}