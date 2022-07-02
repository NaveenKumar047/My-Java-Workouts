import java.util.*;
class StringSearch{
public static void main(String[] args){
Scanner x=new Scanner(System.in);
String a[]={"sherlock","holmes","moriarty","watson"};
System.out.println("Enter the string name");
String s=x.nextLine();
for(int i=0;i<=3;i++){
if(a[i].equals(s))
{System.out.println("String Available");
break;}
else if(i==3)
System.out.println("String Not available");}
}}