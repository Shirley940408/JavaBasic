
public class Prime_Symmetry{
    public static void main(String[] args){
        int i=1;
        int n=0;
        boolean n1,n2;
        while(n<100){
            n1=Prime(i);
            n2=Symmetry(i);
            if(n1&&n2){
                System.out.print(i+" ");
                n++;
                if(n%5==0){
                    System.out.println();
                }
            }
            i++;
        }
    }
    public static boolean Prime(int num){
        int n=num-1;
        while(n>1){
            if(num%n==0){
                return false;
            }else{
                n--;
            }
        }
        return true;
    }
    public static boolean Symmetry(int num){
        int n=num;
        int sum=0;
        int res;
        while(n!=0){
            sum*=10;
            res=n%10;
            sum+=res;
            n/=10;
        }
        if(sum==num){
            return true;
        }else{
            return false;
        }
    }
}