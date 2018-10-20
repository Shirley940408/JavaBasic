public class Recursive{
    public static void main(String[] args){
       System.out.println(recursive(5));
    }
    public static int recursive(int n){
        if(n==1){
            return 1;
        }
        return n*recursive(n-1);
    }
}