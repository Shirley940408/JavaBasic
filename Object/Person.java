public class Person{
    public static void main(String[] args){
        //int i=1;
        MyInteger i=new MyInteger(1);
        //Integer i=10;
        Integer j=2;
        //final int i=1;
        change1(i);
        change2(j);
        System.out.println("Address of j in main function: "+System.identityHashCode(j));
        System.out.println("Address of i in main function: "+i);
        System.out.println("Value of i in main function: "+i.getInteger());

    }

    public static void change1(MyInteger i){
        i=new MyInteger(3);
        System.out.println("Change1() Output");
        System.out.println(i);
        System.out.println(i.getInteger());
        //return i;
    }
    public static void change2(Integer i){
        System.out.println("Change2() Output before changing i");
        System.out.println(System.identityHashCode(i));
        i=5;
        System.out.println("Change2() Output after changing i");
        System.out.println(i);
        System.out.println(i.getClass());
        System.out.println(System.identityHashCode(i));
        i=4;
        System.out.println(i);
        System.out.println(i.getClass());
        System.out.println(System.identityHashCode(i));        
        //System.out.println(i.getInteger());
        //return i;
    }

}
class MyInteger{
    public final int i;
    public MyInteger(int i){
    this.i=i;
    //return i;
    }
    public int getInteger(){
        return this.i;
    }
}
