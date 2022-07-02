import java.util.*;
class Abc{
public static void main(String[]args){
Scanner scan=new Scanner(System.in);
System.out.println("enter:");
int n=scan.nextInt();
int nave[]=new int[n];
for(int t=0;t<n;t++){
nave[t]=scan.nextInt();
}
for(int i=0;i<=n-1;i++){

System.out.print(nave[i]);
}
}
}

