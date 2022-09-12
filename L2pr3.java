/*LEVEL2 QUESTION 3:A 4 digit number is entered through keyboard. Write a program to print a new number with digits reversed as of orignal one. E.g.-
INPUT : 1234        OUTPUT : 4321
INPUT : 5982        OUTPUT : 2895*/
import java.util.*;
class L2pr3{
    public static void main(String[] arg)
    {Scanner sc = new Scanner(System.in); 
    System.out.print("Enter no to be reversed");
    int n = sc.nextInt();
    int rem =0;
    int rev=0;
    int c=0;
    while(n!=0){

    rem = n % 10;
    rev = rev * 10 + rem;
    n /= 10;
  }
     System.out.print(rev);
 }
}