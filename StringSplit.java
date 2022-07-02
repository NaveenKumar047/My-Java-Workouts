import java.util.*;
import java.io.*;
import java.lang.*;
class StringSplit{
public static String stringrev(String s,int a,int b){
	String x[]=s.split(" ");
	String temp1=x[a-1];
	String temp2=x[b-1];
	int len1=temp1.length()/2;
	int len2=temp2.length()/2;
	StringBuilder input1 = new StringBuilder(); 
	StringBuilder input2=new StringBuilder();
	String ans=temp1.substring(0,len1);
	String ans1=temp2.substring(len2,temp2.length());
	input1.append(ans);
	input2.append(ans1);
	input1=input1.reverse();
	input2=input2.reverse();
	String rev=input1.toString().toUpperCase();
	String rev1=input2.toString().toUpperCase();
                  x[a-1]=rev+temp1.substring(len1);
                  x[b-1]=rev1+temp1.substring(len2);
                  String an=x.toString();
	return an;
	}
public static void main(String[] args){
	Scanner x=new Scanner(System.in);
	String s=x.nextLine();
	int a=x.nextInt();
	int b=x.nextInt();
	System.out.println(stringrev(s,a,b));
}
}
