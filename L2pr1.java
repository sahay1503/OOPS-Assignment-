/*LEVEL 2 QUESTION 1:.Write a program to check if a year is leap year or not.If a year is divisible by 4 
then it is leap year but if the year is century year like 2000, 1900, 2100 then it must be divisible by 400.*/
import java.util.*;
class L2pr1{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();
        String year= y%400 ==0 || (y%4 == 0 && y % 100 !=0) ? " A leap year":"not a leap year" ;
        System.out.print(year);
    }
}