import java.util.*;
class interfac{
public static void main(String[] args){
Scanner x=new Scanner(System.in);
book b1=new book();
b1.setid(x.nextInt());
x.nextLine();
String s=x.nextLine();
book b2=new book(b1.getid(),s);
System.out.print(b1.getid()+" "+b2.id+" "+b2.title);
}
}
class book{

int id;
String title;
book(){
}
int getid(){
return id;
}
void setid(int id){
this.id=id;
}
String title(){
return title;
}
void settitle(String s){
this.title=s;
}
book(int id,String title){
this.id=id;
this.title=title;
}
}