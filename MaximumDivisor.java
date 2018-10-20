import java.util.Scanner;
public class MaximumDivisor{
    public static void main(String[] args){
        System.out.println("Please input two interger numbers");
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        System.out.println(Divisor(num1,num2));
        
    }
    public static int Divisor(int num1, int num2){
        int n1=num1,n2=num2;
        int product=1;
        int i=Math.min(n1,n2);
        while(i>1){
        int divisor=(int)Math.min(n1,n2);
            if(n1%i==0&&n2%i==0){
                n1/=i;
                n2/=i;
                product*=i;
                i=(int)Math.min(n1,n2);
            }
            else{
                i--;
            }
        }
        if(product!=1){
        return product*n1*n2;            
        }else{
        return 1;
        }
        
    }

}