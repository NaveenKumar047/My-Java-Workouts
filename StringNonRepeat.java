import java.util.*;
class StringNonRepeat{
public static void main(String[] args){
Scanner x=new Scanner(System.in);
String s=x.nextLine();
char c[]=s.toCharArray();
int flag[]=new int[c.length];
for(int i=0;i<c.length;i++){
for(int j=i+1;j<c.length;j++){
if((int)c[i]==(int)c[j])
break;
else if(j==c.length-1){
flag[i]=1;
break;}
else
continue;
}
if(flag[i]==1){
System.out.print(c[i]);
break;
}
}
for(int i=0;i<c.length;i++){
if(flag[i]==0){
if(i==c.length-1){
System.out.println("");
}
else
continue;
}
}
}
}