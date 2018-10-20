public class Poly{
    public static void main(String[] args){
        Animal a =new Dog();//target to child object
        a.eat();
        a.sleep();//The method in child class will override the method in parents class.
        //wrong programming:a.call();polymorphism only allow to use the methods in parents class.
        
    }
}

class Animal{
    public void eat(){
        System.out.println("Eat food");
    }
    public void sleep(){
        System.out.println("Sleep 8 hours");
    }
}
class Dog extends Animal{
    public void sleep(){
        System.out.println("Sleep 6 hours");
    }
    public void call(){
        System.out.println("call...");
    }
}
