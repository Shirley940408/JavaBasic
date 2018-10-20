import java.util.Scanner;
public class Narcis{
    public static void main(String[] args){
       Scanner sc= new Scanner(System.in);
       System.out.println("Please input a 3 bit number");
       int num=number;
       int sum=0;
       for(int i=0;i<3;i++){
           int temp=num%10;
           sum+=(int)Math.pow(temp,3);
           num/=10;
       }
       if(sum==number){
        System.out.println("Yes, it is a narcissistic number");
       }else{
        System.out.println("No, it is not");
       }
    }
}