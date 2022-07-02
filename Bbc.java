import java.util.*;
class Bbc{
public static void main(String[]args){
int num=1;
for(int n=0;n<=4;n++){
if((n+1)%2==0){
int temp=num+n+1;
for(int i=0;i<=n;i++)
{
System.out.print(num+n);
if(i<n)
System.out.print("*");
num--;
}
num=temp;
}
else{
for(int i=0;i<=n;i++)
{
System.out.print(num);
if(i<n)
System.out.print("*");
num++;
}
}
System.out.println();
}
}
}