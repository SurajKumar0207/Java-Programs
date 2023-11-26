package GDB;

import java.util.*;
public class RupeesInWords
{
    public static Scanner sc=new Scanner(System.in);
    public static final String[][] rupees={{"","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"},
            {"","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"},
            {"","Ten","Twenty","Thirty","Fourty","Fifty","Sixty","Seventy","Eighty","Ninety"},
            {"","Hundred","Thousand","Thousand","Lakh"}};
    public static String word="";
    
    public static String inWords(int rup) {
        
        if(rup>=100000) {
            int arr=rup/100000;
            rup=rup%100000;
            word+=rupees[0][arr]+" "+rupees[3][4]+" ";
            if(rup==0)
                return word;
        }
        if(rup>=10000) {
            word=tenThousand(rup);
            rup=rup%1000;
            if(rup==0)
                return word;
        }
        if(rup>=1000) {
            int arr=rup/1000;
            rup=rup%1000;
            word+=rupees[0][arr]+" "+rupees[3][2]+" ";
            if(rup==0)
                return word;
        }
        if(rup>=100) {
            int arr=rup/100;
            rup=rup%100;
            word+=rupees[0][arr]+" "+rupees[3][1]+" ";
            if(rup==0)
                return word;
        }
        if(rup>=10) {
            
            if(rup>10 && rup<20) {
                rup=rup%10;
                word+=rupees[1][rup]+" ";
                return word;
            }
            else if(rup>9) {
                int arr=rup/10;
                rup=rup%10;
                word+=rupees[2][arr]+" ";
            }
            if(rup==0)
                return word;
        }
        if(rup>0) {
            word+=rupees[0][rup];
        }
        
        return word;
    }
    
    public static String tenThousand(int rup) {
        int ten=rup/1000;
        int rem=ten%10;
        ten=ten/10;
        if(ten==1 && rem!=0)
            word+=rupees[1][rem]+" "+rupees[3][3]+" ";
        else
            word+=rupees[2][ten]+" "+rupees[0][rem]+" "+rupees[3][3]+" ";
        return word;
    }
    
	public static void main(String[] args) {
        System.out.print("Enter Amount in Number : ");
	    int rup=sc.nextInt();
        int k=(int)(Math.log(rup)/Math.log(10))+1;
	    String word=inWords(rup);
	    System.out.println(word);
	}
}