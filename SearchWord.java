import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SearchWord {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner x=new Scanner(System.in);
        int id;
        String title,author;
        double price;
        Book[] b=new Book[4];
        for(int i=0;i<4;i++){
            id=x.nextInt();
            x.nextLine();
            title=x.nextLine();
            author=x.nextLine();
            price=x.nextDouble();
            b[i]=new Book(id,title,author,price);
        }
        String key=x.next();
        Book[] res=searchTitle(b,key);
        for(int i=0;i<4 && res[i]!=null;i++){
            System.out.println(res[i].id);
        }
    }
    public static Book[] searchTitle(Book[] b,String key){
        int j=0;
        Book ans[]=new Book[4];
        for(int i=0;i<4;i++){
                if((b[i].title.toLowerCase()).contains(key.toLowerCase())){
                   ans[j]=b[i];
                   j++;
                }
            }
        return ans;
    }
}

class Book
{
    int id;
    String title,author;
    double price;
    Book(int id,String title,String author,double price){
        this.id=id;
        this.title=title;
        this.author=author;
        this.price=price;
    }
    
}