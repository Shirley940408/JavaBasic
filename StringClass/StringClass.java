public class StringClass{
    public static void main(String[] args){
        String s1="abc";
        System.out.println(System.identityHashCode("s1"));
        s1="def";
        System.out.println(System.identityHashCode("s1"));
        //----
        String s2="Hello";
        String s3="Hello";
        System.out.println(s2==s3);
        //----
        String s4=new String("abc");
        String s5=new String("abc");

        //"=="compares the address
        System.out.println(s4==s5);//false
        System.out.println(s4.equals(s5));//true,cause String Class already overload equals();

        String s6="aaa";
        String s7="bbb";
        String s8=s6+s7;

        String s9="abc";
        String s10="a";
        String s11="bc";
        String s12=s10+s11;

        System.out.println(s9==s12);//false;
        System.out.println(s9==("a"+"bc"));//true
        System.out.println(s9.equals(s12));//true
    }
}