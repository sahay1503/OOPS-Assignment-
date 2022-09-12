import java.util.*;
class Pr7{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no");
        int a= sc.nextInt();
        if (a<0){
            a= (-1)*a;
            System.out.print(a);

        }
        else{
            System.out.println(a);

        }
    }
}