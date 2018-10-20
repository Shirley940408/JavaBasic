import java.util.Scanner;
public class TestOperator{
    public static void main(String[] args) {
        int a=10;
        int b=20;
        //boolean
        System.out.println(b==a);
               
        System.out.println("Please input a year");
        Scanner sc =new Scanner(System.in); 
        int year=sc.nextInt();
        //leap year?
        if(((year%4==0)&&(year%100!=0))||(year%400==0)){
          System.out.println("Yes, it is a leap year.");
        }else{
          System.out.println("No, it is not.");
        }
        //if...elseif...else
        System.out.println("Please input a bumber");
        int num= sc.nextInt();
        if(num>0){
          System.out.println(num+" is a positive number");
        }else if(num==0){
          System.out.println(num+" is zero");
        }else{
          System.out.println(num+" is a negative number");
        }
    }   
}
    