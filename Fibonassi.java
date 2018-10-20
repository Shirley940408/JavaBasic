public class Fibonassi{
    public static void main(String[] args){
    System.out.println(fibonassi());
    }
    public static String fibonassi(){
        int x=1, y=1;
        int sum;
        String str=1+" "+1+" ";
        for(int i=0;i<6;i++){
            sum=x+y;
            x=y;
            y=sum;
            str+=sum+" ";
        }
        return str;
    }
}