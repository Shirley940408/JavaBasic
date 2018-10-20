import java.util.Scanner;
public class Scanners{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Please input your age");
        int age=sc.nextInt();
        System.out.println(age);
        System.out.println("Please introduce yourself");
        String intro=sc.next();
        System.out.println(intro);
    }
}