import java.util.Scanner;
public class Switch{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Please input a number between 1-7");
        int day=sc.nextInt();
//Test Switch
        String weekday="";
        switch(day){
            default:
            weekday="The number should be a interger number of 1-7";
            break;       
        case 1:
            weekday="Monday";
            break;
        case 2:
            weekday="Tuesday";
            break;
        case 3:
            weekday="Wednesday";
            break;
        }
    System.out.println(weekday);
    } 
}