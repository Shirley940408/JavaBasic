public class GetClass{
    public static void main(String[] args){
        Animal c=new Cat();
        Animal d=new Dog();
        System.out.println(isDog(d));
        System.out.println(isCat(c));
    }
    public static boolean isDog(Animal ani){
        if(ani instanceof Dog){
            return true;
        }else{
            return false;
        }
    }
    public static boolean isCat(Animal ani){
        Dog d=new Dog();
        if(ani.getClass()!=d.getClass()){
            return true;
        }else{
            return false;
        }
    }
}
class Animal{

}
class Dog extends Animal{

}
class Cat extends Animal{
    
}