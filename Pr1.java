//Take values of length and breadth of a rectangle from user and check if it is square or not.
import java.util.*;
public class Pr1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int l=sc.nextInt();
        int b=sc.nextInt();
        if(l==b){
            System.out.println("It is a Square");
        }else{
            System.out.println("Not a Square");
        }

    }

    
}
