import java.util.*;
class StringNonRep{
public static void main(String[] args){
Scanner x=new Scanner(System.in);
String s=x.nextLine();
int flag=0;
for(int i=0;i<s.length() && flag==0;i++){
for(int j=i+1;j<s.length();j++){
if((int)s.charAt(i)==(int)s.charAt(j))
break;
else if(j==s.length()-1){
System.out.println(s.charAt(i));
flag=1;
break;
}
}
}
}
}
