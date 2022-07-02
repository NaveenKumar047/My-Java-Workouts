import java.util.Scanner;
import java.util.*;

public class discount {
    public static void main(String args[] ) throws Exception {
        /* Do not alter code in main method */
       Shirt[] shirts = new Shirt[5];
        
        Scanner sc = new Scanner(System.in);
        
        for(int i = 0;i<5;i++)
        {
            int tag = sc.nextInt();sc.nextLine();
            String brand = sc.nextLine();
            double price = sc.nextDouble();sc.nextLine();
            char g = sc.nextLine().charAt(0);
            shirts[i] = new Shirt(tag,brand,price,g);
        }
        
        
       
        double price = sc.nextDouble();
        
        for(Shirt s: shirts)
        {
            System.out.println(getDiscountPrice(s));            
        }
        
        Shirt[] result = getShirtWithMoreThanSpecificPrice(shirts,price);
        
        for(Shirt s: result)
        {
            System.out.println(s.getTag()+" "+s.getPrice()+ " " + s.getBrand());
        }
    }
    
    /* implement your methods here*/
    public static double getDiscountPrice(Shirt s){
        double d=1;
        if(s.gender=='m')
        d=s.price-(s.price*10/100);
        else if(s.gender=='f')
        d=s.price-(s.price*20/100);
        else 
        d=s.price-(s.price*30/100);
        return d;    
    }
    public static Shirt[] getShirtWithMoreThanSpecificPrice(Shirt[] shirts,double price){
     Arrays.sort(shirts);
     int j=0;
     for(int i=0;i<5;i++){
         if(shirts[i].price>price)
             j++;
     }
     Shirt[] s=new Shirt[j];
     j=0;
     for(int i=0;i<5;i++){
         if(shirts[i].price>price)
             {
                 s[j]=shirts[i];
                 j++;
                 }
     }
     return s;
    }
}

class Shirt implements Comparable<Shirt>
{
    //define the class as per details shared in the question
    int tag;
    String brand;
    double price;
    char gender;
    Shirt(){}
    Shirt(int t,String b,double p,char g){
        this.tag=t;
        this.brand=b;
        this.price=p;
        this.gender=g;
    }
    int getTag(){
        return tag;
    }
    double getPrice(){
        return price;
    }
    String getBrand(){
        return brand;
    }
    @Override
    public int compareTo(Shirt s){
       // return tag-s.tag; 
return Double.compare(price, s.price);
    }