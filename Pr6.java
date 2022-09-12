/*Take input of age of 3 people by user and determine oldest and youngest among them*/
import java.util.*;
class Pr6{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age of P1");
        int p1= sc.nextInt();

        System.out.print("Enter age of P2");
        int p2= sc.nextInt();

        System.out.print("Enter age of P3");
        int p3= sc.nextInt();

        if (p1>p2){
            if (p1>p3){
                System.out.println(p1);
            }
            else{
                System.out.println(p3);

            }
        }
        else{
            if (p2>p3){
                System.out.println(p2);
                
            }
            else{
                System.out.println(p3);
            }
        }

    }
}