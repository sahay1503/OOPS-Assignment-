/*A student will not be allowed to sit in exam if his/her attendence is less than 75%.
Take following input from user
Number of classes held
Number of classes attended.
And print
percentage of class attended
Is student is allowed to sit in exam or not.*/
import java.util.*;
class Pr8{
    public static void main(String[] arg){
        Scanner sc= new Scanner(System.in);
        System.out.print("CLasses Held:");
        int x =sc.nextInt();
        System.out.print("Classes Attended:");
        int y =sc.nextInt();

        Float z = (float) y/x;
        //System.out.print(z);

        if (z>= 0.75){
            System.out.print("Yes,Allowed and Attendence is" + z*100);

        }
        else{
            System.out.print("No, Not Allowed and Attendence is" + z*100);
        }
        


    }
}