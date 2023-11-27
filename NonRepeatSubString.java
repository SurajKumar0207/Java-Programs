package javaPrograms;

import java.util.*;
public class NonRepeatSubString
{
    // Non repeating SubString with its Size

    public static List<Object> subString(String s) {
        int max=0;
        String ss="";
        List<Character> charLi=new ArrayList<>();
        List<Object> newLi=new ArrayList<>();
        for(char c:s.toCharArray()) {
            
            if(charLi.contains(c)) {
                int ind=charLi.indexOf(c);
                for(int j=0;j<=ind;j++) {
                    charLi.remove(0);
                }
            }
            charLi.add(c);
            //max=Math.max(max,charLi.size());  OR
            if(max<charLi.size()) {
                ss="";
                for(char ch:charLi) {
                    ss+=ch;
                }
                max=charLi.size();
            }
        }
        //System.out.println(max+" "+ss);
        newLi.add(ss);  newLi.add(max);
        return newLi;
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		List<Object> li=subString(s);
		for(Object ob:li) {
		    System.out.print(ob+" ");
		}
	}
}
