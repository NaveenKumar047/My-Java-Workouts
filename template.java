import java.util.*;
import java.io.*;
class template{
static int n;
public static void main(String[] args){
Scanner x=new Scanner(System.in);
int price[]=new int[4];
String id[]=new String[4];
String title[]=new String[4];
String author[]=new String[4];
String key;
for(int i=0;i<4;i++){
id[i]=x.nextLine();
title[i]=x.nextLine();
author[i]=x.nextLine();
price[i]=x.nextInt();
x.nextLine();
}
key=x.nextLine();
book b[]=new book[4];
for(int i=0;i<4;i++){
b[i]=new book(id[i],title[i],author[i],price[i]);
}
book bh[]=search(b,key);
Arrays.sort(bh);
for(int i=0;i<n;i++){
if(i!=n-1){
System.out.println(bh[i].id+' '+bh[i].title+' '+bh[i].author+' '+bh[i].price);
}
else{
System.out.print(bh[i].id+' '+bh[i].title+' '+bh[i].author+' '+bh[i].price);
}
}
//sorted(bh);
}
public static book[] search(book b[],String id){
book bk[]=new book[4];
int j=0;
for(int i=0;i<4;i++){
if(id.equals(b[i].author))
{
bk[j]=b[i];
j++;}
n=j;
}
return bk;
}
public static void sorted(book b[]){
for(int i=0;i<n;i++){
	for(int j=i+1;j<n;j++){
		if(Integer.parseInt(b[i].id)>Integer.parseInt(b[j].id)){
			book t=b[i];
			b[i]=b[j];
			b[j]=t;
		}
	
	}
}
System.out.println("Sorted");
for(int i=0;i<n;i++){


if(i!=n-1){
System.out.println(b[i].id+' '+b[i].title+' '+b[i].author+' '+b[i].price);
}
else{
System.out.print(b[i].id+' '+b[i].title+' '+b[i].author+' '+b[i].price);
}
}
}
}
class book implements Comparable<book>{
int price;
String id,title,author;
book(String id,String title,String author,int price){
this.id=id;
this.title=title;
this.author=author;
this.price=price;
}

@Override
public int compareTo(book b){
	return Integer.parseInt(id)-Integer.parseInt(b.id);
}
}
