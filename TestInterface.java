public class TestInterface implements MyInterface{
    public static void main(String[] args){
        //This is polymorphic
        MyInterface t0=new TestInterface();
        t0.m1();
        TestInterface t1=new TestInterface();
        t1.m1();
    }
    @Override
    public void m1(){
        System.out.println("myClass.m1()");
    }
    @Override
    public void m2(){
        System.out.println("myClass.m2()");
    }

}