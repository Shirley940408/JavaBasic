import java.util.Scanner;
public class TenToSixteen{
    public static void main(String[] args){
       System.out.println("please input a number in decimal");
       Scanner sc=new Scanner(System.in);
       int number=sc.nextInt();
       System.out.println(revert(number));
    }

    public static String revert(int num){
        String inversion="";
        String res;
        String reverse;
      while(num!=0){       
        res=numberToWord(num%16);
        inversion+=res;
        num/=16;
      }
      reverse=new StringBuffer(inversion).reverse().toString();
      return reverse;
    }

    public static String numberToWord(int ans){
        String result;
        switch(ans){
          default:
          result=ans+"";
          break;
          case 10:
          result="A";
          break;
          case 11:
          result="B";
          break;
          case 12:
          result="C";
          break;
          case 13:
          result="D";
          break;
          case 14:
          result="E";
          break;
          case 15:
          result="F";
          break;
        }
        return result;        
    }
}