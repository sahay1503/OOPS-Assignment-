//Take two int values from user and print greatest among them.
import java.util.*;
public class Pr2 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=a>b?a:b;
        System.out.println("Greatest number is:"+c);
    }
    
}
