import java.util.*;
class Cbc{
public static void main(String[]args){
Scanner scan=new Scanner(System.in);
int n=scan.nextInt();
int s=scan.nextInt();
for(int i=1;i<=n;i++){
for(int t=1;t<=i;t++)
System.out.print(s);
s++;
System.out.println();
}
for(int i=n;i>=1;i--){
for(int j=1;j<=i;j++){
System.out.print(s-1);
}
s--;
System.out.println();
}
}
}