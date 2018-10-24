public class StringMethods{
    public static void main(String[] args){
        //general constructor method
        //1.
        String s1="abc";
        //2.
        String s2=new String("abc");
        //3.
        byte[] bytes={97,98,99,100};
        String s3=new String(bytes);
        System.out.println(s3);
        //abcd String already override the toString() method;
        //4.
        String s4=new String(bytes,1,2);
        System.out.println(s4);
        //5.
        char[] c1={'H','e','l','l','o',' ','W','o','r','l','d'};
        String s5=new String(c1);
        System.out.println(s5);
        //6.
        String s6=new String(c1,2,2);
        System.out.println(s6);

        String str="abcd1234";
        System.out.println("substring \t"+str.substring(4));
        System.out.println("toUpperCase: \t"+str.toUpperCase());
        System.out.println("str:\t"+str);
        System.out.println("startsWith: \t"+str.startsWith("abcd"));
        System.out.println("indexOf: \t"+str.indexOf("1234"));
        System.out.println("equals: \t"+str.equalsIgnoreCase("ABCD1234"));
        System.out.println("length: \t"+str.length());

    }
}