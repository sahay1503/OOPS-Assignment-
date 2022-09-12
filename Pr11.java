/*Write a program to check whether a entered character is lowercase ( a to z ) or uppercase ( A to Z ).*/
import java.util.*;

public class Pr11{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter character: ");
        char ch = sc.next().charAt(0);

        if(ch >= 'A' && ch <= 'Z') {

            System.out.println(ch + " is UPPERCASE");

        } else if(ch >= 'a' && ch <= 'z') {

            System.out.println(ch + " is LOWERCASE");

        } else {
            
             System.out.println(ch + " is not an alphabet");
        }
    }
}