//A shop will give discount of 10% if the cost of purchased quantity is more than 1000.Ask user for quantity.
//Suppose, one unit will cost 100.Judge and print total cost for user.
import java.util.*;
public class Pr3 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int q=sc.nextInt();
        double cost=q*100;
        if(cost<=1000){
            System.out.println(cost);
        }else{
            double dis=q*100*0.1;
            cost=cost-dis;

            System.out.println(cost);
        }
    }
}
