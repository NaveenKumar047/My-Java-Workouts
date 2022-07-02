import java.util.*;
class StringTriangle{
public static void main(String[] args){
Scanner x=new Scanner(System.in);
String s=x.nextLine();
char c[]=s.toCharArray();
if(c.length%2==0)
System.out.println("EVEN");
else
for(int i=0;i<c.length;i++){
for(int j=c.length;i<j-1;j--)
System.out.print(" ");
for(int k=c.length/2;k<i+c.length/2+1;k++){
if(c.length>k)
System.out.print(c[k]);
else
System.out.print(c[k-c.length]);
}
System.out.println();
}
}
}