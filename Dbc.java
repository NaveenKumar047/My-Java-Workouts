import java.util.*;
class Dbc{
public static void main(String[]args){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
for(int i=0;i<=n;i++)
{
int flag=1;
for(int j=2;j<i;j++)
{
if(i%j!=0 )
System.out.print(i+",");
}
}
}
} 

