import java.util.*;
class Pr5{
    public static void main(String[] arg){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the marks of student--");
        Float gr = sc.nextFloat();
/*GRADE SYSTEM:
 Below 25 - F Grade
 25 to 45 - E Grade
 45 to 50 - D Grade
 50 to 60 - C Grade
 60 to 80 - B Grade
 Above 80 -A */

        if (gr<25){
            System.out.print("Grade-F");
        }
        else if (gr>=25 && gr<45 ){
            System.out.print("Grade-E");
        }
        else if (gr>=45 && gr<50 ){
            System.out.print("Grade-D");
        }
        else if (gr>=50 && gr<60 ){
            System.out.print("Grade-C");
        }
        else if (gr>=60 && gr<80 ){
            System.out.print("Grade-B");
        }
        else if (gr>=80 && gr<=100 ){
            System.out.print("Grade-A");
        }
        else{
            System.out.print("Enter the valid Marks");
        }
        }
    }