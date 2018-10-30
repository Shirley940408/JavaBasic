public class StringCombine{
    public static void main(String[] args){
        StringBuffer buffer=new StringBuffer();
        //StringBuffer buffer=new StringBuffer(300);Predict the String length before could improve the efficiency.
        for (int i=0;i<100;i++){
            buffer.append(i);
        }
        System.out.println(buffer);
        StringBuffer buffer2=new StringBuffer("Hello");
        buffer2.append(" World!");
        System.out.println(buffer2);
    }
}