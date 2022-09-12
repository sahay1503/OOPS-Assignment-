//Modify the above question to allow student to sit if he/she has medical cause. Ask user if he/she has medical cause or not ( 'Y' or 'N' ) and print accordingly.

import java.util.*;
class Pr9{
    public static void main(String[] arg){
         Scanner sc= new Scanner(System.in);
        System.out.print("Class Held");
        int x =sc.nextInt();
        System.out.print("Class Attended");
        int y =sc.nextInt();
        System.out.print("press one of these (y/Y) for medical");
        char a = sc.next().charAt(0);
        Float z = (float) y/x;
        //System.out.print(z);

        if (z>= 0.75){
            System.out.print("Allowed and  your Attendence:" + z*100);

        }
        else{
            if(a == 'Y' || a == 'y'){
                System.out.print("Allowed because of medical reason");
            }
            else{
            System.out.print("Not Allowed and your Attendence:" + z*100);
            }
        }
       
        



    }
}