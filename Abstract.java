abstract class MyClass{
    int value;
    public abstract void test();
}

class MySubClass extends MyClass{
    public void test(){
        System.out.println("this is a test()");
    }
}
public class Abstract{
    public static void main(String[] args){
        MyClass m=new MySubClass();
        m.test();
    }
}