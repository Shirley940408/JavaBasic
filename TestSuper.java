public class TestSuper{
    public static void main(String[] args){
        Sub s= new Sub();
        //s.print();
    }
}
class Super{
    // int a=10;

    // public void m1(){
    //     System.out.println(a);
    // }
    String gender;
    public Super(){

    }
    public Super(String gender){
        this.gender=gender;
    }
}
class Sub extends Super{
    //int a=20;
    public Sub(){
        // System.out.println(super.a);
        // super.m1();
        //super();
    }
}